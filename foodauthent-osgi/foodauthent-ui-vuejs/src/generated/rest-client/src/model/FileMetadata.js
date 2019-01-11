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
    root.FoodAuthentSwaggerApi.FileMetadata = factory(root.FoodAuthentSwaggerApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The FileMetadata model module.
   * @module model/FileMetadata
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>FileMetadata</code>.
   * Metadata of a file in the FoodAuthent-system.
   * @alias module:model/FileMetadata
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>FileMetadata</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FileMetadata} obj Optional instance to populate.
   * @return {module:model/FileMetadata} The populated <code>FileMetadata</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('fa-id')) {
        obj['fa-id'] = ApiClient.convertToType(data['fa-id'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('uploadName')) {
        obj['uploadName'] = ApiClient.convertToType(data['uploadName'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('author')) {
        obj['author'] = ApiClient.convertToType(data['author'], 'String');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'Date');
      }
      if (data.hasOwnProperty('uploadDate')) {
        obj['uploadDate'] = ApiClient.convertToType(data['uploadDate'], 'Date');
      }
      if (data.hasOwnProperty('version')) {
        obj['version'] = ApiClient.convertToType(data['version'], 'Number');
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
   * The file type.
   * @member {module:model/FileMetadata.TypeEnum} type
   */
  exports.prototype['type'] = undefined;
  /**
   * A name for the file.
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * The name of the file as uploaded. Will be set automatically if left empty and a file is uploaded for the first time.
   * @member {String} uploadName
   */
  exports.prototype['uploadName'] = undefined;
  /**
   * A more verbose description of the file.
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * The authors name (TODO - could reference a user in the future).
   * @member {String} author
   */
  exports.prototype['author'] = undefined;
  /**
   * The creation date.
   * @member {Date} date
   */
  exports.prototype['date'] = undefined;
  /**
   * Time and date of the file upload. Will be set automatically.
   * @member {Date} uploadDate
   */
  exports.prototype['uploadDate'] = undefined;
  /**
   * The file's version.
   * @member {Number} version
   */
  exports.prototype['version'] = undefined;


  /**
   * Allowed values for the <code>type</code> property.
   * @enum {String}
   * @readonly
   */
  exports.TypeEnum = {
    /**
     * value: "knime_workflow"
     * @const
     */
    "knime_workflow": "knime_workflow",
    /**
     * value: "knime_model"
     * @const
     */
    "knime_model": "knime_model",
    /**
     * value: "python_script"
     * @const
     */
    "python_script": "python_script",
    /**
     * value: "sop_pdf"
     * @const
     */
    "sop_pdf": "sop_pdf",
    /**
     * value: "fingerprints_bruker"
     * @const
     */
    "fingerprints_bruker": "fingerprints_bruker"  };


  return exports;
}));


