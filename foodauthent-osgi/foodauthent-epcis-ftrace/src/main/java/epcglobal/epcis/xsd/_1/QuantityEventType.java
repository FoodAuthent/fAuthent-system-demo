
package epcglobal.epcis.xsd._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java-Klasse für QuantityEventType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QuantityEventType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:epcglobal:epcis:xsd:1}EPCISEventType">
 *       &lt;sequence>
 *         &lt;element name="epcClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bizStep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readPoint" type="{urn:epcglobal:epcis:xsd:1}ReadPointType" minOccurs="0"/>
 *         &lt;element name="bizLocation" type="{urn:epcglobal:epcis:xsd:1}BusinessLocationType" minOccurs="0"/>
 *         &lt;element name="bizTransactionList" type="{urn:epcglobal:epcis:xsd:1}BusinessTransactionListType" minOccurs="0"/>
 *         &lt;element name="extension" type="{urn:epcglobal:epcis:xsd:1}QuantityEventExtensionType" minOccurs="0"/>
 *         &lt;element name="eventSequence" type="{urn:epcglobal:epcis:xsd:1}eventSequence" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='skip' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityEventType", propOrder = {
    "epcClass",
    "quantity",
    "bizStep",
    "disposition",
    "readPoint",
    "bizLocation",
    "bizTransactionList",
    "extension",
    "eventSequence",
    "any"
})
public class QuantityEventType
    extends EPCISEventType
{

    @XmlElement(required = true)
    protected String epcClass;
    protected Integer quantity;
    protected String bizStep;
    protected String disposition;
    protected ReadPointType readPoint;
    protected BusinessLocationType bizLocation;
    protected BusinessTransactionListType bizTransactionList;
    protected QuantityEventExtensionType extension;
    protected EventSequence eventSequence;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Ruft den Wert der epcClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpcClass() {
        return epcClass;
    }

    /**
     * Legt den Wert der epcClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpcClass(String value) {
        this.epcClass = value;
    }

    /**
     * Ruft den Wert der quantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Legt den Wert der quantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Ruft den Wert der bizStep-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizStep() {
        return bizStep;
    }

    /**
     * Legt den Wert der bizStep-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizStep(String value) {
        this.bizStep = value;
    }

    /**
     * Ruft den Wert der disposition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposition() {
        return disposition;
    }

    /**
     * Legt den Wert der disposition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposition(String value) {
        this.disposition = value;
    }

    /**
     * Ruft den Wert der readPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReadPointType }
     *     
     */
    public ReadPointType getReadPoint() {
        return readPoint;
    }

    /**
     * Legt den Wert der readPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadPointType }
     *     
     */
    public void setReadPoint(ReadPointType value) {
        this.readPoint = value;
    }

    /**
     * Ruft den Wert der bizLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BusinessLocationType }
     *     
     */
    public BusinessLocationType getBizLocation() {
        return bizLocation;
    }

    /**
     * Legt den Wert der bizLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessLocationType }
     *     
     */
    public void setBizLocation(BusinessLocationType value) {
        this.bizLocation = value;
    }

    /**
     * Ruft den Wert der bizTransactionList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTransactionListType }
     *     
     */
    public BusinessTransactionListType getBizTransactionList() {
        return bizTransactionList;
    }

    /**
     * Legt den Wert der bizTransactionList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionListType }
     *     
     */
    public void setBizTransactionList(BusinessTransactionListType value) {
        this.bizTransactionList = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QuantityEventExtensionType }
     *     
     */
    public QuantityEventExtensionType getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityEventExtensionType }
     *     
     */
    public void setExtension(QuantityEventExtensionType value) {
        this.extension = value;
    }

    /**
     * Ruft den Wert der eventSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EventSequence }
     *     
     */
    public EventSequence getEventSequence() {
        return eventSequence;
    }

    /**
     * Legt den Wert der eventSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSequence }
     *     
     */
    public void setEventSequence(EventSequence value) {
        this.eventSequence = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
