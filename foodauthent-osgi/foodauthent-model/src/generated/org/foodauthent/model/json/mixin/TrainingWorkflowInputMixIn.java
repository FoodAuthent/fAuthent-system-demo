/*
 * TODO	
 */
package org.foodauthent.model.json.mixin;

import org.foodauthent.model.json.mixin.FingerprintSetMixIn;
import org.foodauthent.model.json.mixin.WorkflowModuleMixIn;
import org.foodauthent.model.json.mixin.WorkflowParameterMixIn;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;



import org.foodauthent.model.TrainingWorkflowInput;
import org.foodauthent.model.TrainingWorkflowInput.TrainingWorkflowInputBuilder;

/**
 * MixIn class for entity implementations that adds jackson annotations for de-/serialization.
 *
 * @author Martin Horn, University of Konstanz
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "",
    visible = true,
    defaultImpl = TrainingWorkflowInput.class)
@JsonSubTypes({
    @Type(value = TrainingWorkflowInput.class, name="TrainingWorkflowInput")
})
@JsonDeserialize(builder=TrainingWorkflowInputBuilder.class)
@javax.annotation.Generated(value = "org.foodauthent.codegen.FoodAuthentCodegen")
public interface TrainingWorkflowInputMixIn {

	@JsonIgnore
	public long getPersistenceId();
	
    @JsonIgnore
    public String getTypeID();
    
   	@JsonIgnore
  	public UUID getFaId();
    

    @JsonProperty("parameters")
    public java.util.List<WorkflowParameterMixIn> getParameters();
    
    @JsonProperty("fingerprintset-metadata")
    public FingerprintSetMixIn getFingerprintsetMetadata();
    
    @JsonProperty("fingerprintset-URI")
    public String getFingerprintsetURI();
    
    @JsonProperty("modules")
    public java.util.List<WorkflowModuleMixIn> getModules();
    

    /**
     * MixIn class for entity builder implementations that adds jackson annotations for the de-/serialization.
     *
     * @author Martin Horn, University of Konstanz
     */
    @JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "",
        defaultImpl = TrainingWorkflowInputBuilder.class)
    @JsonSubTypes({
        @Type(value = TrainingWorkflowInput.TrainingWorkflowInputBuilder.class, name="TrainingWorkflowInput")
    })
    // AUTO-GENERATED CODE; DO NOT MODIFY
    public static interface TrainingWorkflowInputMixInBuilder {
    
        public TrainingWorkflowInputMixIn build();
    
        @JsonProperty("parameters")
        public TrainingWorkflowInputMixInBuilder setParameters(final java.util.List<WorkflowParameterMixIn> parameters);
        
        @JsonProperty("fingerprintset-metadata")
        public TrainingWorkflowInputMixInBuilder setFingerprintsetMetadata(final FingerprintSetMixIn fingerprintsetMetadata);
        
        @JsonProperty("fingerprintset-URI")
        public TrainingWorkflowInputMixInBuilder setFingerprintsetURI(final String fingerprintsetURI);
        
        @JsonProperty("modules")
        public TrainingWorkflowInputMixInBuilder setModules(final java.util.List<WorkflowModuleMixIn> modules);
        
    }


}

