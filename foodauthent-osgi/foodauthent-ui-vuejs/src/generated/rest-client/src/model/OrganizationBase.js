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
    define(['../ApiClient', '../model/OrganizationalPostalAddress'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./OrganizationalPostalAddress'));
  } else {
    // Browser globals (root is window)
    if (!root.FoodAuthentSwaggerApi) {
      root.FoodAuthentSwaggerApi = {};
    }
    root.FoodAuthentSwaggerApi.OrganizationBase = factory(root.FoodAuthentSwaggerApi.ApiClient, root.FoodAuthentSwaggerApi.OrganizationalPostalAddress);
  }
}(this, function(ApiClient, OrganizationalPostalAddress) {
  'use strict';



  /**
   * The OrganizationBase model module.
   * @module model/OrganizationBase
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>OrganizationBase</code>.
   * Organization Base Object
   * @alias module:model/OrganizationBase
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>OrganizationBase</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OrganizationBase} obj Optional instance to populate.
   * @return {module:model/OrganizationBase} The populated <code>OrganizationBase</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('faxNumbers')) {
        obj['faxNumbers'] = ApiClient.convertToType(data['faxNumbers'], ['String']);
      }
      if (data.hasOwnProperty('phoneNumbers')) {
        obj['phoneNumbers'] = ApiClient.convertToType(data['phoneNumbers'], ['String']);
      }
      if (data.hasOwnProperty('businessCategory')) {
        obj['businessCategory'] = ApiClient.convertToType(data['businessCategory'], 'String');
      }
      if (data.hasOwnProperty('gln')) {
        obj['gln'] = ApiClient.convertToType(data['gln'], 'String');
      }
      if (data.hasOwnProperty('gcpLength')) {
        obj['gcpLength'] = ApiClient.convertToType(data['gcpLength'], 'Number');
      }
      if (data.hasOwnProperty('discoverySecret')) {
        obj['discoverySecret'] = ApiClient.convertToType(data['discoverySecret'], 'String');
      }
      if (data.hasOwnProperty('postalAddress')) {
        obj['postalAddress'] = OrganizationalPostalAddress.constructFromObject(data['postalAddress']);
      }
      if (data.hasOwnProperty('billingAddress')) {
        obj['billingAddress'] = OrganizationalPostalAddress.constructFromObject(data['billingAddress']);
      }
    }
    return obj;
  }

  /**
   * verbose description
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * fax numbers
   * @member {Array.<String>} faxNumbers
   */
  exports.prototype['faxNumbers'] = undefined;
  /**
   * phone numbers
   * @member {Array.<String>} phoneNumbers
   */
  exports.prototype['phoneNumbers'] = undefined;
  /**
   * business category
   * @member {String} businessCategory
   */
  exports.prototype['businessCategory'] = undefined;
  /**
   * Global Location Number
   * @member {String} gln
   */
  exports.prototype['gln'] = undefined;
  /**
   * business category
   * @member {Number} gcpLength
   */
  exports.prototype['gcpLength'] = undefined;
  /**
   * Secret Hash Key for discovery service
   * @member {String} discoverySecret
   */
  exports.prototype['discoverySecret'] = undefined;
  /**
   * @member {module:model/OrganizationalPostalAddress} postalAddress
   */
  exports.prototype['postalAddress'] = undefined;
  /**
   * @member {module:model/OrganizationalPostalAddress} billingAddress
   */
  exports.prototype['billingAddress'] = undefined;



  return exports;
}));


