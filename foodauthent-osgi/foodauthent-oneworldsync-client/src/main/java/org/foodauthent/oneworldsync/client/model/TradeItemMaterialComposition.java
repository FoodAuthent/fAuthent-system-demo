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
import org.foodauthent.oneworldsync.client.model.MaterialCountryOfOrigin;
import org.foodauthent.oneworldsync.client.model.QualifiedValue;

/**
 * TradeItemMaterialComposition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class TradeItemMaterialComposition {
	@JsonProperty("materialCode")
	private String materialCode = null;

	@JsonProperty("materialContent")
	private LanguageLabels materialContent = null;

	@JsonProperty("materialCountryOfOrigin")
	private List<MaterialCountryOfOrigin> materialCountryOfOrigin = null;

	@JsonProperty("materialPercentage")
	private String materialPercentage = null;

	@JsonProperty("materialTreatment")
	private LanguageLabels materialTreatment = null;

	@JsonProperty("materialWeight")
	private QualifiedValue materialWeight = null;

	public TradeItemMaterialComposition materialCode(String materialCode) {
		this.materialCode = materialCode;
		return this;
	}

	/**
	 * Get materialCode
	 * 
	 * @return materialCode
	 **/
	@ApiModelProperty(value = "")
	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public TradeItemMaterialComposition materialContent(LanguageLabels materialContent) {
		this.materialContent = materialContent;
		return this;
	}

	/**
	 * Get materialContent
	 * 
	 * @return materialContent
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getMaterialContent() {
		return materialContent;
	}

	public void setMaterialContent(LanguageLabels materialContent) {
		this.materialContent = materialContent;
	}

	public TradeItemMaterialComposition materialCountryOfOrigin(List<MaterialCountryOfOrigin> materialCountryOfOrigin) {
		this.materialCountryOfOrigin = materialCountryOfOrigin;
		return this;
	}

	public TradeItemMaterialComposition addMaterialCountryOfOriginItem(
			MaterialCountryOfOrigin materialCountryOfOriginItem) {
		if (this.materialCountryOfOrigin == null) {
			this.materialCountryOfOrigin = new ArrayList<MaterialCountryOfOrigin>();
		}
		this.materialCountryOfOrigin.add(materialCountryOfOriginItem);
		return this;
	}

	/**
	 * Get materialCountryOfOrigin
	 * 
	 * @return materialCountryOfOrigin
	 **/
	@ApiModelProperty(value = "")
	public List<MaterialCountryOfOrigin> getMaterialCountryOfOrigin() {
		return materialCountryOfOrigin;
	}

	public void setMaterialCountryOfOrigin(List<MaterialCountryOfOrigin> materialCountryOfOrigin) {
		this.materialCountryOfOrigin = materialCountryOfOrigin;
	}

	public TradeItemMaterialComposition materialPercentage(String materialPercentage) {
		this.materialPercentage = materialPercentage;
		return this;
	}

	/**
	 * Get materialPercentage
	 * 
	 * @return materialPercentage
	 **/
	@ApiModelProperty(value = "")
	public String getMaterialPercentage() {
		return materialPercentage;
	}

	public void setMaterialPercentage(String materialPercentage) {
		this.materialPercentage = materialPercentage;
	}

	public TradeItemMaterialComposition materialTreatment(LanguageLabels materialTreatment) {
		this.materialTreatment = materialTreatment;
		return this;
	}

	/**
	 * Get materialTreatment
	 * 
	 * @return materialTreatment
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getMaterialTreatment() {
		return materialTreatment;
	}

	public void setMaterialTreatment(LanguageLabels materialTreatment) {
		this.materialTreatment = materialTreatment;
	}

	public TradeItemMaterialComposition materialWeight(QualifiedValue materialWeight) {
		this.materialWeight = materialWeight;
		return this;
	}

	/**
	 * Get materialWeight
	 * 
	 * @return materialWeight
	 **/
	@ApiModelProperty(value = "")
	public QualifiedValue getMaterialWeight() {
		return materialWeight;
	}

	public void setMaterialWeight(QualifiedValue materialWeight) {
		this.materialWeight = materialWeight;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TradeItemMaterialComposition tradeItemMaterialComposition = (TradeItemMaterialComposition) o;
		return Objects.equals(this.materialCode, tradeItemMaterialComposition.materialCode)
				&& Objects.equals(this.materialContent, tradeItemMaterialComposition.materialContent)
				&& Objects.equals(this.materialCountryOfOrigin, tradeItemMaterialComposition.materialCountryOfOrigin)
				&& Objects.equals(this.materialPercentage, tradeItemMaterialComposition.materialPercentage)
				&& Objects.equals(this.materialTreatment, tradeItemMaterialComposition.materialTreatment)
				&& Objects.equals(this.materialWeight, tradeItemMaterialComposition.materialWeight);
	}

	@Override
	public int hashCode() {
		return Objects.hash(materialCode, materialContent, materialCountryOfOrigin, materialPercentage,
				materialTreatment, materialWeight);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TradeItemMaterialComposition {\n");

		sb.append("    materialCode: ").append(toIndentedString(materialCode)).append("\n");
		sb.append("    materialContent: ").append(toIndentedString(materialContent)).append("\n");
		sb.append("    materialCountryOfOrigin: ").append(toIndentedString(materialCountryOfOrigin)).append("\n");
		sb.append("    materialPercentage: ").append(toIndentedString(materialPercentage)).append("\n");
		sb.append("    materialTreatment: ").append(toIndentedString(materialTreatment)).append("\n");
		sb.append("    materialWeight: ").append(toIndentedString(materialWeight)).append("\n");
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
