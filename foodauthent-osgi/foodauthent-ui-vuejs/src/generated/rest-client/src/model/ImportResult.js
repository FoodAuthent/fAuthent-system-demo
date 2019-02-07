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
    root.FoodAuthentSwaggerApi.ImportResult = factory(root.FoodAuthentSwaggerApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The ImportResult model module.
   * @module model/ImportResult
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>ImportResult</code>.
   * @alias module:model/ImportResult
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>ImportResult</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ImportResult} obj Optional instance to populate.
   * @return {module:model/ImportResult} The populated <code>ImportResult</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('fingerprints')) {
        obj['fingerprints'] = ApiClient.convertToType(data['fingerprints'], ['String']);
      }
      if (data.hasOwnProperty('products')) {
        obj['products'] = ApiClient.convertToType(data['products'], ['String']);
      }
      if (data.hasOwnProperty('sops')) {
        obj['sops'] = ApiClient.convertToType(data['sops'], ['String']);
      }
    }
    return obj;
  }

  /**
   * @member {Array.<String>} fingerprints
   */
  exports.prototype['fingerprints'] = undefined;
  /**
   * @member {Array.<String>} products
   */
  exports.prototype['products'] = undefined;
  /**
   * @member {Array.<String>} sops
   */
  exports.prototype['sops'] = undefined;



  return exports;
}));


