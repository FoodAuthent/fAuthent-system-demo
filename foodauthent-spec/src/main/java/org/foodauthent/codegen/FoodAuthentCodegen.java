package org.foodauthent.codegen;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenModelFactory;
import org.openapitools.codegen.CodegenModelType;
import org.openapitools.codegen.CodegenOperation;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.CodegenType;
import org.openapitools.codegen.SupportingFile;
import org.openapitools.codegen.languages.AbstractJavaCodegen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.responses.ApiResponse;

/**
 * TODO
 * 
 * @author Martin Horn, University of Konstanz
 */
public class FoodAuthentCodegen extends AbstractJavaCodegen {

	private static final String NAME_PLACEHOLDER = "##name##";

	static Logger LOGGER = LoggerFactory.getLogger(FoodAuthentCodegen.class);

	private final Map<String, String> m_tagDescriptions = new HashMap<String, String>();

    private final Map<String, List<Map<String, String>>> m_operationFaExceptions =
            new HashMap<String, List<Map<String, String>>>();

	private String m_apiTemplateFile;

	private String m_modelNamePattern;

	private String m_apiNamePattern;

	private String m_modelPropertyNamePattern;

	private String m_modelPropertyPackage;

	@Override
	public void processOpts() {
		super.processOpts();
		 
		setBooleanGetterPrefix("is");	

		apiTemplateFiles.clear();
		m_apiTemplateFile = getPropertyAsString("apiTemplateFile").orElse(null);
		if (m_apiTemplateFile != null) {
			apiTemplateFiles.put(m_apiTemplateFile, ".java");
		}
		modelTemplateFiles.clear();
		if (additionalProperties().get("modelTemplateFile") != null) {
			modelTemplateFiles.put(additionalProperties().get("modelTemplateFile").toString(), ".java");
		}
		apiTestTemplateFiles.clear();
		modelTestTemplateFiles.clear();
		apiDocTemplateFiles.clear();
		modelDocTemplateFiles.clear();

		// property options
		m_modelNamePattern = getPropertyAsString("modelNamePattern").orElse(null);
		m_apiNamePattern = getPropertyAsString("apiNamePattern").orElse(null);
		m_modelPropertyNamePattern = getPropertyAsString("modelPropertyNamePattern").orElse(null);
		m_modelPropertyPackage = getPropertyAsString("modelPropertyPackage").orElse(null);

		// supporting files
		getPropertyAsList("supportingFiles").ifPresent(l -> l.stream().forEach(sf -> {
			Map<String, Object> sfmap = (Map<String, Object>) sf;
			final String folder = (sourceFolder + '/' + sfmap.get("package").toString()).replace(".", "/");
			supportingFiles.add(new SupportingFile(sfmap.get("templateFile").toString(), folder,
					sfmap.get("destinationFileName").toString()));
			sfmap.keySet().forEach(k -> {
				additionalProperties.put(sfmap.get("templateFile").toString() + "#package",
						sfmap.get("package").toString());
			});
		}));
		try {
			additionalProperties.put("swagger-yaml",
					IOUtils.toString(new FileInputStream(getInputSpec()), Charset.defaultCharset()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Optional<String> getPropertyAsString(final String propName) {
		return Optional.ofNullable(additionalProperties().get(propName)).map(o -> o.toString());
	}

	private Optional<List<Object>> getPropertyAsList(final String propName) {
		return Optional.ofNullable(additionalProperties.get(propName)).map(o -> List.class.cast(o));
	}

	@Override
	public String getName() {
		return additionalProperties().get("codegenName").toString();
	}

	@Override
	public CodegenType getTag() {
		return CodegenType.OTHER;
	}

	@Override
	public String getHelp() {
		return "TODO";
	}

	@Override
	public void preprocessOpenAPI(final OpenAPI openAPI) {
		super.preprocessOpenAPI(openAPI);

        //extract and collect the fa-exceptions from responses for each operation individually
		//(for easier access the in the code templates later on)
        List<Operation> operations = openAPI.getPaths().values().stream().flatMap(
            pi -> Arrays.asList(pi.getGet(), pi.getPut(), pi.getPost(), pi.getDelete(), pi.getHead()).stream())
            .filter(o -> o != null).collect(Collectors.toList());
        operations.forEach(o -> {
            String operationId = o.getOperationId();
            for (Entry<String, ApiResponse> res : o.getResponses().entrySet()) {
                String code = res.getKey();
                Map<String, Object> extensions = res.getValue().getExtensions();
                if(extensions != null) {
                    List<Map<String, String>> faExceptions =
                        (List<Map<String, String>>)extensions.get("x-fa-exceptions");
                    if (faExceptions != null) {
                        faExceptions.forEach(e -> {
                            e.put("code", code);
                            if (!e.containsKey("description")) {
                                e.put("description", res.getValue().getDescription());
                            }
                            m_operationFaExceptions.computeIfAbsent(operationId, k -> new ArrayList<>()).add(e);
                        });
                    }
               }
            }

        });

        //collect all 'x-fa-exceptions' extensions of possible responses and make them globally available
        List<Entry<String, Object>> responseExtensions = openAPI.getComponents().getResponses().values().stream()
            .flatMap(r -> r.getExtensions().entrySet().stream()).collect(Collectors.toList());
        List<Object> faException =
            responseExtensions.stream().filter(e -> e.getKey().equals("x-fa-exceptions"))
                .flatMap(e -> ((List<Object>)e.getValue()).stream()).collect(Collectors.toList());
        additionalProperties().put("x-fa-exceptions", faException);
	}

	@Override
	public Map<String, Object> postProcessModels(final Map<String, Object> objs) {
		// Remove imports ApiModel and ApiModelProperty
		List<Map<String, String>> imports = (List<Map<String, String>>) objs.get("imports");
		Pattern pattern = Pattern.compile(".*(ApiModel|ApiModelProperty)");
		for (Iterator<Map<String, String>> itr = imports.iterator(); itr.hasNext();) {
			String _import = itr.next().get("import");
			if (pattern.matcher(_import).matches()) {
				itr.remove();
			}
		}
		
		//replace packages of property-models
		if (m_modelPropertyPackage != null) {
			for (Map<String, String> i : imports) {
				i.put("import", i.get("import").replaceFirst(objs.get("package").toString(), m_modelPropertyPackage));
			}
		}
		
		//remove parent classes from import
		List<Map<String, Object>> models = (List<Map<String, Object>>) objs.get("models");
		for(Map<String, Object> model : models) {
			CodegenModel codegenModel = (CodegenModel) model.get("model");
			final String parent = codegenModel.getParent();
			imports = imports.stream().filter(i -> {
				String tmp = i.get("import");
				if(tmp == null || parent == null) {
					return true;
				} else {
					return !tmp.contains(parent);
				}
			}).collect(Collectors.toList());
		}
		objs.put("imports", imports);
		
		return super.postProcessModels(objs);
	}
	
	@Override
	public void addOperationToGroup(final String tag, final String resourcePath, final Operation operation,
			final CodegenOperation co, final Map<String, List<CodegenOperation>> operations) {
		// makes the tag descriptions available to the mustache templates
		// (e.g. to be used in the javadoc of the service interfaces)
		// TODO is there a better way?
		String tagDesc = null;
		for (int i = 0; i < co.tags.size(); i++) {
			if (co.tags.get(i).getName().equals(tag)) {
				tagDesc = co.tags.get(i).getDescription();
				break;
			}
		}
		if (tagDesc != null) {
			m_tagDescriptions.put(tag.toLowerCase(), tagDesc);
		}
		
		// add exceptions thrown by the operation
        co.vendorExtensions.put("x-fa-exceptions",
            m_operationFaExceptions.get(operation.getOperationId()));

		super.addOperationToGroup(tag, resourcePath, operation, co, operations);
	}

	@Override
	public Map<String, Object> postProcessOperations(final Map<String, Object> objs) {
		// provide tag (i.e. service) descriptions
		// TODO is there a better way
		String tagDesc = m_tagDescriptions.get(((Map<String, Object>) objs.get("operations")).get("pathPrefix"));
		if ((tagDesc != null)) {
			objs.put("tagDescription", tagDesc);
		}

		return super.postProcessOperations(objs);
	}

	@Override
	public String toApiName(final String name) {
		// make original name available to templates
		// these form the basis of the service names, e.g. WorkflowService,
		// NodeService
		if (additionalProperties().get("tags") == null) {
			additionalProperties().put("tags", new HashSet<HashMap<String, String>>());
		} else {
			Set<Map<String, String>> tags = (Set<Map<String, String>>) additionalProperties().get("tags");
			Map<String, String> tag = new HashMap<String, String>();
			tag.put("nameLowerCase", name.toLowerCase());
			tag.put("name", name);
			tags.add(tag);
		}
		if (m_apiNamePattern != null) {
			return m_apiNamePattern.replace(NAME_PLACEHOLDER, camelize(name));
		} else {
			return name;
		}
	}

	@Override
	public String toModelName(final String name) {
		if (m_modelNamePattern != null) {
			return m_modelNamePattern.replace(NAME_PLACEHOLDER, name);
		} else {
			return name;
		}
	}

	@Override
	public String toBooleanGetter(final String name) {
		if (name.startsWith("has")) {
			return "has" + getterAndSetterCapitalize(name.substring(3));
		} else {
			return super.toBooleanGetter(name);
		}
	}
	
	@Override
	public CodegenProperty fromProperty(final String name, final Schema p) {
		// enables properties to have another name then the property they are
		// part of
		// e.g. DefaultNodeEnt.getNodeMessage() returns NodeMessageEnt instead
		// of DefaultNodeMessageEnt
		if (m_modelPropertyNamePattern != null && p.get$ref() != null) {
			CodegenProperty property = CodegenModelFactory.newInstance(CodegenModelType.PROPERTY);
			property.name = toVarName(name);
			property.baseName = name;
			property.nameInCamelCase = camelize(property.name, false);
			property.description = escapeText(p.getDescription());
			property.unescapedDescription = p.getDescription();
			property.title = p.getTitle();
			property.getter = toGetter(name);
			property.setter = toSetter(name);
			property.baseType = property.dataType = property.datatypeWithEnum = m_modelPropertyNamePattern
					.replace(NAME_PLACEHOLDER, extractNameFromRef(p.get$ref()));
			//importMapping.put(property.dataType, m_modelPropertyPackage + "." + property.dataType);
			return property;
		} else {
			return super.fromProperty(name, p);
		}
	}
	
    private String extractNameFromRef(final String ref) {
        return ref.substring(ref.lastIndexOf("schemas/") + 8);
    }


	@Override
	protected void updatePropertyForMap(final CodegenProperty property, final CodegenProperty innerProperty) {
		if (m_modelPropertyNamePattern != null) {
			// TODO hacky but works!
			super.updatePropertyForMap(property, innerProperty);
			property.dataType = property.datatypeWithEnum = "java.util.Map<String, " + innerProperty.dataType + ">";
		} else {
			super.updatePropertyForMap(property, innerProperty);
		}
	}

	@Override
	protected void updatePropertyForArray(final CodegenProperty property, final CodegenProperty innerProperty) {
		if (m_modelPropertyNamePattern != null) {
			// TODO hacky but works!
			super.updatePropertyForArray(property, innerProperty);
			property.dataType = property.datatypeWithEnum = "java.util.List<" + innerProperty.dataType + ">";
		} else {
			super.updatePropertyForArray(property, innerProperty);
		}
	}
		
}
