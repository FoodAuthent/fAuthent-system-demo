/*
 * TODO	
 */
package org.foodauthent.model.json.mixin;

import java.time.OffsetDateTime;
import org.foodauthent.model.BizTransaction;
import org.foodauthent.model.QuantityElement;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.foodauthent.model.ObjectEvent.ActionEnum;


import org.foodauthent.model.ObjectEvent;
import org.foodauthent.model.ObjectEvent.ObjectEventBuilder;

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
    defaultImpl = ObjectEvent.class)
@JsonSubTypes({
    @Type(value = ObjectEvent.class, name="ObjectEvent")
})
@JsonDeserialize(builder=ObjectEventBuilder.class)
@javax.annotation.Generated(value = "org.foodauthent.codegen.FoodAuthentCodegen")
public interface ObjectEventMixIn {

	@JsonIgnore
	public long getPersistenceId();
	
    @JsonIgnore
    public String getTypeID();
    
    

    @JsonProperty("fa-id")
    public java.util.UUID getFaId();
    
    @JsonProperty("epcList")
    public java.util.List<String> getEpcList();
    
    @JsonProperty("bizStep")
    public String getBizStep();
    
    @JsonProperty("readPoint")
    public String getReadPoint();
    
    @JsonProperty("quantityList")
    public java.util.List<QuantityElement> getQuantityList();
    
    @JsonProperty("action")
    public ActionEnum getAction();
    
    @JsonProperty("disposition")
    public String getDisposition();
    
    @JsonProperty("bizTransactionList")
    public java.util.List<BizTransaction> getBizTransactionList();
    
    @JsonProperty("eventType")
    public String getEventType();
    
    @JsonProperty("gtin")
    public String getGtin();
    
    @JsonProperty("bricks")
    public java.util.List<String> getBricks();
    
    @JsonProperty("eventTime")
    public OffsetDateTime getEventTime();
    
    @JsonProperty("transaction-ids")
    public java.util.List<java.util.UUID> getTransactionIds();
    

    /**
     * MixIn class for entity builder implementations that adds jackson annotations for the de-/serialization.
     *
     * @author Martin Horn, University of Konstanz
     */
    @JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "",
        defaultImpl = ObjectEventBuilder.class)
    @JsonSubTypes({
        @Type(value = ObjectEvent.ObjectEventBuilder.class, name="ObjectEvent")
    })
    // AUTO-GENERATED CODE; DO NOT MODIFY
    public static interface ObjectEventMixInBuilder {
    
        public ObjectEventMixIn build();
    
        @JsonProperty("fa-id")
        public ObjectEventMixInBuilder setFaId(final java.util.UUID faId);
        
        @JsonProperty("epcList")
        public ObjectEventMixInBuilder setEpcList(final java.util.List<String> epcList);
        
        @JsonProperty("bizStep")
        public ObjectEventMixInBuilder setBizStep(final String bizStep);
        
        @JsonProperty("readPoint")
        public ObjectEventMixInBuilder setReadPoint(final String readPoint);
        
        @JsonProperty("quantityList")
        public ObjectEventMixInBuilder setQuantityList(final java.util.List<QuantityElement> quantityList);
        
        @JsonProperty("action")
        public ObjectEventMixInBuilder setAction(final ActionEnum action);
        
        @JsonProperty("disposition")
        public ObjectEventMixInBuilder setDisposition(final String disposition);
        
        @JsonProperty("bizTransactionList")
        public ObjectEventMixInBuilder setBizTransactionList(final java.util.List<BizTransaction> bizTransactionList);
        
        @JsonProperty("eventType")
        public ObjectEventMixInBuilder setEventType(final String eventType);
        
        @JsonProperty("gtin")
        public ObjectEventMixInBuilder setGtin(final String gtin);
        
        @JsonProperty("bricks")
        public ObjectEventMixInBuilder setBricks(final java.util.List<String> bricks);
        
        @JsonProperty("eventTime")
        public ObjectEventMixInBuilder setEventTime(final OffsetDateTime eventTime);
        
        @JsonProperty("transaction-ids")
        public ObjectEventMixInBuilder setTransactionIds(final java.util.List<java.util.UUID> transactionIds);
        
    }


}

