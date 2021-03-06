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
import org.foodauthent.oneworldsync.client.model.Values;

/**
 * SustainabilityInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class SustainabilityInformation {
	@JsonProperty("doesTradeItemContainPesticide")
	private CodifiedValue doesTradeItemContainPesticide = null;

	@JsonProperty("isTradeItemROHSCompliant")
	private CodifiedValue isTradeItemROHSCompliant = null;

	@JsonProperty("isTradeItemRigidPlasticPackagingContainer")
	private CodifiedValue isTradeItemRigidPlasticPackagingContainer = null;

	@JsonProperty("postConsumerRecycledContentPercentage")
	private String postConsumerRecycledContentPercentage = null;

	@JsonProperty("rOHSComplianceFailureMaterial")
	private Values rOHSComplianceFailureMaterial = null;

	@JsonProperty("renewablePlantBasedPlasticComponentsPercent")
	private String renewablePlantBasedPlasticComponentsPercent = null;

	@JsonProperty("totalRecyclableContentPercentage")
	private String totalRecyclableContentPercentage = null;

	@JsonProperty("tradeItemSustainabilityFeatureCode")
	private CodifiedValues tradeItemSustainabilityFeatureCode = null;

	public SustainabilityInformation doesTradeItemContainPesticide(CodifiedValue doesTradeItemContainPesticide) {
		this.doesTradeItemContainPesticide = doesTradeItemContainPesticide;
		return this;
	}

	/**
	 * Get doesTradeItemContainPesticide
	 * 
	 * @return doesTradeItemContainPesticide
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getDoesTradeItemContainPesticide() {
		return doesTradeItemContainPesticide;
	}

	public void setDoesTradeItemContainPesticide(CodifiedValue doesTradeItemContainPesticide) {
		this.doesTradeItemContainPesticide = doesTradeItemContainPesticide;
	}

	public SustainabilityInformation isTradeItemROHSCompliant(CodifiedValue isTradeItemROHSCompliant) {
		this.isTradeItemROHSCompliant = isTradeItemROHSCompliant;
		return this;
	}

	/**
	 * Get isTradeItemROHSCompliant
	 * 
	 * @return isTradeItemROHSCompliant
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getIsTradeItemROHSCompliant() {
		return isTradeItemROHSCompliant;
	}

	public void setIsTradeItemROHSCompliant(CodifiedValue isTradeItemROHSCompliant) {
		this.isTradeItemROHSCompliant = isTradeItemROHSCompliant;
	}

	public SustainabilityInformation isTradeItemRigidPlasticPackagingContainer(
			CodifiedValue isTradeItemRigidPlasticPackagingContainer) {
		this.isTradeItemRigidPlasticPackagingContainer = isTradeItemRigidPlasticPackagingContainer;
		return this;
	}

	/**
	 * Get isTradeItemRigidPlasticPackagingContainer
	 * 
	 * @return isTradeItemRigidPlasticPackagingContainer
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getIsTradeItemRigidPlasticPackagingContainer() {
		return isTradeItemRigidPlasticPackagingContainer;
	}

	public void setIsTradeItemRigidPlasticPackagingContainer(CodifiedValue isTradeItemRigidPlasticPackagingContainer) {
		this.isTradeItemRigidPlasticPackagingContainer = isTradeItemRigidPlasticPackagingContainer;
	}

	public SustainabilityInformation postConsumerRecycledContentPercentage(
			String postConsumerRecycledContentPercentage) {
		this.postConsumerRecycledContentPercentage = postConsumerRecycledContentPercentage;
		return this;
	}

	/**
	 * Get postConsumerRecycledContentPercentage
	 * 
	 * @return postConsumerRecycledContentPercentage
	 **/
	@ApiModelProperty(value = "")
	public String getPostConsumerRecycledContentPercentage() {
		return postConsumerRecycledContentPercentage;
	}

	public void setPostConsumerRecycledContentPercentage(String postConsumerRecycledContentPercentage) {
		this.postConsumerRecycledContentPercentage = postConsumerRecycledContentPercentage;
	}

	public SustainabilityInformation rOHSComplianceFailureMaterial(Values rOHSComplianceFailureMaterial) {
		this.rOHSComplianceFailureMaterial = rOHSComplianceFailureMaterial;
		return this;
	}

	/**
	 * Get rOHSComplianceFailureMaterial
	 * 
	 * @return rOHSComplianceFailureMaterial
	 **/
	@ApiModelProperty(value = "")
	public Values getROHSComplianceFailureMaterial() {
		return rOHSComplianceFailureMaterial;
	}

	public void setROHSComplianceFailureMaterial(Values rOHSComplianceFailureMaterial) {
		this.rOHSComplianceFailureMaterial = rOHSComplianceFailureMaterial;
	}

	public SustainabilityInformation renewablePlantBasedPlasticComponentsPercent(
			String renewablePlantBasedPlasticComponentsPercent) {
		this.renewablePlantBasedPlasticComponentsPercent = renewablePlantBasedPlasticComponentsPercent;
		return this;
	}

	/**
	 * Get renewablePlantBasedPlasticComponentsPercent
	 * 
	 * @return renewablePlantBasedPlasticComponentsPercent
	 **/
	@ApiModelProperty(value = "")
	public String getRenewablePlantBasedPlasticComponentsPercent() {
		return renewablePlantBasedPlasticComponentsPercent;
	}

	public void setRenewablePlantBasedPlasticComponentsPercent(String renewablePlantBasedPlasticComponentsPercent) {
		this.renewablePlantBasedPlasticComponentsPercent = renewablePlantBasedPlasticComponentsPercent;
	}

	public SustainabilityInformation totalRecyclableContentPercentage(String totalRecyclableContentPercentage) {
		this.totalRecyclableContentPercentage = totalRecyclableContentPercentage;
		return this;
	}

	/**
	 * Get totalRecyclableContentPercentage
	 * 
	 * @return totalRecyclableContentPercentage
	 **/
	@ApiModelProperty(value = "")
	public String getTotalRecyclableContentPercentage() {
		return totalRecyclableContentPercentage;
	}

	public void setTotalRecyclableContentPercentage(String totalRecyclableContentPercentage) {
		this.totalRecyclableContentPercentage = totalRecyclableContentPercentage;
	}

	public SustainabilityInformation tradeItemSustainabilityFeatureCode(
			CodifiedValues tradeItemSustainabilityFeatureCode) {
		this.tradeItemSustainabilityFeatureCode = tradeItemSustainabilityFeatureCode;
		return this;
	}

	/**
	 * Get tradeItemSustainabilityFeatureCode
	 * 
	 * @return tradeItemSustainabilityFeatureCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValues getTradeItemSustainabilityFeatureCode() {
		return tradeItemSustainabilityFeatureCode;
	}

	public void setTradeItemSustainabilityFeatureCode(CodifiedValues tradeItemSustainabilityFeatureCode) {
		this.tradeItemSustainabilityFeatureCode = tradeItemSustainabilityFeatureCode;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SustainabilityInformation sustainabilityInformation = (SustainabilityInformation) o;
		return Objects.equals(this.doesTradeItemContainPesticide,
				sustainabilityInformation.doesTradeItemContainPesticide)
				&& Objects.equals(this.isTradeItemROHSCompliant, sustainabilityInformation.isTradeItemROHSCompliant)
				&& Objects.equals(this.isTradeItemRigidPlasticPackagingContainer,
						sustainabilityInformation.isTradeItemRigidPlasticPackagingContainer)
				&& Objects.equals(this.postConsumerRecycledContentPercentage,
						sustainabilityInformation.postConsumerRecycledContentPercentage)
				&& Objects.equals(this.rOHSComplianceFailureMaterial,
						sustainabilityInformation.rOHSComplianceFailureMaterial)
				&& Objects.equals(this.renewablePlantBasedPlasticComponentsPercent,
						sustainabilityInformation.renewablePlantBasedPlasticComponentsPercent)
				&& Objects.equals(this.totalRecyclableContentPercentage,
						sustainabilityInformation.totalRecyclableContentPercentage)
				&& Objects.equals(this.tradeItemSustainabilityFeatureCode,
						sustainabilityInformation.tradeItemSustainabilityFeatureCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(doesTradeItemContainPesticide, isTradeItemROHSCompliant,
				isTradeItemRigidPlasticPackagingContainer, postConsumerRecycledContentPercentage,
				rOHSComplianceFailureMaterial, renewablePlantBasedPlasticComponentsPercent,
				totalRecyclableContentPercentage, tradeItemSustainabilityFeatureCode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SustainabilityInformation {\n");

		sb.append("    doesTradeItemContainPesticide: ").append(toIndentedString(doesTradeItemContainPesticide))
				.append("\n");
		sb.append("    isTradeItemROHSCompliant: ").append(toIndentedString(isTradeItemROHSCompliant)).append("\n");
		sb.append("    isTradeItemRigidPlasticPackagingContainer: ")
				.append(toIndentedString(isTradeItemRigidPlasticPackagingContainer)).append("\n");
		sb.append("    postConsumerRecycledContentPercentage: ")
				.append(toIndentedString(postConsumerRecycledContentPercentage)).append("\n");
		sb.append("    rOHSComplianceFailureMaterial: ").append(toIndentedString(rOHSComplianceFailureMaterial))
				.append("\n");
		sb.append("    renewablePlantBasedPlasticComponentsPercent: ")
				.append(toIndentedString(renewablePlantBasedPlasticComponentsPercent)).append("\n");
		sb.append("    totalRecyclableContentPercentage: ").append(toIndentedString(totalRecyclableContentPercentage))
				.append("\n");
		sb.append("    tradeItemSustainabilityFeatureCode: ")
				.append(toIndentedString(tradeItemSustainabilityFeatureCode)).append("\n");
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
