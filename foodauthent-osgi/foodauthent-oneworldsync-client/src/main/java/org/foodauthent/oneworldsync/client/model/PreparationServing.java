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
import org.foodauthent.oneworldsync.client.model.LanguageLabels;
import org.foodauthent.oneworldsync.client.model.ProductYieldInformation;
import org.foodauthent.oneworldsync.client.model.QualifiedValues;

/**
 * PreparationServing
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class PreparationServing {
	@JsonProperty("convenienceLevelPercent")
	private String convenienceLevelPercent = null;

	@JsonProperty("maximumOptimumConsumptionTemperature")
	private QualifiedValues maximumOptimumConsumptionTemperature = null;

	@JsonProperty("minimumOptimumConsumptionTemperature")
	private QualifiedValues minimumOptimumConsumptionTemperature = null;

	@JsonProperty("preparationConsumptionPrecautions")
	private LanguageLabels preparationConsumptionPrecautions = null;

	@JsonProperty("preparationInstructions")
	private LanguageLabels preparationInstructions = null;

	@JsonProperty("preparationTypeCode")
	private CodifiedValue preparationTypeCode = null;

	@JsonProperty("productYieldInformation")
	private List<ProductYieldInformation> productYieldInformation = null;

	@JsonProperty("servingSuggestion")
	private LanguageLabels servingSuggestion = null;

	public PreparationServing convenienceLevelPercent(String convenienceLevelPercent) {
		this.convenienceLevelPercent = convenienceLevelPercent;
		return this;
	}

	/**
	 * Get convenienceLevelPercent
	 * 
	 * @return convenienceLevelPercent
	 **/
	@ApiModelProperty(value = "")
	public String getConvenienceLevelPercent() {
		return convenienceLevelPercent;
	}

	public void setConvenienceLevelPercent(String convenienceLevelPercent) {
		this.convenienceLevelPercent = convenienceLevelPercent;
	}

	public PreparationServing maximumOptimumConsumptionTemperature(
			QualifiedValues maximumOptimumConsumptionTemperature) {
		this.maximumOptimumConsumptionTemperature = maximumOptimumConsumptionTemperature;
		return this;
	}

	/**
	 * Get maximumOptimumConsumptionTemperature
	 * 
	 * @return maximumOptimumConsumptionTemperature
	 **/
	@ApiModelProperty(value = "")
	public QualifiedValues getMaximumOptimumConsumptionTemperature() {
		return maximumOptimumConsumptionTemperature;
	}

	public void setMaximumOptimumConsumptionTemperature(QualifiedValues maximumOptimumConsumptionTemperature) {
		this.maximumOptimumConsumptionTemperature = maximumOptimumConsumptionTemperature;
	}

	public PreparationServing minimumOptimumConsumptionTemperature(
			QualifiedValues minimumOptimumConsumptionTemperature) {
		this.minimumOptimumConsumptionTemperature = minimumOptimumConsumptionTemperature;
		return this;
	}

	/**
	 * Get minimumOptimumConsumptionTemperature
	 * 
	 * @return minimumOptimumConsumptionTemperature
	 **/
	@ApiModelProperty(value = "")
	public QualifiedValues getMinimumOptimumConsumptionTemperature() {
		return minimumOptimumConsumptionTemperature;
	}

	public void setMinimumOptimumConsumptionTemperature(QualifiedValues minimumOptimumConsumptionTemperature) {
		this.minimumOptimumConsumptionTemperature = minimumOptimumConsumptionTemperature;
	}

	public PreparationServing preparationConsumptionPrecautions(LanguageLabels preparationConsumptionPrecautions) {
		this.preparationConsumptionPrecautions = preparationConsumptionPrecautions;
		return this;
	}

	/**
	 * Get preparationConsumptionPrecautions
	 * 
	 * @return preparationConsumptionPrecautions
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getPreparationConsumptionPrecautions() {
		return preparationConsumptionPrecautions;
	}

	public void setPreparationConsumptionPrecautions(LanguageLabels preparationConsumptionPrecautions) {
		this.preparationConsumptionPrecautions = preparationConsumptionPrecautions;
	}

	public PreparationServing preparationInstructions(LanguageLabels preparationInstructions) {
		this.preparationInstructions = preparationInstructions;
		return this;
	}

	/**
	 * Get preparationInstructions
	 * 
	 * @return preparationInstructions
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getPreparationInstructions() {
		return preparationInstructions;
	}

	public void setPreparationInstructions(LanguageLabels preparationInstructions) {
		this.preparationInstructions = preparationInstructions;
	}

	public PreparationServing preparationTypeCode(CodifiedValue preparationTypeCode) {
		this.preparationTypeCode = preparationTypeCode;
		return this;
	}

	/**
	 * Get preparationTypeCode
	 * 
	 * @return preparationTypeCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getPreparationTypeCode() {
		return preparationTypeCode;
	}

	public void setPreparationTypeCode(CodifiedValue preparationTypeCode) {
		this.preparationTypeCode = preparationTypeCode;
	}

	public PreparationServing productYieldInformation(List<ProductYieldInformation> productYieldInformation) {
		this.productYieldInformation = productYieldInformation;
		return this;
	}

	public PreparationServing addProductYieldInformationItem(ProductYieldInformation productYieldInformationItem) {
		if (this.productYieldInformation == null) {
			this.productYieldInformation = new ArrayList<ProductYieldInformation>();
		}
		this.productYieldInformation.add(productYieldInformationItem);
		return this;
	}

	/**
	 * Get productYieldInformation
	 * 
	 * @return productYieldInformation
	 **/
	@ApiModelProperty(value = "")
	public List<ProductYieldInformation> getProductYieldInformation() {
		return productYieldInformation;
	}

	public void setProductYieldInformation(List<ProductYieldInformation> productYieldInformation) {
		this.productYieldInformation = productYieldInformation;
	}

	public PreparationServing servingSuggestion(LanguageLabels servingSuggestion) {
		this.servingSuggestion = servingSuggestion;
		return this;
	}

	/**
	 * Get servingSuggestion
	 * 
	 * @return servingSuggestion
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getServingSuggestion() {
		return servingSuggestion;
	}

	public void setServingSuggestion(LanguageLabels servingSuggestion) {
		this.servingSuggestion = servingSuggestion;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PreparationServing preparationServing = (PreparationServing) o;
		return Objects.equals(this.convenienceLevelPercent, preparationServing.convenienceLevelPercent)
				&& Objects.equals(this.maximumOptimumConsumptionTemperature,
						preparationServing.maximumOptimumConsumptionTemperature)
				&& Objects.equals(this.minimumOptimumConsumptionTemperature,
						preparationServing.minimumOptimumConsumptionTemperature)
				&& Objects.equals(this.preparationConsumptionPrecautions,
						preparationServing.preparationConsumptionPrecautions)
				&& Objects.equals(this.preparationInstructions, preparationServing.preparationInstructions)
				&& Objects.equals(this.preparationTypeCode, preparationServing.preparationTypeCode)
				&& Objects.equals(this.productYieldInformation, preparationServing.productYieldInformation)
				&& Objects.equals(this.servingSuggestion, preparationServing.servingSuggestion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(convenienceLevelPercent, maximumOptimumConsumptionTemperature,
				minimumOptimumConsumptionTemperature, preparationConsumptionPrecautions, preparationInstructions,
				preparationTypeCode, productYieldInformation, servingSuggestion);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PreparationServing {\n");

		sb.append("    convenienceLevelPercent: ").append(toIndentedString(convenienceLevelPercent)).append("\n");
		sb.append("    maximumOptimumConsumptionTemperature: ")
				.append(toIndentedString(maximumOptimumConsumptionTemperature)).append("\n");
		sb.append("    minimumOptimumConsumptionTemperature: ")
				.append(toIndentedString(minimumOptimumConsumptionTemperature)).append("\n");
		sb.append("    preparationConsumptionPrecautions: ").append(toIndentedString(preparationConsumptionPrecautions))
				.append("\n");
		sb.append("    preparationInstructions: ").append(toIndentedString(preparationInstructions)).append("\n");
		sb.append("    preparationTypeCode: ").append(toIndentedString(preparationTypeCode)).append("\n");
		sb.append("    productYieldInformation: ").append(toIndentedString(productYieldInformation)).append("\n");
		sb.append("    servingSuggestion: ").append(toIndentedString(servingSuggestion)).append("\n");
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