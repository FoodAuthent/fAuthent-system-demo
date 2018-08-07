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
 * FileUsageInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class FileUsageInformation {
	@JsonProperty("areFeesRequiredForUse")
	private CodifiedValue areFeesRequiredForUse = null;

	@JsonProperty("canFilesBeEdited")
	private CodifiedValue canFilesBeEdited = null;

	@JsonProperty("fileCampaignDescription")
	private LanguageLabels fileCampaignDescription = null;

	@JsonProperty("fileCopyrightDescription")
	private LanguageLabels fileCopyrightDescription = null;

	@JsonProperty("fileDisclaimerInformation")
	private LanguageLabels fileDisclaimerInformation = null;

	@JsonProperty("fileFeeDescription")
	private LanguageLabels fileFeeDescription = null;

	@JsonProperty("fileRecommendedUsageDescription")
	private LanguageLabels fileRecommendedUsageDescription = null;

	@JsonProperty("fileRightsDescription")
	private LanguageLabels fileRightsDescription = null;

	@JsonProperty("fileUsageRestriction")
	private LanguageLabels fileUsageRestriction = null;

	@JsonProperty("intendedPublicationCountryCode")
	private CodifiedValues intendedPublicationCountryCode = null;

	@JsonProperty("intendedPublicationMediaTypeDescription")
	private LanguageLabels intendedPublicationMediaTypeDescription = null;

	@JsonProperty("isFileForInternalUseOnly")
	private CodifiedValue isFileForInternalUseOnly = null;

	@JsonProperty("isTalentReleaseOnFile")
	private CodifiedValue isTalentReleaseOnFile = null;

	public FileUsageInformation areFeesRequiredForUse(CodifiedValue areFeesRequiredForUse) {
		this.areFeesRequiredForUse = areFeesRequiredForUse;
		return this;
	}

	/**
	 * Get areFeesRequiredForUse
	 * 
	 * @return areFeesRequiredForUse
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getAreFeesRequiredForUse() {
		return areFeesRequiredForUse;
	}

	public void setAreFeesRequiredForUse(CodifiedValue areFeesRequiredForUse) {
		this.areFeesRequiredForUse = areFeesRequiredForUse;
	}

	public FileUsageInformation canFilesBeEdited(CodifiedValue canFilesBeEdited) {
		this.canFilesBeEdited = canFilesBeEdited;
		return this;
	}

	/**
	 * Get canFilesBeEdited
	 * 
	 * @return canFilesBeEdited
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getCanFilesBeEdited() {
		return canFilesBeEdited;
	}

	public void setCanFilesBeEdited(CodifiedValue canFilesBeEdited) {
		this.canFilesBeEdited = canFilesBeEdited;
	}

	public FileUsageInformation fileCampaignDescription(LanguageLabels fileCampaignDescription) {
		this.fileCampaignDescription = fileCampaignDescription;
		return this;
	}

	/**
	 * Get fileCampaignDescription
	 * 
	 * @return fileCampaignDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getFileCampaignDescription() {
		return fileCampaignDescription;
	}

	public void setFileCampaignDescription(LanguageLabels fileCampaignDescription) {
		this.fileCampaignDescription = fileCampaignDescription;
	}

	public FileUsageInformation fileCopyrightDescription(LanguageLabels fileCopyrightDescription) {
		this.fileCopyrightDescription = fileCopyrightDescription;
		return this;
	}

	/**
	 * Get fileCopyrightDescription
	 * 
	 * @return fileCopyrightDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getFileCopyrightDescription() {
		return fileCopyrightDescription;
	}

	public void setFileCopyrightDescription(LanguageLabels fileCopyrightDescription) {
		this.fileCopyrightDescription = fileCopyrightDescription;
	}

	public FileUsageInformation fileDisclaimerInformation(LanguageLabels fileDisclaimerInformation) {
		this.fileDisclaimerInformation = fileDisclaimerInformation;
		return this;
	}

	/**
	 * Get fileDisclaimerInformation
	 * 
	 * @return fileDisclaimerInformation
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getFileDisclaimerInformation() {
		return fileDisclaimerInformation;
	}

	public void setFileDisclaimerInformation(LanguageLabels fileDisclaimerInformation) {
		this.fileDisclaimerInformation = fileDisclaimerInformation;
	}

	public FileUsageInformation fileFeeDescription(LanguageLabels fileFeeDescription) {
		this.fileFeeDescription = fileFeeDescription;
		return this;
	}

	/**
	 * Get fileFeeDescription
	 * 
	 * @return fileFeeDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getFileFeeDescription() {
		return fileFeeDescription;
	}

	public void setFileFeeDescription(LanguageLabels fileFeeDescription) {
		this.fileFeeDescription = fileFeeDescription;
	}

	public FileUsageInformation fileRecommendedUsageDescription(LanguageLabels fileRecommendedUsageDescription) {
		this.fileRecommendedUsageDescription = fileRecommendedUsageDescription;
		return this;
	}

	/**
	 * Get fileRecommendedUsageDescription
	 * 
	 * @return fileRecommendedUsageDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getFileRecommendedUsageDescription() {
		return fileRecommendedUsageDescription;
	}

	public void setFileRecommendedUsageDescription(LanguageLabels fileRecommendedUsageDescription) {
		this.fileRecommendedUsageDescription = fileRecommendedUsageDescription;
	}

	public FileUsageInformation fileRightsDescription(LanguageLabels fileRightsDescription) {
		this.fileRightsDescription = fileRightsDescription;
		return this;
	}

	/**
	 * Get fileRightsDescription
	 * 
	 * @return fileRightsDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getFileRightsDescription() {
		return fileRightsDescription;
	}

	public void setFileRightsDescription(LanguageLabels fileRightsDescription) {
		this.fileRightsDescription = fileRightsDescription;
	}

	public FileUsageInformation fileUsageRestriction(LanguageLabels fileUsageRestriction) {
		this.fileUsageRestriction = fileUsageRestriction;
		return this;
	}

	/**
	 * Get fileUsageRestriction
	 * 
	 * @return fileUsageRestriction
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getFileUsageRestriction() {
		return fileUsageRestriction;
	}

	public void setFileUsageRestriction(LanguageLabels fileUsageRestriction) {
		this.fileUsageRestriction = fileUsageRestriction;
	}

	public FileUsageInformation intendedPublicationCountryCode(CodifiedValues intendedPublicationCountryCode) {
		this.intendedPublicationCountryCode = intendedPublicationCountryCode;
		return this;
	}

	/**
	 * Get intendedPublicationCountryCode
	 * 
	 * @return intendedPublicationCountryCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValues getIntendedPublicationCountryCode() {
		return intendedPublicationCountryCode;
	}

	public void setIntendedPublicationCountryCode(CodifiedValues intendedPublicationCountryCode) {
		this.intendedPublicationCountryCode = intendedPublicationCountryCode;
	}

	public FileUsageInformation intendedPublicationMediaTypeDescription(
			LanguageLabels intendedPublicationMediaTypeDescription) {
		this.intendedPublicationMediaTypeDescription = intendedPublicationMediaTypeDescription;
		return this;
	}

	/**
	 * Get intendedPublicationMediaTypeDescription
	 * 
	 * @return intendedPublicationMediaTypeDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getIntendedPublicationMediaTypeDescription() {
		return intendedPublicationMediaTypeDescription;
	}

	public void setIntendedPublicationMediaTypeDescription(LanguageLabels intendedPublicationMediaTypeDescription) {
		this.intendedPublicationMediaTypeDescription = intendedPublicationMediaTypeDescription;
	}

	public FileUsageInformation isFileForInternalUseOnly(CodifiedValue isFileForInternalUseOnly) {
		this.isFileForInternalUseOnly = isFileForInternalUseOnly;
		return this;
	}

	/**
	 * Get isFileForInternalUseOnly
	 * 
	 * @return isFileForInternalUseOnly
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getIsFileForInternalUseOnly() {
		return isFileForInternalUseOnly;
	}

	public void setIsFileForInternalUseOnly(CodifiedValue isFileForInternalUseOnly) {
		this.isFileForInternalUseOnly = isFileForInternalUseOnly;
	}

	public FileUsageInformation isTalentReleaseOnFile(CodifiedValue isTalentReleaseOnFile) {
		this.isTalentReleaseOnFile = isTalentReleaseOnFile;
		return this;
	}

	/**
	 * Get isTalentReleaseOnFile
	 * 
	 * @return isTalentReleaseOnFile
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getIsTalentReleaseOnFile() {
		return isTalentReleaseOnFile;
	}

	public void setIsTalentReleaseOnFile(CodifiedValue isTalentReleaseOnFile) {
		this.isTalentReleaseOnFile = isTalentReleaseOnFile;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FileUsageInformation fileUsageInformation = (FileUsageInformation) o;
		return Objects.equals(this.areFeesRequiredForUse, fileUsageInformation.areFeesRequiredForUse)
				&& Objects.equals(this.canFilesBeEdited, fileUsageInformation.canFilesBeEdited)
				&& Objects.equals(this.fileCampaignDescription, fileUsageInformation.fileCampaignDescription)
				&& Objects.equals(this.fileCopyrightDescription, fileUsageInformation.fileCopyrightDescription)
				&& Objects.equals(this.fileDisclaimerInformation, fileUsageInformation.fileDisclaimerInformation)
				&& Objects.equals(this.fileFeeDescription, fileUsageInformation.fileFeeDescription)
				&& Objects.equals(this.fileRecommendedUsageDescription,
						fileUsageInformation.fileRecommendedUsageDescription)
				&& Objects.equals(this.fileRightsDescription, fileUsageInformation.fileRightsDescription)
				&& Objects.equals(this.fileUsageRestriction, fileUsageInformation.fileUsageRestriction)
				&& Objects.equals(this.intendedPublicationCountryCode,
						fileUsageInformation.intendedPublicationCountryCode)
				&& Objects.equals(this.intendedPublicationMediaTypeDescription,
						fileUsageInformation.intendedPublicationMediaTypeDescription)
				&& Objects.equals(this.isFileForInternalUseOnly, fileUsageInformation.isFileForInternalUseOnly)
				&& Objects.equals(this.isTalentReleaseOnFile, fileUsageInformation.isTalentReleaseOnFile);
	}

	@Override
	public int hashCode() {
		return Objects.hash(areFeesRequiredForUse, canFilesBeEdited, fileCampaignDescription, fileCopyrightDescription,
				fileDisclaimerInformation, fileFeeDescription, fileRecommendedUsageDescription, fileRightsDescription,
				fileUsageRestriction, intendedPublicationCountryCode, intendedPublicationMediaTypeDescription,
				isFileForInternalUseOnly, isTalentReleaseOnFile);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FileUsageInformation {\n");

		sb.append("    areFeesRequiredForUse: ").append(toIndentedString(areFeesRequiredForUse)).append("\n");
		sb.append("    canFilesBeEdited: ").append(toIndentedString(canFilesBeEdited)).append("\n");
		sb.append("    fileCampaignDescription: ").append(toIndentedString(fileCampaignDescription)).append("\n");
		sb.append("    fileCopyrightDescription: ").append(toIndentedString(fileCopyrightDescription)).append("\n");
		sb.append("    fileDisclaimerInformation: ").append(toIndentedString(fileDisclaimerInformation)).append("\n");
		sb.append("    fileFeeDescription: ").append(toIndentedString(fileFeeDescription)).append("\n");
		sb.append("    fileRecommendedUsageDescription: ").append(toIndentedString(fileRecommendedUsageDescription))
				.append("\n");
		sb.append("    fileRightsDescription: ").append(toIndentedString(fileRightsDescription)).append("\n");
		sb.append("    fileUsageRestriction: ").append(toIndentedString(fileUsageRestriction)).append("\n");
		sb.append("    intendedPublicationCountryCode: ").append(toIndentedString(intendedPublicationCountryCode))
				.append("\n");
		sb.append("    intendedPublicationMediaTypeDescription: ")
				.append(toIndentedString(intendedPublicationMediaTypeDescription)).append("\n");
		sb.append("    isFileForInternalUseOnly: ").append(toIndentedString(isFileForInternalUseOnly)).append("\n");
		sb.append("    isTalentReleaseOnFile: ").append(toIndentedString(isTalentReleaseOnFile)).append("\n");
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