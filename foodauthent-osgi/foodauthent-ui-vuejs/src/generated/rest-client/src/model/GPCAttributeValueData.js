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
    root.FoodAuthentSwaggerApi.GPCAttributeValueData = factory(root.FoodAuthentSwaggerApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The GPCAttributeValueData model module.
   * @module model/GPCAttributeValueData
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>GPCAttributeValueData</code>.
   * Global Product Classification Attribute for storing gpc brick details
   * @alias module:model/GPCAttributeValueData
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>GPCAttributeValueData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/GPCAttributeValueData} obj Optional instance to populate.
   * @return {module:model/GPCAttributeValueData} The populated <code>GPCAttributeValueData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('code')) {
        obj['code'] = ApiClient.convertToType(data['code'], 'String');
      }
      if (data.hasOwnProperty('text')) {
        obj['text'] = ApiClient.convertToType(data['text'], 'String');
      }
    }
    return obj;
  }

  /**
   * GPC attribute value code
   * @member {String} code
   */
  exports.prototype['code'] = undefined;
  /**
   * GPC attribute value human readable text
   * @member {String} text
   */
  exports.prototype['text'] = undefined;



  return exports;
}));


