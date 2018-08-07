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
import org.foodauthent.oneworldsync.client.model.QualifiedValues;

/**
 * TradeItemLifespan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class TradeItemLifespan {
	@JsonProperty("doesTradeItemHaveAutoReaderTracker")
	private CodifiedValue doesTradeItemHaveAutoReaderTracker = null;

	@JsonProperty("itemMinimumDurability")
	private QualifiedValues itemMinimumDurability = null;

	@JsonProperty("itemPeriodSafeToUseAfterOpening")
	private QualifiedValues itemPeriodSafeToUseAfterOpening = null;

	@JsonProperty("minimumTradeItemLifespanFromTimeOfArrival")
	private String minimumTradeItemLifespanFromTimeOfArrival = null;

	@JsonProperty("minimumTradeItemLifespanFromTimeOfProduction")
	private String minimumTradeItemLifespanFromTimeOfProduction = null;

	@JsonProperty("openedTradeItemLifespan")
	private String openedTradeItemLifespan = null;

	@JsonProperty("supplierSpecifiedMinimumConsumerStorageDays")
	private String supplierSpecifiedMinimumConsumerStorageDays = null;

	public TradeItemLifespan doesTradeItemHaveAutoReaderTracker(CodifiedValue doesTradeItemHaveAutoReaderTracker) {
		this.doesTradeItemHaveAutoReaderTracker = doesTradeItemHaveAutoReaderTracker;
		return this;
	}

	/**
	 * Get doesTradeItemHaveAutoReaderTracker
	 * 
	 * @return doesTradeItemHaveAutoReaderTracker
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getDoesTradeItemHaveAutoReaderTracker() {
		return doesTradeItemHaveAutoReaderTracker;
	}

	public void setDoesTradeItemHaveAutoReaderTracker(CodifiedValue doesTradeItemHaveAutoReaderTracker) {
		this.doesTradeItemHaveAutoReaderTracker = doesTradeItemHaveAutoReaderTracker;
	}

	public TradeItemLifespan itemMinimumDurability(QualifiedValues itemMinimumDurability) {
		this.itemMinimumDurability = itemMinimumDurability;
		return this;
	}

	/**
	 * Get itemMinimumDurability
	 * 
	 * @return itemMinimumDurability
	 **/
	@ApiModelProperty(value = "")
	public QualifiedValues getItemMinimumDurability() {
		return itemMinimumDurability;
	}

	public void setItemMinimumDurability(QualifiedValues itemMinimumDurability) {
		this.itemMinimumDurability = itemMinimumDurability;
	}

	public TradeItemLifespan itemPeriodSafeToUseAfterOpening(QualifiedValues itemPeriodSafeToUseAfterOpening) {
		this.itemPeriodSafeToUseAfterOpening = itemPeriodSafeToUseAfterOpening;
		return this;
	}

	/**
	 * Get itemPeriodSafeToUseAfterOpening
	 * 
	 * @return itemPeriodSafeToUseAfterOpening
	 **/
	@ApiModelProperty(value = "")
	public QualifiedValues getItemPeriodSafeToUseAfterOpening() {
		return itemPeriodSafeToUseAfterOpening;
	}

	public void setItemPeriodSafeToUseAfterOpening(QualifiedValues itemPeriodSafeToUseAfterOpening) {
		this.itemPeriodSafeToUseAfterOpening = itemPeriodSafeToUseAfterOpening;
	}

	public TradeItemLifespan minimumTradeItemLifespanFromTimeOfArrival(
			String minimumTradeItemLifespanFromTimeOfArrival) {
		this.minimumTradeItemLifespanFromTimeOfArrival = minimumTradeItemLifespanFromTimeOfArrival;
		return this;
	}

	/**
	 * Get minimumTradeItemLifespanFromTimeOfArrival
	 * 
	 * @return minimumTradeItemLifespanFromTimeOfArrival
	 **/
	@ApiModelProperty(value = "")
	public String getMinimumTradeItemLifespanFromTimeOfArrival() {
		return minimumTradeItemLifespanFromTimeOfArrival;
	}

	public void setMinimumTradeItemLifespanFromTimeOfArrival(String minimumTradeItemLifespanFromTimeOfArrival) {
		this.minimumTradeItemLifespanFromTimeOfArrival = minimumTradeItemLifespanFromTimeOfArrival;
	}

	public TradeItemLifespan minimumTradeItemLifespanFromTimeOfProduction(
			String minimumTradeItemLifespanFromTimeOfProduction) {
		this.minimumTradeItemLifespanFromTimeOfProduction = minimumTradeItemLifespanFromTimeOfProduction;
		return this;
	}

	/**
	 * Get minimumTradeItemLifespanFromTimeOfProduction
	 * 
	 * @return minimumTradeItemLifespanFromTimeOfProduction
	 **/
	@ApiModelProperty(value = "")
	public String getMinimumTradeItemLifespanFromTimeOfProduction() {
		return minimumTradeItemLifespanFromTimeOfProduction;
	}

	public void setMinimumTradeItemLifespanFromTimeOfProduction(String minimumTradeItemLifespanFromTimeOfProduction) {
		this.minimumTradeItemLifespanFromTimeOfProduction = minimumTradeItemLifespanFromTimeOfProduction;
	}

	public TradeItemLifespan openedTradeItemLifespan(String openedTradeItemLifespan) {
		this.openedTradeItemLifespan = openedTradeItemLifespan;
		return this;
	}

	/**
	 * Get openedTradeItemLifespan
	 * 
	 * @return openedTradeItemLifespan
	 **/
	@ApiModelProperty(value = "")
	public String getOpenedTradeItemLifespan() {
		return openedTradeItemLifespan;
	}

	public void setOpenedTradeItemLifespan(String openedTradeItemLifespan) {
		this.openedTradeItemLifespan = openedTradeItemLifespan;
	}

	public TradeItemLifespan supplierSpecifiedMinimumConsumerStorageDays(
			String supplierSpecifiedMinimumConsumerStorageDays) {
		this.supplierSpecifiedMinimumConsumerStorageDays = supplierSpecifiedMinimumConsumerStorageDays;
		return this;
	}

	/**
	 * Get supplierSpecifiedMinimumConsumerStorageDays
	 * 
	 * @return supplierSpecifiedMinimumConsumerStorageDays
	 **/
	@ApiModelProperty(value = "")
	public String getSupplierSpecifiedMinimumConsumerStorageDays() {
		return supplierSpecifiedMinimumConsumerStorageDays;
	}

	public void setSupplierSpecifiedMinimumConsumerStorageDays(String supplierSpecifiedMinimumConsumerStorageDays) {
		this.supplierSpecifiedMinimumConsumerStorageDays = supplierSpecifiedMinimumConsumerStorageDays;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TradeItemLifespan tradeItemLifespan = (TradeItemLifespan) o;
		return Objects.equals(this.doesTradeItemHaveAutoReaderTracker,
				tradeItemLifespan.doesTradeItemHaveAutoReaderTracker)
				&& Objects.equals(this.itemMinimumDurability, tradeItemLifespan.itemMinimumDurability)
				&& Objects.equals(this.itemPeriodSafeToUseAfterOpening,
						tradeItemLifespan.itemPeriodSafeToUseAfterOpening)
				&& Objects.equals(this.minimumTradeItemLifespanFromTimeOfArrival,
						tradeItemLifespan.minimumTradeItemLifespanFromTimeOfArrival)
				&& Objects.equals(this.minimumTradeItemLifespanFromTimeOfProduction,
						tradeItemLifespan.minimumTradeItemLifespanFromTimeOfProduction)
				&& Objects.equals(this.openedTradeItemLifespan, tradeItemLifespan.openedTradeItemLifespan)
				&& Objects.equals(this.supplierSpecifiedMinimumConsumerStorageDays,
						tradeItemLifespan.supplierSpecifiedMinimumConsumerStorageDays);
	}

	@Override
	public int hashCode() {
		return Objects.hash(doesTradeItemHaveAutoReaderTracker, itemMinimumDurability, itemPeriodSafeToUseAfterOpening,
				minimumTradeItemLifespanFromTimeOfArrival, minimumTradeItemLifespanFromTimeOfProduction,
				openedTradeItemLifespan, supplierSpecifiedMinimumConsumerStorageDays);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TradeItemLifespan {\n");

		sb.append("    doesTradeItemHaveAutoReaderTracker: ")
				.append(toIndentedString(doesTradeItemHaveAutoReaderTracker)).append("\n");
		sb.append("    itemMinimumDurability: ").append(toIndentedString(itemMinimumDurability)).append("\n");
		sb.append("    itemPeriodSafeToUseAfterOpening: ").append(toIndentedString(itemPeriodSafeToUseAfterOpening))
				.append("\n");
		sb.append("    minimumTradeItemLifespanFromTimeOfArrival: ")
				.append(toIndentedString(minimumTradeItemLifespanFromTimeOfArrival)).append("\n");
		sb.append("    minimumTradeItemLifespanFromTimeOfProduction: ")
				.append(toIndentedString(minimumTradeItemLifespanFromTimeOfProduction)).append("\n");
		sb.append("    openedTradeItemLifespan: ").append(toIndentedString(openedTradeItemLifespan)).append("\n");
		sb.append("    supplierSpecifiedMinimumConsumerStorageDays: ")
				.append(toIndentedString(supplierSpecifiedMinimumConsumerStorageDays)).append("\n");
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
