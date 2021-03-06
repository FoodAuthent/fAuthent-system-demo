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
    define(['../ApiClient', '../model/FingerprintType', '../model/ModelType'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./FingerprintType'), require('./ModelType'));
  } else {
    // Browser globals (root is window)
    if (!root.FoodAuthentSwaggerApi) {
      root.FoodAuthentSwaggerApi = {};
    }
    root.FoodAuthentSwaggerApi.WorkflowIOTypes = factory(root.FoodAuthentSwaggerApi.ApiClient, root.FoodAuthentSwaggerApi.FingerprintType, root.FoodAuthentSwaggerApi.ModelType);
  }
}(this, function(ApiClient, FingerprintType, ModelType) {
  'use strict';



  /**
   * The WorkflowIOTypes model module.
   * @module model/WorkflowIOTypes
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>WorkflowIOTypes</code>.
   * Definition of the workflows input and output types. Types that are not required as input are empty.
   * @alias module:model/WorkflowIOTypes
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>WorkflowIOTypes</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/WorkflowIOTypes} obj Optional instance to populate.
   * @return {module:model/WorkflowIOTypes} The populated <code>WorkflowIOTypes</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('fingerprint-type')) {
        obj['fingerprint-type'] = FingerprintType.constructFromObject(data['fingerprint-type']);
      }
      if (data.hasOwnProperty('model-type')) {
        obj['model-type'] = ModelType.constructFromObject(data['model-type']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/FingerprintType} fingerprint-type
   */
  exports.prototype['fingerprint-type'] = undefined;
  /**
   * @member {module:model/ModelType} model-type
   */
  exports.prototype['model-type'] = undefined;



  return exports;
}));


