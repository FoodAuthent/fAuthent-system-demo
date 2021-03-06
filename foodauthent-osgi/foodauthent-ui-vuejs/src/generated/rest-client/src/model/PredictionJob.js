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
    root.FoodAuthentSwaggerApi.PredictionJob = factory(root.FoodAuthentSwaggerApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The PredictionJob model module.
   * @module model/PredictionJob
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>PredictionJob</code>.
   * Represents prediction job.
   * @alias module:model/PredictionJob
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>PredictionJob</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PredictionJob} obj Optional instance to populate.
   * @return {module:model/PredictionJob} The populated <code>PredictionJob</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('fa-id')) {
        obj['fa-id'] = ApiClient.convertToType(data['fa-id'], 'String');
      }
      if (data.hasOwnProperty('prediction-id')) {
        obj['prediction-id'] = ApiClient.convertToType(data['prediction-id'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('status-message')) {
        obj['status-message'] = ApiClient.convertToType(data['status-message'], 'String');
      }
      if (data.hasOwnProperty('workflow-file-id')) {
        obj['workflow-file-id'] = ApiClient.convertToType(data['workflow-file-id'], 'String');
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
   * The id of the prediction result if the job has completed successfully.
   * @member {String} prediction-id
   */
  exports.prototype['prediction-id'] = undefined;
  /**
   * The current status of the prediction job.
   * @member {module:model/PredictionJob.StatusEnum} status
   */
  exports.prototype['status'] = undefined;
  /**
   * A message, e.g., in case the workflow failed.
   * @member {String} status-message
   */
  exports.prototype['status-message'] = undefined;
  /**
   * File id of the executed artifact (e.g. a workflow) if there is any.
   * @member {String} workflow-file-id
   */
  exports.prototype['workflow-file-id'] = undefined;


  /**
   * Allowed values for the <code>status</code> property.
   * @enum {String}
   * @readonly
   */
  exports.StatusEnum = {
    /**
     * value: "running"
     * @const
     */
    "running": "running",
    /**
     * value: "success"
     * @const
     */
    "success": "success",
    /**
     * value: "failed"
     * @const
     */
    "failed": "failed"  };


  return exports;
}));


