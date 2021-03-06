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
import org.foodauthent.oneworldsync.client.model.CodifiedValues;
import org.foodauthent.oneworldsync.client.model.Recipient;
import org.foodauthent.oneworldsync.client.model.TopcoNationalBrandEquivalent;

/**
 * TopcoGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class TopcoGroup {
	@JsonProperty("recipient")
	private Recipient recipient = null;

	@JsonProperty("topcoNationalBrandEquivalent")
	private List<TopcoNationalBrandEquivalent> topcoNationalBrandEquivalent = null;

	@JsonProperty("topcoPackagingTypeCode")
	private CodifiedValues topcoPackagingTypeCode = null;

	public TopcoGroup recipient(Recipient recipient) {
		this.recipient = recipient;
		return this;
	}

	/**
	 * Get recipient
	 * 
	 * @return recipient
	 **/
	@ApiModelProperty(value = "")
	public Recipient getRecipient() {
		return recipient;
	}

	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}

	public TopcoGroup topcoNationalBrandEquivalent(List<TopcoNationalBrandEquivalent> topcoNationalBrandEquivalent) {
		this.topcoNationalBrandEquivalent = topcoNationalBrandEquivalent;
		return this;
	}

	public TopcoGroup addTopcoNationalBrandEquivalentItem(
			TopcoNationalBrandEquivalent topcoNationalBrandEquivalentItem) {
		if (this.topcoNationalBrandEquivalent == null) {
			this.topcoNationalBrandEquivalent = new ArrayList<TopcoNationalBrandEquivalent>();
		}
		this.topcoNationalBrandEquivalent.add(topcoNationalBrandEquivalentItem);
		return this;
	}

	/**
	 * Get topcoNationalBrandEquivalent
	 * 
	 * @return topcoNationalBrandEquivalent
	 **/
	@ApiModelProperty(value = "")
	public List<TopcoNationalBrandEquivalent> getTopcoNationalBrandEquivalent() {
		return topcoNationalBrandEquivalent;
	}

	public void setTopcoNationalBrandEquivalent(List<TopcoNationalBrandEquivalent> topcoNationalBrandEquivalent) {
		this.topcoNationalBrandEquivalent = topcoNationalBrandEquivalent;
	}

	public TopcoGroup topcoPackagingTypeCode(CodifiedValues topcoPackagingTypeCode) {
		this.topcoPackagingTypeCode = topcoPackagingTypeCode;
		return this;
	}

	/**
	 * Get topcoPackagingTypeCode
	 * 
	 * @return topcoPackagingTypeCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValues getTopcoPackagingTypeCode() {
		return topcoPackagingTypeCode;
	}

	public void setTopcoPackagingTypeCode(CodifiedValues topcoPackagingTypeCode) {
		this.topcoPackagingTypeCode = topcoPackagingTypeCode;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TopcoGroup topcoGroup = (TopcoGroup) o;
		return Objects.equals(this.recipient, topcoGroup.recipient)
				&& Objects.equals(this.topcoNationalBrandEquivalent, topcoGroup.topcoNationalBrandEquivalent)
				&& Objects.equals(this.topcoPackagingTypeCode, topcoGroup.topcoPackagingTypeCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(recipient, topcoNationalBrandEquivalent, topcoPackagingTypeCode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TopcoGroup {\n");

		sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
		sb.append("    topcoNationalBrandEquivalent: ").append(toIndentedString(topcoNationalBrandEquivalent))
				.append("\n");
		sb.append("    topcoPackagingTypeCode: ").append(toIndentedString(topcoPackagingTypeCode)).append("\n");
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
