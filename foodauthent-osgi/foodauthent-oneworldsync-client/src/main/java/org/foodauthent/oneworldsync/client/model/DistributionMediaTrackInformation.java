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
import org.foodauthent.oneworldsync.client.model.AudioVisualMediaContributor;
import org.foodauthent.oneworldsync.client.model.LanguageLabels;

/**
 * DistributionMediaTrackInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class DistributionMediaTrackInformation {
	@JsonProperty("audioVisualMediaContributor")
	private List<AudioVisualMediaContributor> audioVisualMediaContributor = null;

	@JsonProperty("trackNumber")
	private String trackNumber = null;

	@JsonProperty("trackTime")
	private String trackTime = null;

	@JsonProperty("trackTitle")
	private LanguageLabels trackTitle = null;

	public DistributionMediaTrackInformation audioVisualMediaContributor(
			List<AudioVisualMediaContributor> audioVisualMediaContributor) {
		this.audioVisualMediaContributor = audioVisualMediaContributor;
		return this;
	}

	public DistributionMediaTrackInformation addAudioVisualMediaContributorItem(
			AudioVisualMediaContributor audioVisualMediaContributorItem) {
		if (this.audioVisualMediaContributor == null) {
			this.audioVisualMediaContributor = new ArrayList<AudioVisualMediaContributor>();
		}
		this.audioVisualMediaContributor.add(audioVisualMediaContributorItem);
		return this;
	}

	/**
	 * Get audioVisualMediaContributor
	 * 
	 * @return audioVisualMediaContributor
	 **/
	@ApiModelProperty(value = "")
	public List<AudioVisualMediaContributor> getAudioVisualMediaContributor() {
		return audioVisualMediaContributor;
	}

	public void setAudioVisualMediaContributor(List<AudioVisualMediaContributor> audioVisualMediaContributor) {
		this.audioVisualMediaContributor = audioVisualMediaContributor;
	}

	public DistributionMediaTrackInformation trackNumber(String trackNumber) {
		this.trackNumber = trackNumber;
		return this;
	}

	/**
	 * Get trackNumber
	 * 
	 * @return trackNumber
	 **/
	@ApiModelProperty(value = "")
	public String getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(String trackNumber) {
		this.trackNumber = trackNumber;
	}

	public DistributionMediaTrackInformation trackTime(String trackTime) {
		this.trackTime = trackTime;
		return this;
	}

	/**
	 * Get trackTime
	 * 
	 * @return trackTime
	 **/
	@ApiModelProperty(value = "")
	public String getTrackTime() {
		return trackTime;
	}

	public void setTrackTime(String trackTime) {
		this.trackTime = trackTime;
	}

	public DistributionMediaTrackInformation trackTitle(LanguageLabels trackTitle) {
		this.trackTitle = trackTitle;
		return this;
	}

	/**
	 * Get trackTitle
	 * 
	 * @return trackTitle
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getTrackTitle() {
		return trackTitle;
	}

	public void setTrackTitle(LanguageLabels trackTitle) {
		this.trackTitle = trackTitle;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DistributionMediaTrackInformation distributionMediaTrackInformation = (DistributionMediaTrackInformation) o;
		return Objects.equals(this.audioVisualMediaContributor,
				distributionMediaTrackInformation.audioVisualMediaContributor)
				&& Objects.equals(this.trackNumber, distributionMediaTrackInformation.trackNumber)
				&& Objects.equals(this.trackTime, distributionMediaTrackInformation.trackTime)
				&& Objects.equals(this.trackTitle, distributionMediaTrackInformation.trackTitle);
	}

	@Override
	public int hashCode() {
		return Objects.hash(audioVisualMediaContributor, trackNumber, trackTime, trackTitle);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DistributionMediaTrackInformation {\n");

		sb.append("    audioVisualMediaContributor: ").append(toIndentedString(audioVisualMediaContributor))
				.append("\n");
		sb.append("    trackNumber: ").append(toIndentedString(trackNumber)).append("\n");
		sb.append("    trackTime: ").append(toIndentedString(trackTime)).append("\n");
		sb.append("    trackTitle: ").append(toIndentedString(trackTitle)).append("\n");
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
