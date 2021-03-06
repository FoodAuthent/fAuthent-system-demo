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
import org.foodauthent.oneworldsync.client.model.Result;

/**
 * Response
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class Response {
	@JsonProperty("results")
	private List<Result> results = null;

	@JsonProperty("numOfRows")
	private String numOfRows = null;

	@JsonProperty("responseCode")
	private String responseCode = null;

	@JsonProperty("responseMessage")
	private String responseMessage = null;

	@JsonProperty("responseType")
	private String responseType = null;

	@JsonProperty("nextCursorMark")
	private String nextCursorMark = null;

	@JsonProperty("totalNumOfResults")
	private String totalNumOfResults = null;

	public Response results(List<Result> results) {
		this.results = results;
		return this;
	}

	public Response addResultsItem(Result resultsItem) {
		if (this.results == null) {
			this.results = new ArrayList<Result>();
		}
		this.results.add(resultsItem);
		return this;
	}

	/**
	 * Get results
	 * 
	 * @return results
	 **/
	@ApiModelProperty(value = "")
	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Response numOfRows(String numOfRows) {
		this.numOfRows = numOfRows;
		return this;
	}

	/**
	 * Get numOfRows
	 * 
	 * @return numOfRows
	 **/
	@ApiModelProperty(value = "")
	public String getNumOfRows() {
		return numOfRows;
	}

	public void setNumOfRows(String numOfRows) {
		this.numOfRows = numOfRows;
	}

	public Response responseCode(String responseCode) {
		this.responseCode = responseCode;
		return this;
	}

	/**
	 * Get responseCode
	 * 
	 * @return responseCode
	 **/
	@ApiModelProperty(value = "")
	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public Response responseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
		return this;
	}

	/**
	 * Get responseMessage
	 * 
	 * @return responseMessage
	 **/
	@ApiModelProperty(value = "")
	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Response responseType(String responseType) {
		this.responseType = responseType;
		return this;
	}

	/**
	 * Get responseType
	 * 
	 * @return responseType
	 **/
	@ApiModelProperty(value = "")
	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

	public Response nextCursorMark(String nextCursorMark) {
		this.nextCursorMark = nextCursorMark;
		return this;
	}

	/**
	 * Get nextCursorMark
	 * 
	 * @return nextCursorMark
	 **/
	@ApiModelProperty(value = "")
	public String getNextCursorMark() {
		return nextCursorMark;
	}

	public void setNextCursorMark(String nextCursorMark) {
		this.nextCursorMark = nextCursorMark;
	}

	public Response totalNumOfResults(String totalNumOfResults) {
		this.totalNumOfResults = totalNumOfResults;
		return this;
	}

	/**
	 * Get totalNumOfResults
	 * 
	 * @return totalNumOfResults
	 **/
	@ApiModelProperty(value = "")
	public String getTotalNumOfResults() {
		return totalNumOfResults;
	}

	public void setTotalNumOfResults(String totalNumOfResults) {
		this.totalNumOfResults = totalNumOfResults;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Response response = (Response) o;
		return Objects.equals(this.results, response.results) && Objects.equals(this.numOfRows, response.numOfRows)
				&& Objects.equals(this.responseCode, response.responseCode)
				&& Objects.equals(this.responseMessage, response.responseMessage)
				&& Objects.equals(this.responseType, response.responseType)
				&& Objects.equals(this.nextCursorMark, response.nextCursorMark)
				&& Objects.equals(this.totalNumOfResults, response.totalNumOfResults);
	}

	@Override
	public int hashCode() {
		return Objects.hash(results, numOfRows, responseCode, responseMessage, responseType, nextCursorMark,
				totalNumOfResults);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Response {\n");

		sb.append("    results: ").append(toIndentedString(results)).append("\n");
		sb.append("    numOfRows: ").append(toIndentedString(numOfRows)).append("\n");
		sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
		sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
		sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
		sb.append("    nextCursorMark: ").append(toIndentedString(nextCursorMark)).append("\n");
		sb.append("    totalNumOfResults: ").append(toIndentedString(totalNumOfResults)).append("\n");
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
