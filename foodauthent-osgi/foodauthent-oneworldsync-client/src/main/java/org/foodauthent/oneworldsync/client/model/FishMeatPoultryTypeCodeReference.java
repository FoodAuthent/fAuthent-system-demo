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

/**
 * FishMeatPoultryTypeCodeReference
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class FishMeatPoultryTypeCodeReference {
	@JsonProperty("codeDescription")
	private String codeDescription = null;

	@JsonProperty("codeListAgencyCode")
	private String codeListAgencyCode = null;

	@JsonProperty("codeListAgencyCodeListVersion")
	private String codeListAgencyCodeListVersion = null;

	@JsonProperty("codeListAgencyName")
	private String codeListAgencyName = null;

	@JsonProperty("codeListName")
	private String codeListName = null;

	@JsonProperty("codeListURI")
	private String codeListURI = null;

	@JsonProperty("codeListVersion")
	private String codeListVersion = null;

	@JsonProperty("fishMeatPoultryTypeCodeReferenceValue")
	private String fishMeatPoultryTypeCodeReferenceValue = null;

	public FishMeatPoultryTypeCodeReference codeDescription(String codeDescription) {
		this.codeDescription = codeDescription;
		return this;
	}

	/**
	 * Get codeDescription
	 * 
	 * @return codeDescription
	 **/
	@ApiModelProperty(value = "")
	public String getCodeDescription() {
		return codeDescription;
	}

	public void setCodeDescription(String codeDescription) {
		this.codeDescription = codeDescription;
	}

	public FishMeatPoultryTypeCodeReference codeListAgencyCode(String codeListAgencyCode) {
		this.codeListAgencyCode = codeListAgencyCode;
		return this;
	}

	/**
	 * Get codeListAgencyCode
	 * 
	 * @return codeListAgencyCode
	 **/
	@ApiModelProperty(value = "")
	public String getCodeListAgencyCode() {
		return codeListAgencyCode;
	}

	public void setCodeListAgencyCode(String codeListAgencyCode) {
		this.codeListAgencyCode = codeListAgencyCode;
	}

	public FishMeatPoultryTypeCodeReference codeListAgencyCodeListVersion(String codeListAgencyCodeListVersion) {
		this.codeListAgencyCodeListVersion = codeListAgencyCodeListVersion;
		return this;
	}

	/**
	 * Get codeListAgencyCodeListVersion
	 * 
	 * @return codeListAgencyCodeListVersion
	 **/
	@ApiModelProperty(value = "")
	public String getCodeListAgencyCodeListVersion() {
		return codeListAgencyCodeListVersion;
	}

	public void setCodeListAgencyCodeListVersion(String codeListAgencyCodeListVersion) {
		this.codeListAgencyCodeListVersion = codeListAgencyCodeListVersion;
	}

	public FishMeatPoultryTypeCodeReference codeListAgencyName(String codeListAgencyName) {
		this.codeListAgencyName = codeListAgencyName;
		return this;
	}

	/**
	 * Get codeListAgencyName
	 * 
	 * @return codeListAgencyName
	 **/
	@ApiModelProperty(value = "")
	public String getCodeListAgencyName() {
		return codeListAgencyName;
	}

	public void setCodeListAgencyName(String codeListAgencyName) {
		this.codeListAgencyName = codeListAgencyName;
	}

	public FishMeatPoultryTypeCodeReference codeListName(String codeListName) {
		this.codeListName = codeListName;
		return this;
	}

	/**
	 * Get codeListName
	 * 
	 * @return codeListName
	 **/
	@ApiModelProperty(value = "")
	public String getCodeListName() {
		return codeListName;
	}

	public void setCodeListName(String codeListName) {
		this.codeListName = codeListName;
	}

	public FishMeatPoultryTypeCodeReference codeListURI(String codeListURI) {
		this.codeListURI = codeListURI;
		return this;
	}

	/**
	 * Get codeListURI
	 * 
	 * @return codeListURI
	 **/
	@ApiModelProperty(value = "")
	public String getCodeListURI() {
		return codeListURI;
	}

	public void setCodeListURI(String codeListURI) {
		this.codeListURI = codeListURI;
	}

	public FishMeatPoultryTypeCodeReference codeListVersion(String codeListVersion) {
		this.codeListVersion = codeListVersion;
		return this;
	}

	/**
	 * Get codeListVersion
	 * 
	 * @return codeListVersion
	 **/
	@ApiModelProperty(value = "")
	public String getCodeListVersion() {
		return codeListVersion;
	}

	public void setCodeListVersion(String codeListVersion) {
		this.codeListVersion = codeListVersion;
	}

	public FishMeatPoultryTypeCodeReference fishMeatPoultryTypeCodeReferenceValue(
			String fishMeatPoultryTypeCodeReferenceValue) {
		this.fishMeatPoultryTypeCodeReferenceValue = fishMeatPoultryTypeCodeReferenceValue;
		return this;
	}

	/**
	 * Get fishMeatPoultryTypeCodeReferenceValue
	 * 
	 * @return fishMeatPoultryTypeCodeReferenceValue
	 **/
	@ApiModelProperty(value = "")
	public String getFishMeatPoultryTypeCodeReferenceValue() {
		return fishMeatPoultryTypeCodeReferenceValue;
	}

	public void setFishMeatPoultryTypeCodeReferenceValue(String fishMeatPoultryTypeCodeReferenceValue) {
		this.fishMeatPoultryTypeCodeReferenceValue = fishMeatPoultryTypeCodeReferenceValue;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FishMeatPoultryTypeCodeReference fishMeatPoultryTypeCodeReference = (FishMeatPoultryTypeCodeReference) o;
		return Objects.equals(this.codeDescription, fishMeatPoultryTypeCodeReference.codeDescription)
				&& Objects.equals(this.codeListAgencyCode, fishMeatPoultryTypeCodeReference.codeListAgencyCode)
				&& Objects.equals(this.codeListAgencyCodeListVersion,
						fishMeatPoultryTypeCodeReference.codeListAgencyCodeListVersion)
				&& Objects.equals(this.codeListAgencyName, fishMeatPoultryTypeCodeReference.codeListAgencyName)
				&& Objects.equals(this.codeListName, fishMeatPoultryTypeCodeReference.codeListName)
				&& Objects.equals(this.codeListURI, fishMeatPoultryTypeCodeReference.codeListURI)
				&& Objects.equals(this.codeListVersion, fishMeatPoultryTypeCodeReference.codeListVersion)
				&& Objects.equals(this.fishMeatPoultryTypeCodeReferenceValue,
						fishMeatPoultryTypeCodeReference.fishMeatPoultryTypeCodeReferenceValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codeDescription, codeListAgencyCode, codeListAgencyCodeListVersion, codeListAgencyName,
				codeListName, codeListURI, codeListVersion, fishMeatPoultryTypeCodeReferenceValue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FishMeatPoultryTypeCodeReference {\n");

		sb.append("    codeDescription: ").append(toIndentedString(codeDescription)).append("\n");
		sb.append("    codeListAgencyCode: ").append(toIndentedString(codeListAgencyCode)).append("\n");
		sb.append("    codeListAgencyCodeListVersion: ").append(toIndentedString(codeListAgencyCodeListVersion))
				.append("\n");
		sb.append("    codeListAgencyName: ").append(toIndentedString(codeListAgencyName)).append("\n");
		sb.append("    codeListName: ").append(toIndentedString(codeListName)).append("\n");
		sb.append("    codeListURI: ").append(toIndentedString(codeListURI)).append("\n");
		sb.append("    codeListVersion: ").append(toIndentedString(codeListVersion)).append("\n");
		sb.append("    fishMeatPoultryTypeCodeReferenceValue: ")
				.append(toIndentedString(fishMeatPoultryTypeCodeReferenceValue)).append("\n");
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
