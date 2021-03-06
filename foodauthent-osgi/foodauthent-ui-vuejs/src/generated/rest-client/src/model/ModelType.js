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
    root.FoodAuthentSwaggerApi.ModelType = factory(root.FoodAuthentSwaggerApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The ModelType model module.
   * @module model/ModelType
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>ModelType</code>.
   * type of a model
   * @alias module:model/ModelType
   * @class
   * @param name {module:model/ModelType.NameEnum} The name of the type of the model, e.g., in order to be able to check for compatibility of the workflows using it.
   */
  var exports = function(name) {
    var _this = this;

    _this['name'] = name;
  };

  /**
   * Constructs a <code>ModelType</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ModelType} obj Optional instance to populate.
   * @return {module:model/ModelType} The populated <code>ModelType</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
    }
    return obj;
  }

  /**
   * The name of the type of the model, e.g., in order to be able to check for compatibility of the workflows using it.
   * @member {module:model/ModelType.NameEnum} name
   */
  exports.prototype['name'] = undefined;


  /**
   * Allowed values for the <code>name</code> property.
   * @enum {String}
   * @readonly
   */
  exports.NameEnum = {
    /**
     * value: "knime_workflow"
     * @const
     */
    "knime_workflow": "knime_workflow",
    /**
     * value: "knime_python"
     * @const
     */
    "knime_python": "knime_python",
    /**
     * value: "knime_random_forest"
     * @const
     */
    "knime_random_forest": "knime_random_forest",
    /**
     * value: "knime_table"
     * @const
     */
    "knime_table": "knime_table",
    /**
     * value: "pmml"
     * @const
     */
    "pmml": "pmml"  };


  return exports;
}));


