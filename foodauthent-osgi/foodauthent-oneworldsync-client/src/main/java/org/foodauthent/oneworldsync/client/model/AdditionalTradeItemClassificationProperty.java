/*
 * 1WorldSync Content1 API
 * Content1 will provide access to accurate, trusted product data sourced directly from the Brand Owners through 1WorldSync’s APIs. This full set of product information is readily available to you through a set of web services, allowing you to get up-to-date, complete product information. <br/><br/>The following APIs are available<ul><li>Product Search API - Performs a search against the product data published in ContentNOW to find products that meet the supplied criteria. For each search result displayed, a basic set of information about the product is provided. While performing a product search only a subset from the entire list of attributes for an item will be returned.</li><li>Product Fetch API - Once a Product Search has been performed, the full set of atrribute information on a given product can be retrieved using the Product Fetch API and the item reference id (obtained through the search).</li></ul><p>This tool features a fully functional form which will call the Content1 API in real time.  To unlock the API call, you must have your client secret key provided through <a href=\"#\" onclick=\"openWindow('https://developer.1worldsync.com', 'Content1')\">developer.1worldsync.com</a>. Enter that key in the top right of this page to unlock the API calls used below.</p><p>Don't have a key but want to read the documenation? Go ahead! Basic API documentation is provided below.</p><div style=\"border: 1px solid transparent;color:#fff;background-color: #00ACC8;padding-left: 10px;height:30px;font-weight:bold;font-size:1.3em;margin:0;font-family: ProximaNova;padding-top:10px\">Search and Fetch Model Schemas</div><ul><li><a href=\"../doc/1WorldSync_Content1_Product_Search_Model_Schema_Guide_v3.1.6.1.pdf\" target=\"_blank\">Search Model Schema</a></li><li><a href=\"../doc/1WorldSync_Content1_Product_Fetch_Model_Schema_Guide_v3.1.6.6.pdf\" target=\"_blank\">Fetch Model Schema</a> </li></ul>
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.foodauthent.oneworldsync.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.foodauthent.oneworldsync.client.model.LanguageLabels;
import org.foodauthent.oneworldsync.client.model.QualifiedValue;
import org.foodauthent.oneworldsync.client.model.QualifiedValues;

/**
 * AdditionalTradeItemClassificationProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class AdditionalTradeItemClassificationProperty {
	@JsonProperty("additionalTradeItemClassificationPropertyCode")
	private String additionalTradeItemClassificationPropertyCode = null;

	@JsonProperty("additionalTradeItemClassificationPropertyDescription")
	private LanguageLabels additionalTradeItemClassificationPropertyDescription = null;

	@JsonProperty("propertyAmount")
	private QualifiedValue propertyAmount = null;

	@JsonProperty("propertyCode")
	private String propertyCode = null;

	@JsonProperty("propertyDateTime")
	private String propertyDateTime = null;

	@JsonProperty("propertyDescription")
	private LanguageLabels propertyDescription = null;

	@JsonProperty("propertyFloat")
	private String propertyFloat = null;

	@JsonProperty("propertyInteger")
	private String propertyInteger = null;

	@JsonProperty("propertyMeasurement")
	private QualifiedValues propertyMeasurement = null;

	@JsonProperty("propertyString")
	private String propertyString = null;

	public AdditionalTradeItemClassificationProperty additionalTradeItemClassificationPropertyCode(
			String additionalTradeItemClassificationPropertyCode) {
		this.additionalTradeItemClassificationPropertyCode = additionalTradeItemClassificationPropertyCode;
		return this;
	}

	/**
	 * Get additionalTradeItemClassificationPropertyCode
	 * 
	 * @return additionalTradeItemClassificationPropertyCode
	 **/
	@ApiModelProperty(value = "")
	public String getAdditionalTradeItemClassificationPropertyCode() {
		return additionalTradeItemClassificationPropertyCode;
	}

	public void setAdditionalTradeItemClassificationPropertyCode(String additionalTradeItemClassificationPropertyCode) {
		this.additionalTradeItemClassificationPropertyCode = additionalTradeItemClassificationPropertyCode;
	}

	public AdditionalTradeItemClassificationProperty additionalTradeItemClassificationPropertyDescription(
			LanguageLabels additionalTradeItemClassificationPropertyDescription) {
		this.additionalTradeItemClassificationPropertyDescription = additionalTradeItemClassificationPropertyDescription;
		return this;
	}

	/**
	 * Get additionalTradeItemClassificationPropertyDescription
	 * 
	 * @return additionalTradeItemClassificationPropertyDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getAdditionalTradeItemClassificationPropertyDescription() {
		return additionalTradeItemClassificationPropertyDescription;
	}

	public void setAdditionalTradeItemClassificationPropertyDescription(
			LanguageLabels additionalTradeItemClassificationPropertyDescription) {
		this.additionalTradeItemClassificationPropertyDescription = additionalTradeItemClassificationPropertyDescription;
	}

	public AdditionalTradeItemClassificationProperty propertyAmount(QualifiedValue propertyAmount) {
		this.propertyAmount = propertyAmount;
		return this;
	}

	/**
	 * Get propertyAmount
	 * 
	 * @return propertyAmount
	 **/
	@ApiModelProperty(value = "")
	public QualifiedValue getPropertyAmount() {
		return propertyAmount;
	}

	public void setPropertyAmount(QualifiedValue propertyAmount) {
		this.propertyAmount = propertyAmount;
	}

	public AdditionalTradeItemClassificationProperty propertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
		return this;
	}

	/**
	 * Get propertyCode
	 * 
	 * @return propertyCode
	 **/
	@ApiModelProperty(value = "")
	public String getPropertyCode() {
		return propertyCode;
	}

	public void setPropertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
	}

	public AdditionalTradeItemClassificationProperty propertyDateTime(String propertyDateTime) {
		this.propertyDateTime = propertyDateTime;
		return this;
	}

	/**
	 * Get propertyDateTime
	 * 
	 * @return propertyDateTime
	 **/
	@ApiModelProperty(value = "")
	public String getPropertyDateTime() {
		return propertyDateTime;
	}

	public void setPropertyDateTime(String propertyDateTime) {
		this.propertyDateTime = propertyDateTime;
	}

	public AdditionalTradeItemClassificationProperty propertyDescription(LanguageLabels propertyDescription) {
		this.propertyDescription = propertyDescription;
		return this;
	}

	/**
	 * Get propertyDescription
	 * 
	 * @return propertyDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(LanguageLabels propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public AdditionalTradeItemClassificationProperty propertyFloat(String propertyFloat) {
		this.propertyFloat = propertyFloat;
		return this;
	}

	/**
	 * Get propertyFloat
	 * 
	 * @return propertyFloat
	 **/
	@ApiModelProperty(value = "")
	public String getPropertyFloat() {
		return propertyFloat;
	}

	public void setPropertyFloat(String propertyFloat) {
		this.propertyFloat = propertyFloat;
	}

	public AdditionalTradeItemClassificationProperty propertyInteger(String propertyInteger) {
		this.propertyInteger = propertyInteger;
		return this;
	}

	/**
	 * Get propertyInteger
	 * 
	 * @return propertyInteger
	 **/
	@ApiModelProperty(value = "")
	public String getPropertyInteger() {
		return propertyInteger;
	}

	public void setPropertyInteger(String propertyInteger) {
		this.propertyInteger = propertyInteger;
	}

	public AdditionalTradeItemClassificationProperty propertyMeasurement(QualifiedValues propertyMeasurement) {
		this.propertyMeasurement = propertyMeasurement;
		return this;
	}

	/**
	 * Get propertyMeasurement
	 * 
	 * @return propertyMeasurement
	 **/
	@ApiModelProperty(value = "")
	public QualifiedValues getPropertyMeasurement() {
		return propertyMeasurement;
	}

	public void setPropertyMeasurement(QualifiedValues propertyMeasurement) {
		this.propertyMeasurement = propertyMeasurement;
	}

	public AdditionalTradeItemClassificationProperty propertyString(String propertyString) {
		this.propertyString = propertyString;
		return this;
	}

	/**
	 * Get propertyString
	 * 
	 * @return propertyString
	 **/
	@ApiModelProperty(value = "")
	public String getPropertyString() {
		return propertyString;
	}

	public void setPropertyString(String propertyString) {
		this.propertyString = propertyString;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AdditionalTradeItemClassificationProperty additionalTradeItemClassificationProperty = (AdditionalTradeItemClassificationProperty) o;
		return Objects.equals(this.additionalTradeItemClassificationPropertyCode,
				additionalTradeItemClassificationProperty.additionalTradeItemClassificationPropertyCode)
				&& Objects.equals(this.additionalTradeItemClassificationPropertyDescription,
						additionalTradeItemClassificationProperty.additionalTradeItemClassificationPropertyDescription)
				&& Objects.equals(this.propertyAmount, additionalTradeItemClassificationProperty.propertyAmount)
				&& Objects.equals(this.propertyCode, additionalTradeItemClassificationProperty.propertyCode)
				&& Objects.equals(this.propertyDateTime, additionalTradeItemClassificationProperty.propertyDateTime)
				&& Objects.equals(this.propertyDescription,
						additionalTradeItemClassificationProperty.propertyDescription)
				&& Objects.equals(this.propertyFloat, additionalTradeItemClassificationProperty.propertyFloat)
				&& Objects.equals(this.propertyInteger, additionalTradeItemClassificationProperty.propertyInteger)
				&& Objects.equals(this.propertyMeasurement,
						additionalTradeItemClassificationProperty.propertyMeasurement)
				&& Objects.equals(this.propertyString, additionalTradeItemClassificationProperty.propertyString);
	}

	@Override
	public int hashCode() {
		return Objects.hash(additionalTradeItemClassificationPropertyCode,
				additionalTradeItemClassificationPropertyDescription, propertyAmount, propertyCode, propertyDateTime,
				propertyDescription, propertyFloat, propertyInteger, propertyMeasurement, propertyString);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AdditionalTradeItemClassificationProperty {\n");

		sb.append("    additionalTradeItemClassificationPropertyCode: ")
				.append(toIndentedString(additionalTradeItemClassificationPropertyCode)).append("\n");
		sb.append("    additionalTradeItemClassificationPropertyDescription: ")
				.append(toIndentedString(additionalTradeItemClassificationPropertyDescription)).append("\n");
		sb.append("    propertyAmount: ").append(toIndentedString(propertyAmount)).append("\n");
		sb.append("    propertyCode: ").append(toIndentedString(propertyCode)).append("\n");
		sb.append("    propertyDateTime: ").append(toIndentedString(propertyDateTime)).append("\n");
		sb.append("    propertyDescription: ").append(toIndentedString(propertyDescription)).append("\n");
		sb.append("    propertyFloat: ").append(toIndentedString(propertyFloat)).append("\n");
		sb.append("    propertyInteger: ").append(toIndentedString(propertyInteger)).append("\n");
		sb.append("    propertyMeasurement: ").append(toIndentedString(propertyMeasurement)).append("\n");
		sb.append("    propertyString: ").append(toIndentedString(propertyString)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
