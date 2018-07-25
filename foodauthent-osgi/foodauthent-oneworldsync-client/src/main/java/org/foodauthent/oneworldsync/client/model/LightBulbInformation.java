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
import org.foodauthent.oneworldsync.client.model.CodifiedValue;
import org.foodauthent.oneworldsync.client.model.LanguageLabels;

/**
 * LightBulbInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class LightBulbInformation {
	@JsonProperty("lightBulbLampTypeCode")
	private CodifiedValue lightBulbLampTypeCode = null;

	@JsonProperty("lightBulbTypeDescription")
	private LanguageLabels lightBulbTypeDescription = null;

	public LightBulbInformation lightBulbLampTypeCode(CodifiedValue lightBulbLampTypeCode) {
		this.lightBulbLampTypeCode = lightBulbLampTypeCode;
		return this;
	}

	/**
	 * Get lightBulbLampTypeCode
	 * 
	 * @return lightBulbLampTypeCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getLightBulbLampTypeCode() {
		return lightBulbLampTypeCode;
	}

	public void setLightBulbLampTypeCode(CodifiedValue lightBulbLampTypeCode) {
		this.lightBulbLampTypeCode = lightBulbLampTypeCode;
	}

	public LightBulbInformation lightBulbTypeDescription(LanguageLabels lightBulbTypeDescription) {
		this.lightBulbTypeDescription = lightBulbTypeDescription;
		return this;
	}

	/**
	 * Get lightBulbTypeDescription
	 * 
	 * @return lightBulbTypeDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getLightBulbTypeDescription() {
		return lightBulbTypeDescription;
	}

	public void setLightBulbTypeDescription(LanguageLabels lightBulbTypeDescription) {
		this.lightBulbTypeDescription = lightBulbTypeDescription;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LightBulbInformation lightBulbInformation = (LightBulbInformation) o;
		return Objects.equals(this.lightBulbLampTypeCode, lightBulbInformation.lightBulbLampTypeCode)
				&& Objects.equals(this.lightBulbTypeDescription, lightBulbInformation.lightBulbTypeDescription);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lightBulbLampTypeCode, lightBulbTypeDescription);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LightBulbInformation {\n");

		sb.append("    lightBulbLampTypeCode: ").append(toIndentedString(lightBulbLampTypeCode)).append("\n");
		sb.append("    lightBulbTypeDescription: ").append(toIndentedString(lightBulbTypeDescription)).append("\n");
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
