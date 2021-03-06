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
import org.foodauthent.oneworldsync.client.model.LanguageLabels;
import org.foodauthent.oneworldsync.client.model.ReferencedFileInformation;
import org.foodauthent.oneworldsync.client.model.WarrantyConditions;

/**
 * WarrantyInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class WarrantyInformation {
	@JsonProperty("referencedFileInformation")
	private List<ReferencedFileInformation> referencedFileInformation = null;

	@JsonProperty("warrantyConditions")
	private List<WarrantyConditions> warrantyConditions = null;

	@JsonProperty("warrantyDescription")
	private LanguageLabels warrantyDescription = null;

	@JsonProperty("warrantyEffectiveDateType")
	private String warrantyEffectiveDateType = null;

	@JsonProperty("warrantyType")
	private String warrantyType = null;

	public WarrantyInformation referencedFileInformation(List<ReferencedFileInformation> referencedFileInformation) {
		this.referencedFileInformation = referencedFileInformation;
		return this;
	}

	public WarrantyInformation addReferencedFileInformationItem(
			ReferencedFileInformation referencedFileInformationItem) {
		if (this.referencedFileInformation == null) {
			this.referencedFileInformation = new ArrayList<ReferencedFileInformation>();
		}
		this.referencedFileInformation.add(referencedFileInformationItem);
		return this;
	}

	/**
	 * Get referencedFileInformation
	 * 
	 * @return referencedFileInformation
	 **/
	@ApiModelProperty(value = "")
	public List<ReferencedFileInformation> getReferencedFileInformation() {
		return referencedFileInformation;
	}

	public void setReferencedFileInformation(List<ReferencedFileInformation> referencedFileInformation) {
		this.referencedFileInformation = referencedFileInformation;
	}

	public WarrantyInformation warrantyConditions(List<WarrantyConditions> warrantyConditions) {
		this.warrantyConditions = warrantyConditions;
		return this;
	}

	public WarrantyInformation addWarrantyConditionsItem(WarrantyConditions warrantyConditionsItem) {
		if (this.warrantyConditions == null) {
			this.warrantyConditions = new ArrayList<WarrantyConditions>();
		}
		this.warrantyConditions.add(warrantyConditionsItem);
		return this;
	}

	/**
	 * Get warrantyConditions
	 * 
	 * @return warrantyConditions
	 **/
	@ApiModelProperty(value = "")
	public List<WarrantyConditions> getWarrantyConditions() {
		return warrantyConditions;
	}

	public void setWarrantyConditions(List<WarrantyConditions> warrantyConditions) {
		this.warrantyConditions = warrantyConditions;
	}

	public WarrantyInformation warrantyDescription(LanguageLabels warrantyDescription) {
		this.warrantyDescription = warrantyDescription;
		return this;
	}

	/**
	 * Get warrantyDescription
	 * 
	 * @return warrantyDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getWarrantyDescription() {
		return warrantyDescription;
	}

	public void setWarrantyDescription(LanguageLabels warrantyDescription) {
		this.warrantyDescription = warrantyDescription;
	}

	public WarrantyInformation warrantyEffectiveDateType(String warrantyEffectiveDateType) {
		this.warrantyEffectiveDateType = warrantyEffectiveDateType;
		return this;
	}

	/**
	 * Get warrantyEffectiveDateType
	 * 
	 * @return warrantyEffectiveDateType
	 **/
	@ApiModelProperty(value = "")
	public String getWarrantyEffectiveDateType() {
		return warrantyEffectiveDateType;
	}

	public void setWarrantyEffectiveDateType(String warrantyEffectiveDateType) {
		this.warrantyEffectiveDateType = warrantyEffectiveDateType;
	}

	public WarrantyInformation warrantyType(String warrantyType) {
		this.warrantyType = warrantyType;
		return this;
	}

	/**
	 * Get warrantyType
	 * 
	 * @return warrantyType
	 **/
	@ApiModelProperty(value = "")
	public String getWarrantyType() {
		return warrantyType;
	}

	public void setWarrantyType(String warrantyType) {
		this.warrantyType = warrantyType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WarrantyInformation warrantyInformation = (WarrantyInformation) o;
		return Objects.equals(this.referencedFileInformation, warrantyInformation.referencedFileInformation)
				&& Objects.equals(this.warrantyConditions, warrantyInformation.warrantyConditions)
				&& Objects.equals(this.warrantyDescription, warrantyInformation.warrantyDescription)
				&& Objects.equals(this.warrantyEffectiveDateType, warrantyInformation.warrantyEffectiveDateType)
				&& Objects.equals(this.warrantyType, warrantyInformation.warrantyType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(referencedFileInformation, warrantyConditions, warrantyDescription,
				warrantyEffectiveDateType, warrantyType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WarrantyInformation {\n");

		sb.append("    referencedFileInformation: ").append(toIndentedString(referencedFileInformation)).append("\n");
		sb.append("    warrantyConditions: ").append(toIndentedString(warrantyConditions)).append("\n");
		sb.append("    warrantyDescription: ").append(toIndentedString(warrantyDescription)).append("\n");
		sb.append("    warrantyEffectiveDateType: ").append(toIndentedString(warrantyEffectiveDateType)).append("\n");
		sb.append("    warrantyType: ").append(toIndentedString(warrantyType)).append("\n");
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
