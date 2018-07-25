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
import org.foodauthent.oneworldsync.client.model.ChannelSpecificMarketingInformation;
import org.foodauthent.oneworldsync.client.model.CodifiedValue;
import org.foodauthent.oneworldsync.client.model.CodifiedValues;
import org.foodauthent.oneworldsync.client.model.IllegalToAdvertiseTargetMarket;
import org.foodauthent.oneworldsync.client.model.LanguageLabels;
import org.foodauthent.oneworldsync.client.model.MarketingCampaign;
import org.foodauthent.oneworldsync.client.model.Season;
import org.foodauthent.oneworldsync.client.model.ShortTradeItemMarketingMessage;
import org.foodauthent.oneworldsync.client.model.TargetConsumer;
import org.foodauthent.oneworldsync.client.model.TradeItemFeatureCodeReference;
import org.foodauthent.oneworldsync.client.model.TradeItemMarketingMessage;
import org.foodauthent.oneworldsync.client.model.Values;

/**
 * MarketingInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-25T20:10:55.785Z")
public class MarketingInformation {
	@JsonProperty("autographedBy")
	private String autographedBy = null;

	@JsonProperty("builtInProductType")
	private Values builtInProductType = null;

	@JsonProperty("channelSpecificMarketingInformation")
	private List<ChannelSpecificMarketingInformation> channelSpecificMarketingInformation = null;

	@JsonProperty("couponFamilyCode")
	private Values couponFamilyCode = null;

	@JsonProperty("designer")
	private LanguageLabels designer = null;

	@JsonProperty("educationalFocusDescription")
	private LanguageLabels educationalFocusDescription = null;

	@JsonProperty("illegalToAdvertiseTargetMarket")
	private List<IllegalToAdvertiseTargetMarket> illegalToAdvertiseTargetMarket = null;

	@JsonProperty("isImitationOrSubstitute")
	private String isImitationOrSubstitute = null;

	@JsonProperty("isTradeItemConsideredCollectibleOrMemorabilia")
	private CodifiedValue isTradeItemConsideredCollectibleOrMemorabilia = null;

	@JsonProperty("marketingCampaign")
	private List<MarketingCampaign> marketingCampaign = null;

	@JsonProperty("necessaryTradeItemToUseDescription")
	private LanguageLabels necessaryTradeItemToUseDescription = null;

	@JsonProperty("season")
	private List<Season> season = null;

	@JsonProperty("shortTradeItemMarketingMessage")
	private List<ShortTradeItemMarketingMessage> shortTradeItemMarketingMessage = null;

	@JsonProperty("specialItemCode")
	private CodifiedValues specialItemCode = null;

	@JsonProperty("targetConsumer")
	private TargetConsumer targetConsumer = null;

	@JsonProperty("targetOccasionOrTheme")
	private LanguageLabels targetOccasionOrTheme = null;

	@JsonProperty("tradeItemFeatureBenefit")
	private LanguageLabels tradeItemFeatureBenefit = null;

	@JsonProperty("tradeItemFeatureCodeReference")
	private List<TradeItemFeatureCodeReference> tradeItemFeatureCodeReference = null;

	@JsonProperty("tradeItemIncludedAccessories")
	private LanguageLabels tradeItemIncludedAccessories = null;

	@JsonProperty("tradeItemIntroductionYear")
	private String tradeItemIntroductionYear = null;

	@JsonProperty("tradeItemKeyWords")
	private LanguageLabels tradeItemKeyWords = null;

	@JsonProperty("tradeItemMarketingMessage")
	private List<TradeItemMarketingMessage> tradeItemMarketingMessage = null;

	@JsonProperty("tradeItemTechnologyDescription")
	private LanguageLabels tradeItemTechnologyDescription = null;

	@JsonProperty("usageColourDescription")
	private LanguageLabels usageColourDescription = null;

	public MarketingInformation autographedBy(String autographedBy) {
		this.autographedBy = autographedBy;
		return this;
	}

	/**
	 * Get autographedBy
	 * 
	 * @return autographedBy
	 **/
	@ApiModelProperty(value = "")
	public String getAutographedBy() {
		return autographedBy;
	}

	public void setAutographedBy(String autographedBy) {
		this.autographedBy = autographedBy;
	}

	public MarketingInformation builtInProductType(Values builtInProductType) {
		this.builtInProductType = builtInProductType;
		return this;
	}

	/**
	 * Get builtInProductType
	 * 
	 * @return builtInProductType
	 **/
	@ApiModelProperty(value = "")
	public Values getBuiltInProductType() {
		return builtInProductType;
	}

	public void setBuiltInProductType(Values builtInProductType) {
		this.builtInProductType = builtInProductType;
	}

	public MarketingInformation channelSpecificMarketingInformation(
			List<ChannelSpecificMarketingInformation> channelSpecificMarketingInformation) {
		this.channelSpecificMarketingInformation = channelSpecificMarketingInformation;
		return this;
	}

	public MarketingInformation addChannelSpecificMarketingInformationItem(
			ChannelSpecificMarketingInformation channelSpecificMarketingInformationItem) {
		if (this.channelSpecificMarketingInformation == null) {
			this.channelSpecificMarketingInformation = new ArrayList<ChannelSpecificMarketingInformation>();
		}
		this.channelSpecificMarketingInformation.add(channelSpecificMarketingInformationItem);
		return this;
	}

	/**
	 * Get channelSpecificMarketingInformation
	 * 
	 * @return channelSpecificMarketingInformation
	 **/
	@ApiModelProperty(value = "")
	public List<ChannelSpecificMarketingInformation> getChannelSpecificMarketingInformation() {
		return channelSpecificMarketingInformation;
	}

	public void setChannelSpecificMarketingInformation(
			List<ChannelSpecificMarketingInformation> channelSpecificMarketingInformation) {
		this.channelSpecificMarketingInformation = channelSpecificMarketingInformation;
	}

	public MarketingInformation couponFamilyCode(Values couponFamilyCode) {
		this.couponFamilyCode = couponFamilyCode;
		return this;
	}

	/**
	 * Get couponFamilyCode
	 * 
	 * @return couponFamilyCode
	 **/
	@ApiModelProperty(value = "")
	public Values getCouponFamilyCode() {
		return couponFamilyCode;
	}

	public void setCouponFamilyCode(Values couponFamilyCode) {
		this.couponFamilyCode = couponFamilyCode;
	}

	public MarketingInformation designer(LanguageLabels designer) {
		this.designer = designer;
		return this;
	}

	/**
	 * Get designer
	 * 
	 * @return designer
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getDesigner() {
		return designer;
	}

	public void setDesigner(LanguageLabels designer) {
		this.designer = designer;
	}

	public MarketingInformation educationalFocusDescription(LanguageLabels educationalFocusDescription) {
		this.educationalFocusDescription = educationalFocusDescription;
		return this;
	}

	/**
	 * Get educationalFocusDescription
	 * 
	 * @return educationalFocusDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getEducationalFocusDescription() {
		return educationalFocusDescription;
	}

	public void setEducationalFocusDescription(LanguageLabels educationalFocusDescription) {
		this.educationalFocusDescription = educationalFocusDescription;
	}

	public MarketingInformation illegalToAdvertiseTargetMarket(
			List<IllegalToAdvertiseTargetMarket> illegalToAdvertiseTargetMarket) {
		this.illegalToAdvertiseTargetMarket = illegalToAdvertiseTargetMarket;
		return this;
	}

	public MarketingInformation addIllegalToAdvertiseTargetMarketItem(
			IllegalToAdvertiseTargetMarket illegalToAdvertiseTargetMarketItem) {
		if (this.illegalToAdvertiseTargetMarket == null) {
			this.illegalToAdvertiseTargetMarket = new ArrayList<IllegalToAdvertiseTargetMarket>();
		}
		this.illegalToAdvertiseTargetMarket.add(illegalToAdvertiseTargetMarketItem);
		return this;
	}

	/**
	 * Get illegalToAdvertiseTargetMarket
	 * 
	 * @return illegalToAdvertiseTargetMarket
	 **/
	@ApiModelProperty(value = "")
	public List<IllegalToAdvertiseTargetMarket> getIllegalToAdvertiseTargetMarket() {
		return illegalToAdvertiseTargetMarket;
	}

	public void setIllegalToAdvertiseTargetMarket(List<IllegalToAdvertiseTargetMarket> illegalToAdvertiseTargetMarket) {
		this.illegalToAdvertiseTargetMarket = illegalToAdvertiseTargetMarket;
	}

	public MarketingInformation isImitationOrSubstitute(String isImitationOrSubstitute) {
		this.isImitationOrSubstitute = isImitationOrSubstitute;
		return this;
	}

	/**
	 * Get isImitationOrSubstitute
	 * 
	 * @return isImitationOrSubstitute
	 **/
	@ApiModelProperty(value = "")
	public String getIsImitationOrSubstitute() {
		return isImitationOrSubstitute;
	}

	public void setIsImitationOrSubstitute(String isImitationOrSubstitute) {
		this.isImitationOrSubstitute = isImitationOrSubstitute;
	}

	public MarketingInformation isTradeItemConsideredCollectibleOrMemorabilia(
			CodifiedValue isTradeItemConsideredCollectibleOrMemorabilia) {
		this.isTradeItemConsideredCollectibleOrMemorabilia = isTradeItemConsideredCollectibleOrMemorabilia;
		return this;
	}

	/**
	 * Get isTradeItemConsideredCollectibleOrMemorabilia
	 * 
	 * @return isTradeItemConsideredCollectibleOrMemorabilia
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValue getIsTradeItemConsideredCollectibleOrMemorabilia() {
		return isTradeItemConsideredCollectibleOrMemorabilia;
	}

	public void setIsTradeItemConsideredCollectibleOrMemorabilia(
			CodifiedValue isTradeItemConsideredCollectibleOrMemorabilia) {
		this.isTradeItemConsideredCollectibleOrMemorabilia = isTradeItemConsideredCollectibleOrMemorabilia;
	}

	public MarketingInformation marketingCampaign(List<MarketingCampaign> marketingCampaign) {
		this.marketingCampaign = marketingCampaign;
		return this;
	}

	public MarketingInformation addMarketingCampaignItem(MarketingCampaign marketingCampaignItem) {
		if (this.marketingCampaign == null) {
			this.marketingCampaign = new ArrayList<MarketingCampaign>();
		}
		this.marketingCampaign.add(marketingCampaignItem);
		return this;
	}

	/**
	 * Get marketingCampaign
	 * 
	 * @return marketingCampaign
	 **/
	@ApiModelProperty(value = "")
	public List<MarketingCampaign> getMarketingCampaign() {
		return marketingCampaign;
	}

	public void setMarketingCampaign(List<MarketingCampaign> marketingCampaign) {
		this.marketingCampaign = marketingCampaign;
	}

	public MarketingInformation necessaryTradeItemToUseDescription(LanguageLabels necessaryTradeItemToUseDescription) {
		this.necessaryTradeItemToUseDescription = necessaryTradeItemToUseDescription;
		return this;
	}

	/**
	 * Get necessaryTradeItemToUseDescription
	 * 
	 * @return necessaryTradeItemToUseDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getNecessaryTradeItemToUseDescription() {
		return necessaryTradeItemToUseDescription;
	}

	public void setNecessaryTradeItemToUseDescription(LanguageLabels necessaryTradeItemToUseDescription) {
		this.necessaryTradeItemToUseDescription = necessaryTradeItemToUseDescription;
	}

	public MarketingInformation season(List<Season> season) {
		this.season = season;
		return this;
	}

	public MarketingInformation addSeasonItem(Season seasonItem) {
		if (this.season == null) {
			this.season = new ArrayList<Season>();
		}
		this.season.add(seasonItem);
		return this;
	}

	/**
	 * Get season
	 * 
	 * @return season
	 **/
	@ApiModelProperty(value = "")
	public List<Season> getSeason() {
		return season;
	}

	public void setSeason(List<Season> season) {
		this.season = season;
	}

	public MarketingInformation shortTradeItemMarketingMessage(
			List<ShortTradeItemMarketingMessage> shortTradeItemMarketingMessage) {
		this.shortTradeItemMarketingMessage = shortTradeItemMarketingMessage;
		return this;
	}

	public MarketingInformation addShortTradeItemMarketingMessageItem(
			ShortTradeItemMarketingMessage shortTradeItemMarketingMessageItem) {
		if (this.shortTradeItemMarketingMessage == null) {
			this.shortTradeItemMarketingMessage = new ArrayList<ShortTradeItemMarketingMessage>();
		}
		this.shortTradeItemMarketingMessage.add(shortTradeItemMarketingMessageItem);
		return this;
	}

	/**
	 * Get shortTradeItemMarketingMessage
	 * 
	 * @return shortTradeItemMarketingMessage
	 **/
	@ApiModelProperty(value = "")
	public List<ShortTradeItemMarketingMessage> getShortTradeItemMarketingMessage() {
		return shortTradeItemMarketingMessage;
	}

	public void setShortTradeItemMarketingMessage(List<ShortTradeItemMarketingMessage> shortTradeItemMarketingMessage) {
		this.shortTradeItemMarketingMessage = shortTradeItemMarketingMessage;
	}

	public MarketingInformation specialItemCode(CodifiedValues specialItemCode) {
		this.specialItemCode = specialItemCode;
		return this;
	}

	/**
	 * Get specialItemCode
	 * 
	 * @return specialItemCode
	 **/
	@ApiModelProperty(value = "")
	public CodifiedValues getSpecialItemCode() {
		return specialItemCode;
	}

	public void setSpecialItemCode(CodifiedValues specialItemCode) {
		this.specialItemCode = specialItemCode;
	}

	public MarketingInformation targetConsumer(TargetConsumer targetConsumer) {
		this.targetConsumer = targetConsumer;
		return this;
	}

	/**
	 * Get targetConsumer
	 * 
	 * @return targetConsumer
	 **/
	@ApiModelProperty(value = "")
	public TargetConsumer getTargetConsumer() {
		return targetConsumer;
	}

	public void setTargetConsumer(TargetConsumer targetConsumer) {
		this.targetConsumer = targetConsumer;
	}

	public MarketingInformation targetOccasionOrTheme(LanguageLabels targetOccasionOrTheme) {
		this.targetOccasionOrTheme = targetOccasionOrTheme;
		return this;
	}

	/**
	 * Get targetOccasionOrTheme
	 * 
	 * @return targetOccasionOrTheme
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getTargetOccasionOrTheme() {
		return targetOccasionOrTheme;
	}

	public void setTargetOccasionOrTheme(LanguageLabels targetOccasionOrTheme) {
		this.targetOccasionOrTheme = targetOccasionOrTheme;
	}

	public MarketingInformation tradeItemFeatureBenefit(LanguageLabels tradeItemFeatureBenefit) {
		this.tradeItemFeatureBenefit = tradeItemFeatureBenefit;
		return this;
	}

	/**
	 * Get tradeItemFeatureBenefit
	 * 
	 * @return tradeItemFeatureBenefit
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getTradeItemFeatureBenefit() {
		return tradeItemFeatureBenefit;
	}

	public void setTradeItemFeatureBenefit(LanguageLabels tradeItemFeatureBenefit) {
		this.tradeItemFeatureBenefit = tradeItemFeatureBenefit;
	}

	public MarketingInformation tradeItemFeatureCodeReference(
			List<TradeItemFeatureCodeReference> tradeItemFeatureCodeReference) {
		this.tradeItemFeatureCodeReference = tradeItemFeatureCodeReference;
		return this;
	}

	public MarketingInformation addTradeItemFeatureCodeReferenceItem(
			TradeItemFeatureCodeReference tradeItemFeatureCodeReferenceItem) {
		if (this.tradeItemFeatureCodeReference == null) {
			this.tradeItemFeatureCodeReference = new ArrayList<TradeItemFeatureCodeReference>();
		}
		this.tradeItemFeatureCodeReference.add(tradeItemFeatureCodeReferenceItem);
		return this;
	}

	/**
	 * Get tradeItemFeatureCodeReference
	 * 
	 * @return tradeItemFeatureCodeReference
	 **/
	@ApiModelProperty(value = "")
	public List<TradeItemFeatureCodeReference> getTradeItemFeatureCodeReference() {
		return tradeItemFeatureCodeReference;
	}

	public void setTradeItemFeatureCodeReference(List<TradeItemFeatureCodeReference> tradeItemFeatureCodeReference) {
		this.tradeItemFeatureCodeReference = tradeItemFeatureCodeReference;
	}

	public MarketingInformation tradeItemIncludedAccessories(LanguageLabels tradeItemIncludedAccessories) {
		this.tradeItemIncludedAccessories = tradeItemIncludedAccessories;
		return this;
	}

	/**
	 * Get tradeItemIncludedAccessories
	 * 
	 * @return tradeItemIncludedAccessories
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getTradeItemIncludedAccessories() {
		return tradeItemIncludedAccessories;
	}

	public void setTradeItemIncludedAccessories(LanguageLabels tradeItemIncludedAccessories) {
		this.tradeItemIncludedAccessories = tradeItemIncludedAccessories;
	}

	public MarketingInformation tradeItemIntroductionYear(String tradeItemIntroductionYear) {
		this.tradeItemIntroductionYear = tradeItemIntroductionYear;
		return this;
	}

	/**
	 * Get tradeItemIntroductionYear
	 * 
	 * @return tradeItemIntroductionYear
	 **/
	@ApiModelProperty(value = "")
	public String getTradeItemIntroductionYear() {
		return tradeItemIntroductionYear;
	}

	public void setTradeItemIntroductionYear(String tradeItemIntroductionYear) {
		this.tradeItemIntroductionYear = tradeItemIntroductionYear;
	}

	public MarketingInformation tradeItemKeyWords(LanguageLabels tradeItemKeyWords) {
		this.tradeItemKeyWords = tradeItemKeyWords;
		return this;
	}

	/**
	 * Get tradeItemKeyWords
	 * 
	 * @return tradeItemKeyWords
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getTradeItemKeyWords() {
		return tradeItemKeyWords;
	}

	public void setTradeItemKeyWords(LanguageLabels tradeItemKeyWords) {
		this.tradeItemKeyWords = tradeItemKeyWords;
	}

	public MarketingInformation tradeItemMarketingMessage(List<TradeItemMarketingMessage> tradeItemMarketingMessage) {
		this.tradeItemMarketingMessage = tradeItemMarketingMessage;
		return this;
	}

	public MarketingInformation addTradeItemMarketingMessageItem(
			TradeItemMarketingMessage tradeItemMarketingMessageItem) {
		if (this.tradeItemMarketingMessage == null) {
			this.tradeItemMarketingMessage = new ArrayList<TradeItemMarketingMessage>();
		}
		this.tradeItemMarketingMessage.add(tradeItemMarketingMessageItem);
		return this;
	}

	/**
	 * Get tradeItemMarketingMessage
	 * 
	 * @return tradeItemMarketingMessage
	 **/
	@ApiModelProperty(value = "")
	public List<TradeItemMarketingMessage> getTradeItemMarketingMessage() {
		return tradeItemMarketingMessage;
	}

	public void setTradeItemMarketingMessage(List<TradeItemMarketingMessage> tradeItemMarketingMessage) {
		this.tradeItemMarketingMessage = tradeItemMarketingMessage;
	}

	public MarketingInformation tradeItemTechnologyDescription(LanguageLabels tradeItemTechnologyDescription) {
		this.tradeItemTechnologyDescription = tradeItemTechnologyDescription;
		return this;
	}

	/**
	 * Get tradeItemTechnologyDescription
	 * 
	 * @return tradeItemTechnologyDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getTradeItemTechnologyDescription() {
		return tradeItemTechnologyDescription;
	}

	public void setTradeItemTechnologyDescription(LanguageLabels tradeItemTechnologyDescription) {
		this.tradeItemTechnologyDescription = tradeItemTechnologyDescription;
	}

	public MarketingInformation usageColourDescription(LanguageLabels usageColourDescription) {
		this.usageColourDescription = usageColourDescription;
		return this;
	}

	/**
	 * Get usageColourDescription
	 * 
	 * @return usageColourDescription
	 **/
	@ApiModelProperty(value = "")
	public LanguageLabels getUsageColourDescription() {
		return usageColourDescription;
	}

	public void setUsageColourDescription(LanguageLabels usageColourDescription) {
		this.usageColourDescription = usageColourDescription;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MarketingInformation marketingInformation = (MarketingInformation) o;
		return Objects.equals(this.autographedBy, marketingInformation.autographedBy)
				&& Objects.equals(this.builtInProductType, marketingInformation.builtInProductType)
				&& Objects.equals(this.channelSpecificMarketingInformation,
						marketingInformation.channelSpecificMarketingInformation)
				&& Objects.equals(this.couponFamilyCode, marketingInformation.couponFamilyCode)
				&& Objects.equals(this.designer, marketingInformation.designer)
				&& Objects.equals(this.educationalFocusDescription, marketingInformation.educationalFocusDescription)
				&& Objects.equals(this.illegalToAdvertiseTargetMarket,
						marketingInformation.illegalToAdvertiseTargetMarket)
				&& Objects.equals(this.isImitationOrSubstitute, marketingInformation.isImitationOrSubstitute)
				&& Objects.equals(this.isTradeItemConsideredCollectibleOrMemorabilia,
						marketingInformation.isTradeItemConsideredCollectibleOrMemorabilia)
				&& Objects.equals(this.marketingCampaign, marketingInformation.marketingCampaign)
				&& Objects.equals(this.necessaryTradeItemToUseDescription,
						marketingInformation.necessaryTradeItemToUseDescription)
				&& Objects.equals(this.season, marketingInformation.season)
				&& Objects.equals(this.shortTradeItemMarketingMessage,
						marketingInformation.shortTradeItemMarketingMessage)
				&& Objects.equals(this.specialItemCode, marketingInformation.specialItemCode)
				&& Objects.equals(this.targetConsumer, marketingInformation.targetConsumer)
				&& Objects.equals(this.targetOccasionOrTheme, marketingInformation.targetOccasionOrTheme)
				&& Objects.equals(this.tradeItemFeatureBenefit, marketingInformation.tradeItemFeatureBenefit)
				&& Objects.equals(this.tradeItemFeatureCodeReference,
						marketingInformation.tradeItemFeatureCodeReference)
				&& Objects.equals(this.tradeItemIncludedAccessories, marketingInformation.tradeItemIncludedAccessories)
				&& Objects.equals(this.tradeItemIntroductionYear, marketingInformation.tradeItemIntroductionYear)
				&& Objects.equals(this.tradeItemKeyWords, marketingInformation.tradeItemKeyWords)
				&& Objects.equals(this.tradeItemMarketingMessage, marketingInformation.tradeItemMarketingMessage)
				&& Objects.equals(this.tradeItemTechnologyDescription,
						marketingInformation.tradeItemTechnologyDescription)
				&& Objects.equals(this.usageColourDescription, marketingInformation.usageColourDescription);
	}

	@Override
	public int hashCode() {
		return Objects.hash(autographedBy, builtInProductType, channelSpecificMarketingInformation, couponFamilyCode,
				designer, educationalFocusDescription, illegalToAdvertiseTargetMarket, isImitationOrSubstitute,
				isTradeItemConsideredCollectibleOrMemorabilia, marketingCampaign, necessaryTradeItemToUseDescription,
				season, shortTradeItemMarketingMessage, specialItemCode, targetConsumer, targetOccasionOrTheme,
				tradeItemFeatureBenefit, tradeItemFeatureCodeReference, tradeItemIncludedAccessories,
				tradeItemIntroductionYear, tradeItemKeyWords, tradeItemMarketingMessage, tradeItemTechnologyDescription,
				usageColourDescription);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MarketingInformation {\n");

		sb.append("    autographedBy: ").append(toIndentedString(autographedBy)).append("\n");
		sb.append("    builtInProductType: ").append(toIndentedString(builtInProductType)).append("\n");
		sb.append("    channelSpecificMarketingInformation: ")
				.append(toIndentedString(channelSpecificMarketingInformation)).append("\n");
		sb.append("    couponFamilyCode: ").append(toIndentedString(couponFamilyCode)).append("\n");
		sb.append("    designer: ").append(toIndentedString(designer)).append("\n");
		sb.append("    educationalFocusDescription: ").append(toIndentedString(educationalFocusDescription))
				.append("\n");
		sb.append("    illegalToAdvertiseTargetMarket: ").append(toIndentedString(illegalToAdvertiseTargetMarket))
				.append("\n");
		sb.append("    isImitationOrSubstitute: ").append(toIndentedString(isImitationOrSubstitute)).append("\n");
		sb.append("    isTradeItemConsideredCollectibleOrMemorabilia: ")
				.append(toIndentedString(isTradeItemConsideredCollectibleOrMemorabilia)).append("\n");
		sb.append("    marketingCampaign: ").append(toIndentedString(marketingCampaign)).append("\n");
		sb.append("    necessaryTradeItemToUseDescription: ")
				.append(toIndentedString(necessaryTradeItemToUseDescription)).append("\n");
		sb.append("    season: ").append(toIndentedString(season)).append("\n");
		sb.append("    shortTradeItemMarketingMessage: ").append(toIndentedString(shortTradeItemMarketingMessage))
				.append("\n");
		sb.append("    specialItemCode: ").append(toIndentedString(specialItemCode)).append("\n");
		sb.append("    targetConsumer: ").append(toIndentedString(targetConsumer)).append("\n");
		sb.append("    targetOccasionOrTheme: ").append(toIndentedString(targetOccasionOrTheme)).append("\n");
		sb.append("    tradeItemFeatureBenefit: ").append(toIndentedString(tradeItemFeatureBenefit)).append("\n");
		sb.append("    tradeItemFeatureCodeReference: ").append(toIndentedString(tradeItemFeatureCodeReference))
				.append("\n");
		sb.append("    tradeItemIncludedAccessories: ").append(toIndentedString(tradeItemIncludedAccessories))
				.append("\n");
		sb.append("    tradeItemIntroductionYear: ").append(toIndentedString(tradeItemIntroductionYear)).append("\n");
		sb.append("    tradeItemKeyWords: ").append(toIndentedString(tradeItemKeyWords)).append("\n");
		sb.append("    tradeItemMarketingMessage: ").append(toIndentedString(tradeItemMarketingMessage)).append("\n");
		sb.append("    tradeItemTechnologyDescription: ").append(toIndentedString(tradeItemTechnologyDescription))
				.append("\n");
		sb.append("    usageColourDescription: ").append(toIndentedString(usageColourDescription)).append("\n");
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
