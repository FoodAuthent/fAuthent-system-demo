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
 * TradeItemSynchronisationDates
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class TradeItemSynchronisationDates {
	@JsonProperty("cancelledDateTime")
	private String cancelledDateTime = null;

	@JsonProperty("communityVisibilityDateTime")
	private String communityVisibilityDateTime = null;

	@JsonProperty("discontinuedDateTime")
	private String discontinuedDateTime = null;

	@JsonProperty("effectiveDateTime")
	private String effectiveDateTime = null;

	@JsonProperty("lastChangeDateTime")
	private String lastChangeDateTime = null;

	@JsonProperty("publicationDateTime")
	private String publicationDateTime = null;

	@JsonProperty("udidFirstPublicationDateTime")
	private String udidFirstPublicationDateTime = null;

	public TradeItemSynchronisationDates cancelledDateTime(String cancelledDateTime) {
		this.cancelledDateTime = cancelledDateTime;
		return this;
	}

	/**
	 * Get cancelledDateTime
	 * 
	 * @return cancelledDateTime
	 **/
	@ApiModelProperty(value = "")
	public String getCancelledDateTime() {
		return cancelledDateTime;
	}

	public void setCancelledDateTime(String cancelledDateTime) {
		this.cancelledDateTime = cancelledDateTime;
	}

	public TradeItemSynchronisationDates communityVisibilityDateTime(String communityVisibilityDateTime) {
		this.communityVisibilityDateTime = communityVisibilityDateTime;
		return this;
	}

	/**
	 * Get communityVisibilityDateTime
	 * 
	 * @return communityVisibilityDateTime
	 **/
	@ApiModelProperty(value = "")
	public String getCommunityVisibilityDateTime() {
		return communityVisibilityDateTime;
	}

	public void setCommunityVisibilityDateTime(String communityVisibilityDateTime) {
		this.communityVisibilityDateTime = communityVisibilityDateTime;
	}

	public TradeItemSynchronisationDates discontinuedDateTime(String discontinuedDateTime) {
		this.discontinuedDateTime = discontinuedDateTime;
		return this;
	}

	/**
	 * Get discontinuedDateTime
	 * 
	 * @return discontinuedDateTime
	 **/
	@ApiModelProperty(value = "")
	public String getDiscontinuedDateTime() {
		return discontinuedDateTime;
	}

	public void setDiscontinuedDateTime(String discontinuedDateTime) {
		this.discontinuedDateTime = discontinuedDateTime;
	}

	public TradeItemSynchronisationDates effectiveDateTime(String effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
		return this;
	}

	/**
	 * Get effectiveDateTime
	 * 
	 * @return effectiveDateTime
	 **/
	@ApiModelProperty(value = "")
	public String getEffectiveDateTime() {
		return effectiveDateTime;
	}

	public void setEffectiveDateTime(String effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}

	public TradeItemSynchronisationDates lastChangeDateTime(String lastChangeDateTime) {
		this.lastChangeDateTime = lastChangeDateTime;
		return this;
	}

	/**
	 * Get lastChangeDateTime
	 * 
	 * @return lastChangeDateTime
	 **/
	@ApiModelProperty(value = "")
	public String getLastChangeDateTime() {
		return lastChangeDateTime;
	}

	public void setLastChangeDateTime(String lastChangeDateTime) {
		this.lastChangeDateTime = lastChangeDateTime;
	}

	public TradeItemSynchronisationDates publicationDateTime(String publicationDateTime) {
		this.publicationDateTime = publicationDateTime;
		return this;
	}

	/**
	 * Get publicationDateTime
	 * 
	 * @return publicationDateTime
	 **/
	@ApiModelProperty(value = "")
	public String getPublicationDateTime() {
		return publicationDateTime;
	}

	public void setPublicationDateTime(String publicationDateTime) {
		this.publicationDateTime = publicationDateTime;
	}

	public TradeItemSynchronisationDates udidFirstPublicationDateTime(String udidFirstPublicationDateTime) {
		this.udidFirstPublicationDateTime = udidFirstPublicationDateTime;
		return this;
	}

	/**
	 * Get udidFirstPublicationDateTime
	 * 
	 * @return udidFirstPublicationDateTime
	 **/
	@ApiModelProperty(value = "")
	public String getUdidFirstPublicationDateTime() {
		return udidFirstPublicationDateTime;
	}

	public void setUdidFirstPublicationDateTime(String udidFirstPublicationDateTime) {
		this.udidFirstPublicationDateTime = udidFirstPublicationDateTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TradeItemSynchronisationDates tradeItemSynchronisationDates = (TradeItemSynchronisationDates) o;
		return Objects.equals(this.cancelledDateTime, tradeItemSynchronisationDates.cancelledDateTime)
				&& Objects.equals(this.communityVisibilityDateTime,
						tradeItemSynchronisationDates.communityVisibilityDateTime)
				&& Objects.equals(this.discontinuedDateTime, tradeItemSynchronisationDates.discontinuedDateTime)
				&& Objects.equals(this.effectiveDateTime, tradeItemSynchronisationDates.effectiveDateTime)
				&& Objects.equals(this.lastChangeDateTime, tradeItemSynchronisationDates.lastChangeDateTime)
				&& Objects.equals(this.publicationDateTime, tradeItemSynchronisationDates.publicationDateTime)
				&& Objects.equals(this.udidFirstPublicationDateTime,
						tradeItemSynchronisationDates.udidFirstPublicationDateTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cancelledDateTime, communityVisibilityDateTime, discontinuedDateTime, effectiveDateTime,
				lastChangeDateTime, publicationDateTime, udidFirstPublicationDateTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TradeItemSynchronisationDates {\n");

		sb.append("    cancelledDateTime: ").append(toIndentedString(cancelledDateTime)).append("\n");
		sb.append("    communityVisibilityDateTime: ").append(toIndentedString(communityVisibilityDateTime))
				.append("\n");
		sb.append("    discontinuedDateTime: ").append(toIndentedString(discontinuedDateTime)).append("\n");
		sb.append("    effectiveDateTime: ").append(toIndentedString(effectiveDateTime)).append("\n");
		sb.append("    lastChangeDateTime: ").append(toIndentedString(lastChangeDateTime)).append("\n");
		sb.append("    publicationDateTime: ").append(toIndentedString(publicationDateTime)).append("\n");
		sb.append("    udidFirstPublicationDateTime: ").append(toIndentedString(udidFirstPublicationDateTime))
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
