/*
 * TODO	
 */
package org.foodauthent.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import java.time.OffsetDateTime;
import org.foodauthent.model.BizTransaction;
import org.foodauthent.model.QuantityElement;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * Object Event Transaction
 *
 * @author Martin Horn, University of Konstanz
 */
@javax.annotation.Generated(value = "org.foodauthent.codegen.FoodAuthentCodegen")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ObjectEvent   extends FaModel {

  /**
   * Event action.
   */
  public static enum ActionEnum {
    ADD("ADD"),
    
    OBSERVE("OBSERVE"),
    
    DELETE("DELETE");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

  }


  protected java.util.UUID faId;
  protected java.util.List<String> epcList;
  protected String bizStep;
  protected String readPoint;
  protected java.util.List<QuantityElement> quantityList;
  protected ActionEnum action;
  protected String disposition;
  protected java.util.List<BizTransaction> bizTransactionList;
  protected String eventType;
  protected String gtin;
  protected java.util.List<String> bricks;
  protected OffsetDateTime eventTime;
  protected java.util.List<java.util.UUID> transactionIds;

  public String getTypeID() {
    return "ObjectEvent";
  }



  protected ObjectEvent() {}

  private ObjectEvent(ObjectEventBuilder builder) {
    
    faId = immutable(builder.faId);
    epcList = immutable(builder.epcList);
    bizStep = immutable(builder.bizStep);
    readPoint = immutable(builder.readPoint);
    quantityList = immutable(builder.quantityList);
    action = immutable(builder.action);
    disposition = immutable(builder.disposition);
    bizTransactionList = immutable(builder.bizTransactionList);
    eventType = immutable(builder.eventType);
    gtin = immutable(builder.gtin);
    bricks = immutable(builder.bricks);
    eventTime = immutable(builder.eventTime);
    transactionIds = immutable(builder.transactionIds);

    faId = generateFaIdIfMissing(faId);

  }

   /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        ObjectEvent ent = (ObjectEvent)o;
        return Objects.equals(faId, ent.faId) && Objects.equals(epcList, ent.epcList) && Objects.equals(bizStep, ent.bizStep) && Objects.equals(readPoint, ent.readPoint) && Objects.equals(quantityList, ent.quantityList) && Objects.equals(action, ent.action) && Objects.equals(disposition, ent.disposition) && Objects.equals(bizTransactionList, ent.bizTransactionList) && Objects.equals(eventType, ent.eventType) && Objects.equals(gtin, ent.gtin) && Objects.equals(bricks, ent.bricks) && Objects.equals(eventTime, ent.eventTime) && Objects.equals(transactionIds, ent.transactionIds);
    }


  /**
   * A global id within the FoodAuthent-system.
   * @return faId 
   */
  public java.util.UUID getFaId() {
        return faId;
    }

  /**
   * An unordered list of one or more EPCs(Electronic Product Code) naming the physical objects to which the event pertained. Each element of this list SHALL be a URI [RFC2396] denoting the unique identity for a physical object.
   * @return epcList 
   */
  public java.util.List<String> getEpcList() {
        return epcList;
    }

  /**
   * EPCIS bizStep
   * @return bizStep 
   */
  public String getBizStep() {
        return bizStep;
    }

  /**
   * Read point
   * @return readPoint 
   */
  public String getReadPoint() {
        return readPoint;
    }

  /**
   * List of quantity
   * @return quantityList 
   */
  public java.util.List<QuantityElement> getQuantityList() {
        return quantityList;
    }

  /**
   * Event action.
   * @return action 
   */
  public ActionEnum getAction() {
        return action;
    }

  /**
   * EPCIS Disposition
   * @return disposition 
   */
  public String getDisposition() {
        return disposition;
    }

  /**
   * List of bizTransactions
   * @return bizTransactionList 
   */
  public java.util.List<BizTransaction> getBizTransactionList() {
        return bizTransactionList;
    }

  /**
   * EPCIS eventType, for Foodauthent system could be only ObjectEvent
   * @return eventType 
   */
  public String getEventType() {
        return eventType;
    }

  /**
   * Global Trade Item Number
   * @return gtin 
   */
  public String getGtin() {
        return gtin;
    }

  /**
   * A brick identifies a category of consumer-related products
   * @return bricks 
   */
  public java.util.List<String> getBricks() {
        return bricks;
    }

  /**
   * When the event happened
   * @return eventTime 
   */
  public OffsetDateTime getEventTime() {
        return eventTime;
    }

  /**
   * List of discovery service transaction related to this ObjecEvent
   * @return transactionIds 
   */
  public java.util.List<java.util.UUID> getTransactionIds() {
        return transactionIds;
    }


 	/**
  	 * @return a newly created builder
  	 */
  	public static ObjectEventBuilder builder() {
  		return new ObjectEventBuilder();
  	}

  	/**
	 * Copy-builder, i.e. creates a new builder with all properties of the passed
	 * entity pre-set.
	 *
	 * @param entity
	 *            entity to copy the properties from
	 * @return a new builder with the properties set
	 */
	public static ObjectEventBuilder builder(ObjectEvent entity) {
		ObjectEventBuilder builder = builder();
        builder.faId = entity.faId;
        builder.epcList = entity.epcList;
        builder.bizStep = entity.bizStep;
        builder.readPoint = entity.readPoint;
        builder.quantityList = entity.quantityList;
        builder.action = entity.action;
        builder.disposition = entity.disposition;
        builder.bizTransactionList = entity.bizTransactionList;
        builder.eventType = entity.eventType;
        builder.gtin = entity.gtin;
        builder.bricks = entity.bricks;
        builder.eventTime = entity.eventTime;
        builder.transactionIds = entity.transactionIds;
 		return builder;
  	}


    public static class ObjectEventBuilder {

        protected ObjectEventBuilder(){
            
        }

        private java.util.UUID faId;
        private java.util.List<String> epcList = new java.util.ArrayList<>();
        private String bizStep;
        private String readPoint;
        private java.util.List<QuantityElement> quantityList = new java.util.ArrayList<>();
        private ActionEnum action;
        private String disposition;
        private java.util.List<BizTransaction> bizTransactionList = new java.util.ArrayList<>();
        private String eventType;
        private String gtin;
        private java.util.List<String> bricks = new java.util.ArrayList<>();
        private OffsetDateTime eventTime;
        private java.util.List<java.util.UUID> transactionIds = new java.util.ArrayList<>();

        /**
         * A global id within the FoodAuthent-system.
         * @return faId 
         */
        public ObjectEventBuilder setFaId(java.util.UUID faId) {
             this.faId = faId;
             return this;
        }

        /**
         * An unordered list of one or more EPCs(Electronic Product Code) naming the physical objects to which the event pertained. Each element of this list SHALL be a URI [RFC2396] denoting the unique identity for a physical object.
         * @return epcList 
         */
        public ObjectEventBuilder setEpcList(java.util.List<String> epcList) {
             this.epcList = epcList;
             return this;
        }

        /**
         * EPCIS bizStep
         * @return bizStep 
         */
        public ObjectEventBuilder setBizStep(String bizStep) {
             this.bizStep = bizStep;
             return this;
        }

        /**
         * Read point
         * @return readPoint 
         */
        public ObjectEventBuilder setReadPoint(String readPoint) {
             this.readPoint = readPoint;
             return this;
        }

        /**
         * List of quantity
         * @return quantityList 
         */
        public ObjectEventBuilder setQuantityList(java.util.List<QuantityElement> quantityList) {
             this.quantityList = quantityList;
             return this;
        }

        /**
         * Event action.
         * @return action 
         */
        public ObjectEventBuilder setAction(ActionEnum action) {
             this.action = action;
             return this;
        }

        /**
         * EPCIS Disposition
         * @return disposition 
         */
        public ObjectEventBuilder setDisposition(String disposition) {
             this.disposition = disposition;
             return this;
        }

        /**
         * List of bizTransactions
         * @return bizTransactionList 
         */
        public ObjectEventBuilder setBizTransactionList(java.util.List<BizTransaction> bizTransactionList) {
             this.bizTransactionList = bizTransactionList;
             return this;
        }

        /**
         * EPCIS eventType, for Foodauthent system could be only ObjectEvent
         * @return eventType 
         */
        public ObjectEventBuilder setEventType(String eventType) {
             this.eventType = eventType;
             return this;
        }

        /**
         * Global Trade Item Number
         * @return gtin 
         */
        public ObjectEventBuilder setGtin(String gtin) {
             this.gtin = gtin;
             return this;
        }

        /**
         * A brick identifies a category of consumer-related products
         * @return bricks 
         */
        public ObjectEventBuilder setBricks(java.util.List<String> bricks) {
             this.bricks = bricks;
             return this;
        }

        /**
         * When the event happened
         * @return eventTime 
         */
        public ObjectEventBuilder setEventTime(OffsetDateTime eventTime) {
             this.eventTime = eventTime;
             return this;
        }

        /**
         * List of discovery service transaction related to this ObjecEvent
         * @return transactionIds 
         */
        public ObjectEventBuilder setTransactionIds(java.util.List<java.util.UUID> transactionIds) {
             this.transactionIds = transactionIds;
             return this;
        }


        public ObjectEvent build() {
            return new ObjectEvent(this);
        }

    }


    /**
     * Turns an object into an immutable one (if not already).
     * TODO move it somewhere else
     *
     * @param obj the object to treat
     * @return the object itself or a immutable copy
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static <T> T immutable(final T obj) {
        if (obj == null) {
            return null;
        } else if (obj instanceof Map) {
            return (T)Collections.unmodifiableMap(new HashMap((Map)obj));
        } else if (obj instanceof List) {
            return (T)Collections.unmodifiableList(new ArrayList((List)obj));
        } else {
            return obj;
        }
    }


}
