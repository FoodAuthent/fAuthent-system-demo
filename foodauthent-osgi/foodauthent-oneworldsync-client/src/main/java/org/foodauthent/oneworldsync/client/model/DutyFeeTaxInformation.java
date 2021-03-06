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
import java.util.ArrayList;
import java.util.List;
import org.foodauthent.oneworldsync.client.model.CodifiedValue;
import org.foodauthent.oneworldsync.client.model.DutyFeeTax;
import org.foodauthent.oneworldsync.client.model.LanguageLabels;
import org.foodauthent.oneworldsync.client.model.QualifiedValues;
import org.foodauthent.oneworldsync.client.model.Values;

/**
 * DutyFeeTaxInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class DutyFeeTaxInformation {
	@JsonProperty("dutyFeeTax")
	private List<DutyFeeTax> dutyFeeTax = null;

	@JsonProperty("dutyFeeTaxAgencyCode")
	private CodifiedValue dutyFeeTaxAgencyCode = null;

	@JsonProperty("dutyFeeTaxAgencyName")
	private String dutyFeeTaxAgencyName = null;

	@JsonProperty("dutyFeeTaxBasisPrice")
	private QualifiedValues dutyFeeTaxBasisPrice = null;

	@JsonProperty("dutyFeeTaxClassificationCode")
	private String dutyFeeTaxClassificationCode = null;

	@JsonProperty("dutyFeeTaxCountryCode")
	private CodifiedValue dutyFeeTaxCountryCode = null;

	@JsonProperty("dutyFeeTaxCountrySubdivisionShipFromCode")
	private String dutyFeeTaxCountrySubdivisionShipFromCode = null;

	@JsonProperty("dutyFeeTaxCountrySubdivisionShipToCode")
	private Values dutyFeeTaxCountrySubdivisionShipToCode = null;

	@JsonProperty("dutyFeeTaxEffectiveEndDateTime")
	private String dutyFeeTaxEffectiveEndDateTime = null;

	@JsonProperty("dutyFeeTaxEffectiveStartDateTime")
	private String dutyFeeTaxEffectiveStartDateTime = null;

	@JsonProperty("dutyFeeTaxLegalProvision")
	private LanguageLabels dutyFeeTaxLegalProvision = null;

	@JsonProperty("dutyFeeTaxTypeCode")
	private String dutyFeeTaxTypeCode = null;

	@JsonProperty("dutyFeeTaxTypeDescription")
	private LanguageLabels dutyFeeTaxTypeDescription = null;

	@JsonProperty("isTradeItemACombinationItem")
	private CodifiedValue isTradeItemACombinationItem = null;

	public DutyFeeTaxInformation dutyFeeTax(List<DutyFeeTax> dutyFeeTax) {
		this.dutyFeeTax = dutyFeeTax;
		return this;
	}

	public DutyFeeTaxInformation addDutyFeeTaxItem(DutyFeeTax dutyFeeTaxItem) {
		if (this.dutyFeeTax == null) {
			this.dutyFeeTax = new ArrayList<DutyFeeTax>();
		}
		this.dutyFeeTax.add(dutyFeeTaxItem);
		return this;
	}

	/**
	 * Get dutyFeeTax
	 * 
	 * @return dutyFeeTax
	 **/
	@ApiModelProperty(value = "")
	public List<DutyFeeTax> getDutyFeeTax() {
		return dutyFeeTax;
	}

	public void setDutyFeeTax(List<DutyFeeTax> dutyFeeTax) {
		this.dutyFeeTax = dutyFeeTax;
	}

	public DutyFeeTaxInformation dutyFeeTaxAgencyCode(CodifiedValue dutyFeeTaxAgencyCode) {
		this.dutyFeeTaxAgencyCode = dutyFeeTaxAgencyCode;
		return this;
	}

	/**
	 * Get dutyFeeTaxAgencyCode
	 * 
	 * @return dutyFeeTaxAgencyCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getDutyFeeTaxAgencyCode() {
		return dutyFeeTaxAgencyCode;
	}

	public void setDutyFeeTaxAgencyCode(CodifiedValue dutyFeeTaxAgencyCode) {
		this.dutyFeeTaxAgencyCode = dutyFeeTaxAgencyCode;
	}

	public DutyFeeTaxInformation dutyFeeTaxAgencyName(String dutyFeeTaxAgencyName) {
		this.dutyFeeTaxAgencyName = dutyFeeTaxAgencyName;
		return this;
	}

	/**
	 * Get dutyFeeTaxAgencyName
	 * 
	 * @return dutyFeeTaxAgencyName
	 **/
	@ApiModelProperty(value = "")
	public String getDutyFeeTaxAgencyName() {
		return dutyFeeTaxAgencyName;
	}

	public void setDutyFeeTaxAgencyName(String dutyFeeTaxAgencyName) {
		this.dutyFeeTaxAgencyName = dutyFeeTaxAgencyName;
	}

	public DutyFeeTaxInformation dutyFeeTaxBasisPrice(QualifiedValues dutyFeeTaxBasisPrice) {
		this.dutyFeeTaxBasisPrice = dutyFeeTaxBasisPrice;
		return this;
	}

	/**
	 * Get dutyFeeTaxBasisPrice
	 * 
	 * @return dutyFeeTaxBasisPrice
	 **/
	@ApiModelProperty(value = "")
	public QualifiedValues getDutyFeeTaxBasisPrice() {
		return dutyFeeTaxBasisPrice;
	}

	public void setDutyFeeTaxBasisPrice(QualifiedValues dutyFeeTaxBasisPrice) {
		this.dutyFeeTaxBasisPrice = dutyFeeTaxBasisPrice;
	}

	public DutyFeeTaxInformation dutyFeeTaxClassificationCode(String dutyFeeTaxClassificationCode) {
		this.dutyFeeTaxClassificationCode = dutyFeeTaxClassificationCode;
		return this;
	}

	/**
	 * Get dutyFeeTaxClassificationCode
	 * 
	 * @return dutyFeeTaxClassificationCode
	 **/
	@ApiModelProperty(value = "")
	public String getDutyFeeTaxClassificationCode() {
		return dutyFeeTaxClassificationCode;
	}

	public void setDutyFeeTaxClassificationCode(String dutyFeeTaxClassificationCode) {
		this.dutyFeeTaxClassificationCode = dutyFeeTaxClassificationCode;
	}

	public DutyFeeTaxInformation dutyFeeTaxCountryCode(CodifiedValue dutyFeeTaxCountryCode) {
		this.dutyFeeTaxCountryCode = dutyFeeTaxCountryCode;
		return this;
	}

	/**
	 * Get dutyFeeTaxCountryCode
	 * 
	 * @return dutyFeeTaxCountryCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getDutyFeeTaxCountryCode() {
		return dutyFeeTaxCountryCode;
	}

	public void setDutyFeeTaxCountryCode(CodifiedValue dutyFeeTaxCountryCode) {
		this.dutyFeeTaxCountryCode = dutyFeeTaxCountryCode;
	}

	public DutyFeeTaxInformation dutyFeeTaxCountrySubdivisionShipFromCode(
			String dutyFeeTaxCountrySubdivisionShipFromCode) {
		this.dutyFeeTaxCountrySubdivisionShipFromCode = dutyFeeTaxCountrySubdivisionShipFromCode;
		return this;
	}

	/**
	 * Get dutyFeeTaxCountrySubdivisionShipFromCode
	 * 
	 * @return dutyFeeTaxCountrySubdivisionShipFromCode
	 **/
	@ApiModelProperty(value = "")
	public String getDutyFeeTaxCountrySubdivisionShipFromCode() {
		return dutyFeeTaxCountrySubdivisionShipFromCode;
	}

	public void setDutyFeeTaxCountrySubdivisionShipFromCode(String dutyFeeTaxCountrySubdivisionShipFromCode) {
		this.dutyFeeTaxCountrySubdivisionShipFromCode = dutyFeeTaxCountrySubdivisionShipFromCode;
	}

	public DutyFeeTaxInformation dutyFeeTaxCountrySubdivisionShipToCode(Values dutyFeeTaxCountrySubdivisionShipToCode) {
		this.dutyFeeTaxCountrySubdivisionShipToCode = dutyFeeTaxCountrySubdivisionShipToCode;
		return this;
	}

	/**
	 * Get dutyFeeTaxCountrySubdivisionShipToCode
	 * 
	 * @return dutyFeeTaxCountrySubdivisionShipToCode
	 **/
	@ApiModelProperty(value = "")
	public Values getDutyFeeTaxCountrySubdivisionShipToCode() {
		return dutyFeeTaxCountrySubdivisionShipToCode;
	}

	public void setDutyFeeTaxCountrySubdivisionShipToCode(Values dutyFeeTaxCountrySubdivisionShipToCode) {
		this.dutyFeeTaxCountrySubdivisionShipToCode = dutyFeeTaxCountrySubdivisionShipToCode;
	}

	public DutyFeeTaxInformation dutyFeeTaxEffectiveEndDateTime(String dutyFeeTaxEffectiveEndDateTime) {
		this.dutyFeeTaxEffectiveEndDateTime = dutyFeeTaxEffectiveEndDateTime;
		return this;
	}

	/**
	 * Get dutyFeeTaxEffectiveEndDateTime
	 * 
	 * @return dutyFeeTaxEffectiveEndDateTime
	 **/
	@ApiModelProperty(value = "")
	public String getDutyFeeTaxEffectiveEndDateTime() {
		return dutyFeeTaxEffectiveEndDateTime;
	}

	public void setDutyFeeTaxEffectiveEndDateTime(String dutyFeeTaxEffectiveEndDateTime) {
		this.dutyFeeTaxEffectiveEndDateTime = dutyFeeTaxEffectiveEndDateTime;
	}

	public DutyFeeTaxInformation dutyFeeTaxEffectiveStartDateTime(String dutyFeeTaxEffectiveStartDateTime) {
		this.dutyFeeTaxEffectiveStartDateTime = dutyFeeTaxEffectiveStartDateTime;
		return this;
	}

	/**
	 * Get dutyFeeTaxEffectiveStartDateTime
	 * 
	 * @return dutyFeeTaxEffectiveStartDateTime
	 **/
	@ApiModelProperty(value = "")
	public String getDutyFeeTaxEffectiveStartDateTime() {
		return dutyFeeTaxEffectiveStartDateTime;
	}

	public void setDutyFeeTaxEffectiveStartDateTime(String dutyFeeTaxEffectiveStartDateTime) {
		this.dutyFeeTaxEffectiveStartDateTime = dutyFeeTaxEffectiveStartDateTime;
	}

	public DutyFeeTaxInformation dutyFeeTaxLegalProvision(LanguageLabels dutyFeeTaxLegalProvision) {
		this.dutyFeeTaxLegalProvision = dutyFeeTaxLegalProvision;
		return this;
	}

	/**
	 * Get dutyFeeTaxLegalProvision
	 * 
	 * @return dutyFeeTaxLegalProvision
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getDutyFeeTaxLegalProvision() {
		return dutyFeeTaxLegalProvision;
	}

	public void setDutyFeeTaxLegalProvision(LanguageLabels dutyFeeTaxLegalProvision) {
		this.dutyFeeTaxLegalProvision = dutyFeeTaxLegalProvision;
	}

	public DutyFeeTaxInformation dutyFeeTaxTypeCode(String dutyFeeTaxTypeCode) {
		this.dutyFeeTaxTypeCode = dutyFeeTaxTypeCode;
		return this;
	}

	/**
	 * Get dutyFeeTaxTypeCode
	 * 
	 * @return dutyFeeTaxTypeCode
	 **/
	@ApiModelProperty(value = "")
	public String getDutyFeeTaxTypeCode() {
		return dutyFeeTaxTypeCode;
	}

	public void setDutyFeeTaxTypeCode(String dutyFeeTaxTypeCode) {
		this.dutyFeeTaxTypeCode = dutyFeeTaxTypeCode;
	}

	public DutyFeeTaxInformation dutyFeeTaxTypeDescription(LanguageLabels dutyFeeTaxTypeDescription) {
		this.dutyFeeTaxTypeDescription = dutyFeeTaxTypeDescription;
		return this;
	}

	/**
	 * Get dutyFeeTaxTypeDescription
	 * 
	 * @return dutyFeeTaxTypeDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getDutyFeeTaxTypeDescription() {
		return dutyFeeTaxTypeDescription;
	}

	public void setDutyFeeTaxTypeDescription(LanguageLabels dutyFeeTaxTypeDescription) {
		this.dutyFeeTaxTypeDescription = dutyFeeTaxTypeDescription;
	}

	public DutyFeeTaxInformation isTradeItemACombinationItem(CodifiedValue isTradeItemACombinationItem) {
		this.isTradeItemACombinationItem = isTradeItemACombinationItem;
		return this;
	}

	/**
	 * Get isTradeItemACombinationItem
	 * 
	 * @return isTradeItemACombinationItem
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getIsTradeItemACombinationItem() {
		return isTradeItemACombinationItem;
	}

	public void setIsTradeItemACombinationItem(CodifiedValue isTradeItemACombinationItem) {
		this.isTradeItemACombinationItem = isTradeItemACombinationItem;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DutyFeeTaxInformation dutyFeeTaxInformation = (DutyFeeTaxInformation) o;
		return Objects.equals(this.dutyFeeTax, dutyFeeTaxInformation.dutyFeeTax)
				&& Objects.equals(this.dutyFeeTaxAgencyCode, dutyFeeTaxInformation.dutyFeeTaxAgencyCode)
				&& Objects.equals(this.dutyFeeTaxAgencyName, dutyFeeTaxInformation.dutyFeeTaxAgencyName)
				&& Objects.equals(this.dutyFeeTaxBasisPrice, dutyFeeTaxInformation.dutyFeeTaxBasisPrice)
				&& Objects.equals(this.dutyFeeTaxClassificationCode, dutyFeeTaxInformation.dutyFeeTaxClassificationCode)
				&& Objects.equals(this.dutyFeeTaxCountryCode, dutyFeeTaxInformation.dutyFeeTaxCountryCode)
				&& Objects.equals(this.dutyFeeTaxCountrySubdivisionShipFromCode,
						dutyFeeTaxInformation.dutyFeeTaxCountrySubdivisionShipFromCode)
				&& Objects.equals(this.dutyFeeTaxCountrySubdivisionShipToCode,
						dutyFeeTaxInformation.dutyFeeTaxCountrySubdivisionShipToCode)
				&& Objects.equals(this.dutyFeeTaxEffectiveEndDateTime,
						dutyFeeTaxInformation.dutyFeeTaxEffectiveEndDateTime)
				&& Objects.equals(this.dutyFeeTaxEffectiveStartDateTime,
						dutyFeeTaxInformation.dutyFeeTaxEffectiveStartDateTime)
				&& Objects.equals(this.dutyFeeTaxLegalProvision, dutyFeeTaxInformation.dutyFeeTaxLegalProvision)
				&& Objects.equals(this.dutyFeeTaxTypeCode, dutyFeeTaxInformation.dutyFeeTaxTypeCode)
				&& Objects.equals(this.dutyFeeTaxTypeDescription, dutyFeeTaxInformation.dutyFeeTaxTypeDescription)
				&& Objects.equals(this.isTradeItemACombinationItem, dutyFeeTaxInformation.isTradeItemACombinationItem);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dutyFeeTax, dutyFeeTaxAgencyCode, dutyFeeTaxAgencyName, dutyFeeTaxBasisPrice,
				dutyFeeTaxClassificationCode, dutyFeeTaxCountryCode, dutyFeeTaxCountrySubdivisionShipFromCode,
				dutyFeeTaxCountrySubdivisionShipToCode, dutyFeeTaxEffectiveEndDateTime,
				dutyFeeTaxEffectiveStartDateTime, dutyFeeTaxLegalProvision, dutyFeeTaxTypeCode,
				dutyFeeTaxTypeDescription, isTradeItemACombinationItem);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DutyFeeTaxInformation {\n");

		sb.append("    dutyFeeTax: ").append(toIndentedString(dutyFeeTax)).append("\n");
		sb.append("    dutyFeeTaxAgencyCode: ").append(toIndentedString(dutyFeeTaxAgencyCode)).append("\n");
		sb.append("    dutyFeeTaxAgencyName: ").append(toIndentedString(dutyFeeTaxAgencyName)).append("\n");
		sb.append("    dutyFeeTaxBasisPrice: ").append(toIndentedString(dutyFeeTaxBasisPrice)).append("\n");
		sb.append("    dutyFeeTaxClassificationCode: ").append(toIndentedString(dutyFeeTaxClassificationCode))
				.append("\n");
		sb.append("    dutyFeeTaxCountryCode: ").append(toIndentedString(dutyFeeTaxCountryCode)).append("\n");
		sb.append("    dutyFeeTaxCountrySubdivisionShipFromCode: ")
				.append(toIndentedString(dutyFeeTaxCountrySubdivisionShipFromCode)).append("\n");
		sb.append("    dutyFeeTaxCountrySubdivisionShipToCode: ")
				.append(toIndentedString(dutyFeeTaxCountrySubdivisionShipToCode)).append("\n");
		sb.append("    dutyFeeTaxEffectiveEndDateTime: ").append(toIndentedString(dutyFeeTaxEffectiveEndDateTime))
				.append("\n");
		sb.append("    dutyFeeTaxEffectiveStartDateTime: ").append(toIndentedString(dutyFeeTaxEffectiveStartDateTime))
				.append("\n");
		sb.append("    dutyFeeTaxLegalProvision: ").append(toIndentedString(dutyFeeTaxLegalProvision)).append("\n");
		sb.append("    dutyFeeTaxTypeCode: ").append(toIndentedString(dutyFeeTaxTypeCode)).append("\n");
		sb.append("    dutyFeeTaxTypeDescription: ").append(toIndentedString(dutyFeeTaxTypeDescription)).append("\n");
		sb.append("    isTradeItemACombinationItem: ").append(toIndentedString(isTradeItemACombinationItem))
				.append("\n");
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
