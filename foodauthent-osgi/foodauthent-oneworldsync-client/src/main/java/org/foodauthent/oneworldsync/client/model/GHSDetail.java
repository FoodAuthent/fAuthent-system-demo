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
import org.foodauthent.oneworldsync.client.model.CodifiedValues;
import org.foodauthent.oneworldsync.client.model.HazardStatement;
import org.foodauthent.oneworldsync.client.model.PrecautionaryStatement;

/**
 * GHSDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class GHSDetail {
	@JsonProperty("gHSSignalWordsCode")
	private CodifiedValue gHSSignalWordsCode = null;

	@JsonProperty("gHSSymbolDescriptionCode")
	private CodifiedValues gHSSymbolDescriptionCode = null;

	@JsonProperty("hazardStatement")
	private List<HazardStatement> hazardStatement = null;

	@JsonProperty("precautionaryStatement")
	private List<PrecautionaryStatement> precautionaryStatement = null;

	public GHSDetail gHSSignalWordsCode(CodifiedValue gHSSignalWordsCode) {
		this.gHSSignalWordsCode = gHSSignalWordsCode;
		return this;
	}

	/**
	 * Get gHSSignalWordsCode
	 * 
	 * @return gHSSignalWordsCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getGHSSignalWordsCode() {
		return gHSSignalWordsCode;
	}

	public void setGHSSignalWordsCode(CodifiedValue gHSSignalWordsCode) {
		this.gHSSignalWordsCode = gHSSignalWordsCode;
	}

	public GHSDetail gHSSymbolDescriptionCode(CodifiedValues gHSSymbolDescriptionCode) {
		this.gHSSymbolDescriptionCode = gHSSymbolDescriptionCode;
		return this;
	}

	/**
	 * Get gHSSymbolDescriptionCode
	 * 
	 * @return gHSSymbolDescriptionCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValues getGHSSymbolDescriptionCode() {
		return gHSSymbolDescriptionCode;
	}

	public void setGHSSymbolDescriptionCode(CodifiedValues gHSSymbolDescriptionCode) {
		this.gHSSymbolDescriptionCode = gHSSymbolDescriptionCode;
	}

	public GHSDetail hazardStatement(List<HazardStatement> hazardStatement) {
		this.hazardStatement = hazardStatement;
		return this;
	}

	public GHSDetail addHazardStatementItem(HazardStatement hazardStatementItem) {
		if (this.hazardStatement == null) {
			this.hazardStatement = new ArrayList<HazardStatement>();
		}
		this.hazardStatement.add(hazardStatementItem);
		return this;
	}

	/**
	 * Get hazardStatement
	 * 
	 * @return hazardStatement
	 **/
	@ApiModelProperty(value = "")
	public List<HazardStatement> getHazardStatement() {
		return hazardStatement;
	}

	public void setHazardStatement(List<HazardStatement> hazardStatement) {
		this.hazardStatement = hazardStatement;
	}

	public GHSDetail precautionaryStatement(List<PrecautionaryStatement> precautionaryStatement) {
		this.precautionaryStatement = precautionaryStatement;
		return this;
	}

	public GHSDetail addPrecautionaryStatementItem(PrecautionaryStatement precautionaryStatementItem) {
		if (this.precautionaryStatement == null) {
			this.precautionaryStatement = new ArrayList<PrecautionaryStatement>();
		}
		this.precautionaryStatement.add(precautionaryStatementItem);
		return this;
	}

	/**
	 * Get precautionaryStatement
	 * 
	 * @return precautionaryStatement
	 **/
	@ApiModelProperty(value = "")
	public List<PrecautionaryStatement> getPrecautionaryStatement() {
		return precautionaryStatement;
	}

	public void setPrecautionaryStatement(List<PrecautionaryStatement> precautionaryStatement) {
		this.precautionaryStatement = precautionaryStatement;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GHSDetail gHSDetail = (GHSDetail) o;
		return Objects.equals(this.gHSSignalWordsCode, gHSDetail.gHSSignalWordsCode)
				&& Objects.equals(this.gHSSymbolDescriptionCode, gHSDetail.gHSSymbolDescriptionCode)
				&& Objects.equals(this.hazardStatement, gHSDetail.hazardStatement)
				&& Objects.equals(this.precautionaryStatement, gHSDetail.precautionaryStatement);
	}

	@Override
	public int hashCode() {
		return Objects.hash(gHSSignalWordsCode, gHSSymbolDescriptionCode, hazardStatement, precautionaryStatement);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GHSDetail {\n");

		sb.append("    gHSSignalWordsCode: ").append(toIndentedString(gHSSignalWordsCode)).append("\n");
		sb.append("    gHSSymbolDescriptionCode: ").append(toIndentedString(gHSSymbolDescriptionCode)).append("\n");
		sb.append("    hazardStatement: ").append(toIndentedString(hazardStatement)).append("\n");
		sb.append("    precautionaryStatement: ").append(toIndentedString(precautionaryStatement)).append("\n");
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
