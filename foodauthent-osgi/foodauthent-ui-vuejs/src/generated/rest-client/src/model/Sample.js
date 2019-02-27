/**
 * FoodAuthent Swagger API
 * This is the FoodAuthent API Description [www.foodauthent.net]
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@foodauthent.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.3.3
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['../ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.FoodAuthentSwaggerApi) {
      root.FoodAuthentSwaggerApi = {};
    }
    root.FoodAuthentSwaggerApi.Sample = factory(root.FoodAuthentSwaggerApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The Sample model module.
   * @module model/Sample
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>Sample</code>.
   * Sample
   * @alias module:model/Sample
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>Sample</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Sample} obj Optional instance to populate.
   * @return {module:model/Sample} The populated <code>Sample</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('fa-id')) {
        obj['fa-id'] = ApiClient.convertToType(data['fa-id'], 'String');
      }
      if (data.hasOwnProperty('sampleId')) {
        obj['sampleId'] = ApiClient.convertToType(data['sampleId'], 'String');
      }
      if (data.hasOwnProperty('dateOfSampleDrawing')) {
        obj['dateOfSampleDrawing'] = ApiClient.convertToType(data['dateOfSampleDrawing'], 'Date');
      }
      if (data.hasOwnProperty('gtin')) {
        obj['gtin'] = ApiClient.convertToType(data['gtin'], 'String');
      }
      if (data.hasOwnProperty('lot')) {
        obj['lot'] = ApiClient.convertToType(data['lot'], 'String');
      }
      if (data.hasOwnProperty('brand')) {
        obj['brand'] = ApiClient.convertToType(data['brand'], 'String');
      }
      if (data.hasOwnProperty('targetMarket')) {
        obj['targetMarket'] = ApiClient.convertToType(data['targetMarket'], 'String');
      }
      if (data.hasOwnProperty('samplingPlace')) {
        obj['samplingPlace'] = ApiClient.convertToType(data['samplingPlace'], 'String');
      }
      if (data.hasOwnProperty('labelDescription')) {
        obj['labelDescription'] = ApiClient.convertToType(data['labelDescription'], 'String');
      }
      if (data.hasOwnProperty('companyName')) {
        obj['companyName'] = ApiClient.convertToType(data['companyName'], 'String');
      }
      if (data.hasOwnProperty('productClassification')) {
        obj['productClassification'] = ApiClient.convertToType(data['productClassification'], 'String');
      }
      if (data.hasOwnProperty('gpcAttribute')) {
        obj['gpcAttribute'] = ApiClient.convertToType(data['gpcAttribute'], 'String');
      }
      if (data.hasOwnProperty('gpcAttributeValue')) {
        obj['gpcAttributeValue'] = ApiClient.convertToType(data['gpcAttributeValue'], 'String');
      }
      if (data.hasOwnProperty('countryOfOrigin')) {
        obj['countryOfOrigin'] = ApiClient.convertToType(data['countryOfOrigin'], 'String');
      }
      if (data.hasOwnProperty('regionOfOriginClaims')) {
        obj['regionOfOriginClaims'] = ApiClient.convertToType(data['regionOfOriginClaims'], 'String');
      }
      if (data.hasOwnProperty('incredientStatementLanguageCode')) {
        obj['incredientStatementLanguageCode'] = ApiClient.convertToType(data['incredientStatementLanguageCode'], 'String');
      }
      if (data.hasOwnProperty('bestBeforeDate')) {
        obj['bestBeforeDate'] = ApiClient.convertToType(data['bestBeforeDate'], 'Date');
      }
      if (data.hasOwnProperty('application')) {
        obj['application'] = ApiClient.convertToType(data['application'], 'String');
      }
      if (data.hasOwnProperty('typeOfAnalysis')) {
        obj['typeOfAnalysis'] = ApiClient.convertToType(data['typeOfAnalysis'], ['String']);
      }
      if (data.hasOwnProperty('storageConditions')) {
        obj['storageConditions'] = ApiClient.convertToType(data['storageConditions'], 'String');
      }
      if (data.hasOwnProperty('comment')) {
        obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
      }
    }
    return obj;
  }

  /**
   * A global id within the FoodAuthent-system.
   * @member {String} fa-id
   */
  exports.prototype['fa-id'] = undefined;
  /**
   * Sample Id
   * @member {String} sampleId
   */
  exports.prototype['sampleId'] = undefined;
  /**
   * Date of Sample Drawing
   * @member {Date} dateOfSampleDrawing
   */
  exports.prototype['dateOfSampleDrawing'] = undefined;
  /**
   * Global Trade Item Number
   * @member {String} gtin
   */
  exports.prototype['gtin'] = undefined;
  /**
   * Lot
   * @member {String} lot
   */
  exports.prototype['lot'] = undefined;
  /**
   * Brand
   * @member {String} brand
   */
  exports.prototype['brand'] = undefined;
  /**
   * Target Market
   * @member {String} targetMarket
   */
  exports.prototype['targetMarket'] = undefined;
  /**
   * Sampling Place
   * @member {String} samplingPlace
   */
  exports.prototype['samplingPlace'] = undefined;
  /**
   * Label Description
   * @member {String} labelDescription
   */
  exports.prototype['labelDescription'] = undefined;
  /**
   * Company Name
   * @member {String} companyName
   */
  exports.prototype['companyName'] = undefined;
  /**
   * Product Classification
   * @member {String} productClassification
   */
  exports.prototype['productClassification'] = undefined;
  /**
   * GPC Attribute
   * @member {String} gpcAttribute
   */
  exports.prototype['gpcAttribute'] = undefined;
  /**
   * GPC Attribute Value
   * @member {String} gpcAttributeValue
   */
  exports.prototype['gpcAttributeValue'] = undefined;
  /**
   * Country Of Origin
   * @member {String} countryOfOrigin
   */
  exports.prototype['countryOfOrigin'] = undefined;
  /**
   * Region Of Origin-Claims
   * @member {String} regionOfOriginClaims
   */
  exports.prototype['regionOfOriginClaims'] = undefined;
  /**
   * Incredient Statement + language Code
   * @member {String} incredientStatementLanguageCode
   */
  exports.prototype['incredientStatementLanguageCode'] = undefined;
  /**
   * Best Before Date
   * @member {Date} bestBeforeDate
   */
  exports.prototype['bestBeforeDate'] = undefined;
  /**
   * Application
   * @member {String} application
   */
  exports.prototype['application'] = undefined;
  /**
   * Type Of Analysis
   * @member {Array.<String>} typeOfAnalysis
   */
  exports.prototype['typeOfAnalysis'] = undefined;
  /**
   * StorageConditions
   * @member {String} storageConditions
   */
  exports.prototype['storageConditions'] = undefined;
  /**
   * Comment
   * @member {String} comment
   */
  exports.prototype['comment'] = undefined;



  return exports;
}));

