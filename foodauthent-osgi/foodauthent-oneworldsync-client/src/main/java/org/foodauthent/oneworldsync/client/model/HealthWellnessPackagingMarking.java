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
import org.foodauthent.oneworldsync.client.model.CodifiedValues;
import org.foodauthent.oneworldsync.client.model.LanguageLabels;

/**
 * HealthWellnessPackagingMarking
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class HealthWellnessPackagingMarking {
	@JsonProperty("consumerSafetyInformation")
	private LanguageLabels consumerSafetyInformation = null;

	@JsonProperty("isPackagingLabelledWithDrugFacts")
	private CodifiedValue isPackagingLabelledWithDrugFacts = null;

	@JsonProperty("isPackagingMarkedWithIngredients")
	private String isPackagingMarkedWithIngredients = null;

	@JsonProperty("packagingMarkedDietAllergenCode")
	private CodifiedValues packagingMarkedDietAllergenCode = null;

	@JsonProperty("packagingMarkedFreeFromCode")
	private CodifiedValues packagingMarkedFreeFromCode = null;

	@JsonProperty("packagingMarkedNutritionLabelCode")
	private CodifiedValues packagingMarkedNutritionLabelCode = null;

	public HealthWellnessPackagingMarking consumerSafetyInformation(LanguageLabels consumerSafetyInformation) {
		this.consumerSafetyInformation = consumerSafetyInformation;
		return this;
	}

	/**
	 * Get consumerSafetyInformation
	 * 
	 * @return consumerSafetyInformation
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getConsumerSafetyInformation() {
		return consumerSafetyInformation;
	}

	public void setConsumerSafetyInformation(LanguageLabels consumerSafetyInformation) {
		this.consumerSafetyInformation = consumerSafetyInformation;
	}

	public HealthWellnessPackagingMarking isPackagingLabelledWithDrugFacts(
			CodifiedValue isPackagingLabelledWithDrugFacts) {
		this.isPackagingLabelledWithDrugFacts = isPackagingLabelledWithDrugFacts;
		return this;
	}

	/**
	 * Get isPackagingLabelledWithDrugFacts
	 * 
	 * @return isPackagingLabelledWithDrugFacts
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getIsPackagingLabelledWithDrugFacts() {
		return isPackagingLabelledWithDrugFacts;
	}

	public void setIsPackagingLabelledWithDrugFacts(CodifiedValue isPackagingLabelledWithDrugFacts) {
		this.isPackagingLabelledWithDrugFacts = isPackagingLabelledWithDrugFacts;
	}

	public HealthWellnessPackagingMarking isPackagingMarkedWithIngredients(String isPackagingMarkedWithIngredients) {
		this.isPackagingMarkedWithIngredients = isPackagingMarkedWithIngredients;
		return this;
	}

	/**
	 * Get isPackagingMarkedWithIngredients
	 * 
	 * @return isPackagingMarkedWithIngredients
	 **/
	@ApiModelProperty(value = "")
	public String getIsPackagingMarkedWithIngredients() {
		return isPackagingMarkedWithIngredients;
	}

	public void setIsPackagingMarkedWithIngredients(String isPackagingMarkedWithIngredients) {
		this.isPackagingMarkedWithIngredients = isPackagingMarkedWithIngredients;
	}

	public HealthWellnessPackagingMarking packagingMarkedDietAllergenCode(
			CodifiedValues packagingMarkedDietAllergenCode) {
		this.packagingMarkedDietAllergenCode = packagingMarkedDietAllergenCode;
		return this;
	}

	/**
	 * Get packagingMarkedDietAllergenCode
	 * 
	 * @return packagingMarkedDietAllergenCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValues getPackagingMarkedDietAllergenCode() {
		return packagingMarkedDietAllergenCode;
	}

	public void setPackagingMarkedDietAllergenCode(CodifiedValues packagingMarkedDietAllergenCode) {
		this.packagingMarkedDietAllergenCode = packagingMarkedDietAllergenCode;
	}

	public HealthWellnessPackagingMarking packagingMarkedFreeFromCode(CodifiedValues packagingMarkedFreeFromCode) {
		this.packagingMarkedFreeFromCode = packagingMarkedFreeFromCode;
		return this;
	}

	/**
	 * Get packagingMarkedFreeFromCode
	 * 
	 * @return packagingMarkedFreeFromCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValues getPackagingMarkedFreeFromCode() {
		return packagingMarkedFreeFromCode;
	}

	public void setPackagingMarkedFreeFromCode(CodifiedValues packagingMarkedFreeFromCode) {
		this.packagingMarkedFreeFromCode = packagingMarkedFreeFromCode;
	}

	public HealthWellnessPackagingMarking packagingMarkedNutritionLabelCode(
			CodifiedValues packagingMarkedNutritionLabelCode) {
		this.packagingMarkedNutritionLabelCode = packagingMarkedNutritionLabelCode;
		return this;
	}

	/**
	 * Get packagingMarkedNutritionLabelCode
	 * 
	 * @return packagingMarkedNutritionLabelCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValues getPackagingMarkedNutritionLabelCode() {
		return packagingMarkedNutritionLabelCode;
	}

	public void setPackagingMarkedNutritionLabelCode(CodifiedValues packagingMarkedNutritionLabelCode) {
		this.packagingMarkedNutritionLabelCode = packagingMarkedNutritionLabelCode;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HealthWellnessPackagingMarking healthWellnessPackagingMarking = (HealthWellnessPackagingMarking) o;
		return Objects.equals(this.consumerSafetyInformation, healthWellnessPackagingMarking.consumerSafetyInformation)
				&& Objects.equals(this.isPackagingLabelledWithDrugFacts,
						healthWellnessPackagingMarking.isPackagingLabelledWithDrugFacts)
				&& Objects.equals(this.isPackagingMarkedWithIngredients,
						healthWellnessPackagingMarking.isPackagingMarkedWithIngredients)
				&& Objects.equals(this.packagingMarkedDietAllergenCode,
						healthWellnessPackagingMarking.packagingMarkedDietAllergenCode)
				&& Objects.equals(this.packagingMarkedFreeFromCode,
						healthWellnessPackagingMarking.packagingMarkedFreeFromCode)
				&& Objects.equals(this.packagingMarkedNutritionLabelCode,
						healthWellnessPackagingMarking.packagingMarkedNutritionLabelCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(consumerSafetyInformation, isPackagingLabelledWithDrugFacts,
				isPackagingMarkedWithIngredients, packagingMarkedDietAllergenCode, packagingMarkedFreeFromCode,
				packagingMarkedNutritionLabelCode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HealthWellnessPackagingMarking {\n");

		sb.append("    consumerSafetyInformation: ").append(toIndentedString(consumerSafetyInformation)).append("\n");
		sb.append("    isPackagingLabelledWithDrugFacts: ").append(toIndentedString(isPackagingLabelledWithDrugFacts))
				.append("\n");
		sb.append("    isPackagingMarkedWithIngredients: ").append(toIndentedString(isPackagingMarkedWithIngredients))
				.append("\n");
		sb.append("    packagingMarkedDietAllergenCode: ").append(toIndentedString(packagingMarkedDietAllergenCode))
				.append("\n");
		sb.append("    packagingMarkedFreeFromCode: ").append(toIndentedString(packagingMarkedFreeFromCode))
				.append("\n");
		sb.append("    packagingMarkedNutritionLabelCode: ").append(toIndentedString(packagingMarkedNutritionLabelCode))
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
