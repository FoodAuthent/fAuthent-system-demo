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
    define(['../ApiClient', '../model/OrganizationBase', '../model/OrganizationalPostalAddress'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./OrganizationBase'), require('./OrganizationalPostalAddress'));
  } else {
    // Browser globals (root is window)
    if (!root.FoodAuthentSwaggerApi) {
      root.FoodAuthentSwaggerApi = {};
    }
    root.FoodAuthentSwaggerApi.Organization = factory(root.FoodAuthentSwaggerApi.ApiClient, root.FoodAuthentSwaggerApi.OrganizationBase, root.FoodAuthentSwaggerApi.OrganizationalPostalAddress);
  }
}(this, function(ApiClient, OrganizationBase, OrganizationalPostalAddress) {
  'use strict';



  /**
   * The Organization model module.
   * @module model/Organization
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>Organization</code>.
   * Organization Object
   * @alias module:model/Organization
   * @class
   * @extends module:model/OrganizationBase
   * @implements module:model/OrganizationBase
   * @param dn {} organization's LDAP dn
   * @param organizationName {} unique OrganizationalUnit name
   */
  var exports = function(dn, organizationName) {
    var _this = this;

    OrganizationBase.call(_this);
    _this['dn'] = dn;
    _this['organizationName'] = organizationName;
  };

  /**
   * Constructs a <code>Organization</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Organization} obj Optional instance to populate.
   * @return {module:model/Organization} The populated <code>Organization</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      OrganizationBase.constructFromObject(data, obj);
      if (data.hasOwnProperty('dn')) {
        obj['dn'] = ApiClient.convertToType(data['dn'], 'String');
      }
      if (data.hasOwnProperty('organizationName')) {
        obj['organizationName'] = ApiClient.convertToType(data['organizationName'], 'String');
      }
    }
    return obj;
  }

  exports.prototype = Object.create(OrganizationBase.prototype);
  exports.prototype.constructor = exports;

  /**
   * organization's LDAP dn
   * @member {String} dn
   */
  exports.prototype['dn'] = undefined;
  /**
   * unique OrganizationalUnit name
   * @member {String} organizationName
   */
  exports.prototype['organizationName'] = undefined;

  // Implement OrganizationBase interface:
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


