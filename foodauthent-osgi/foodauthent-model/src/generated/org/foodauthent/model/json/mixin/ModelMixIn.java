/*
 * TODO	
 */
package org.foodauthent.model.json.mixin;

import java.time.LocalDate;
import org.foodauthent.model.json.mixin.TagMixIn;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.foodauthent.model.Model.TypeEnum;
import org.foodauthent.model.Model.WorkflowTypeEnum;


import org.foodauthent.model.Model;
import org.foodauthent.model.Model.ModelBuilder;

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
    defaultImpl = Model.class)
@JsonSubTypes({
    @Type(value = Model.class, name="Model")
})
@JsonDeserialize(builder=ModelBuilder.class)
@javax.annotation.Generated(value = "org.foodauthent.codegen.FoodAuthentCodegen")
public interface ModelMixIn {

	@JsonIgnore
	public long getPersistenceId();
	
    @JsonIgnore
    public String getTypeID();
    
    

    @JsonProperty("fa-id")
    public java.util.UUID getFaId();
    
    @JsonProperty("name")
    public String getName();
    
    @JsonProperty("description")
    public String getDescription();
    
    @JsonProperty("author")
    public String getAuthor();
    
    @JsonProperty("date")
    public LocalDate getDate();
    
    @JsonProperty("version")
    public Integer getVersion();
    
    @JsonProperty("type")
    public TypeEnum getType();
    
    @JsonProperty("workflow-type")
    public WorkflowTypeEnum getWorkflowType();
    
    @JsonProperty("tags")
    public java.util.List<TagMixIn> getTags();
    
    @JsonProperty("model-file-id")
    public java.util.UUID getModelFileId();
    

    /**
     * MixIn class for entity builder implementations that adds jackson annotations for the de-/serialization.
     *
     * @author Martin Horn, University of Konstanz
     */
    @JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "",
        defaultImpl = ModelBuilder.class)
    @JsonSubTypes({
        @Type(value = Model.ModelBuilder.class, name="Model")
    })
    // AUTO-GENERATED CODE; DO NOT MODIFY
    public static interface ModelMixInBuilder {
    
        public ModelMixIn build();
    
        @JsonProperty("fa-id")
        public ModelMixInBuilder setFaId(final java.util.UUID faId);
        
        @JsonProperty("name")
        public ModelMixInBuilder setName(final String name);
        
        @JsonProperty("description")
        public ModelMixInBuilder setDescription(final String description);
        
        @JsonProperty("author")
        public ModelMixInBuilder setAuthor(final String author);
        
        @JsonProperty("date")
        public ModelMixInBuilder setDate(final LocalDate date);
        
        @JsonProperty("version")
        public ModelMixInBuilder setVersion(final Integer version);
        
        @JsonProperty("type")
        public ModelMixInBuilder setType(final TypeEnum type);
        
        @JsonProperty("workflow-type")
        public ModelMixInBuilder setWorkflowType(final WorkflowTypeEnum workflowType);
        
        @JsonProperty("tags")
        public ModelMixInBuilder setTags(final java.util.List<TagMixIn> tags);
        
        @JsonProperty("model-file-id")
        public ModelMixInBuilder setModelFileId(final java.util.UUID modelFileId);
        
    }


}

