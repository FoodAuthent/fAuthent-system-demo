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
    define(['../ApiClient', '../model/SOP', '../model/SOPPageResult'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/SOP'), require('../model/SOPPageResult'));
  } else {
    // Browser globals (root is window)
    if (!root.FoodAuthentSwaggerApi) {
      root.FoodAuthentSwaggerApi = {};
    }
    root.FoodAuthentSwaggerApi.SopApi = factory(root.FoodAuthentSwaggerApi.ApiClient, root.FoodAuthentSwaggerApi.SOP, root.FoodAuthentSwaggerApi.SOPPageResult);
  }
}(this, function(ApiClient, SOP, SOPPageResult) {
  'use strict';

  /**
   * Sop service.
   * @module api/SopApi
   * @version 1.0.0
   */

  /**
   * Constructs a new SopApi. 
   * @alias module:api/SopApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createNewSOP operation.
     * @callback module:api/SopApi~createNewSOPCallback
     * @param {String} error Error message, if any.
     * @param {String} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a new SOP.
     * @param {module:model/SOP} SOP TODO
     * @param {module:api/SopApi~createNewSOPCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link String}
     */
    this.createNewSOP = function(SOP, callback) {
      var postBody = SOP;

      // verify the required parameter 'SOP' is set
      if (SOP === undefined || SOP === null) {
        throw new Error("Missing the required parameter 'SOP' when calling createNewSOP");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['jwtAuth'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = String;

      return this.apiClient.callApi(
        '/sop', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the findSOPByKeyword operation.
     * @callback module:api/SopApi~findSOPByKeywordCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SOPPageResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds SOPs by some key words or return all sop&#39;s.
     * Muliple tags can be provided with comma separated strings. Use keyword1, keyword2, keyword3 for testing. If no keyword is specified, all entries will be considered.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.pageNumber the page number starting at 1
     * @param {Number} opts.pageSize entries per page, minimum 1
     * @param {Array.<String>} opts.keywords Keywords to search for
     * @param {module:api/SopApi~findSOPByKeywordCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SOPPageResult}
     */
    this.findSOPByKeyword = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'pageNumber': opts['pageNumber'],
        'pageSize': opts['pageSize'],
      };
      var collectionQueryParams = {
        'keywords': {
          value: opts['keywords'],
          collectionFormat: 'multi'
        },
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['jwtAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = SOPPageResult;

      return this.apiClient.callApi(
        '/sop', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getSOPById operation.
     * @callback module:api/SopApi~getSOPByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SOP} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the sop an id.
     * @param {String} sopId 
     * @param {module:api/SopApi~getSOPByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SOP}
     */
    this.getSOPById = function(sopId, callback) {
      var postBody = null;

      // verify the required parameter 'sopId' is set
      if (sopId === undefined || sopId === null) {
        throw new Error("Missing the required parameter 'sopId' when calling getSOPById");
      }


      var pathParams = {
        'sop-id': sopId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['jwtAuth'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = SOP;

      return this.apiClient.callApi(
        '/sop/{sop-id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the removeSOPById operation.
     * @callback module:api/SopApi~removeSOPByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete a sop specified by id.
     * @param {String} sopId 
     * @param {module:api/SopApi~removeSOPByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.removeSOPById = function(sopId, callback) {
      var postBody = null;

      // verify the required parameter 'sopId' is set
      if (sopId === undefined || sopId === null) {
        throw new Error("Missing the required parameter 'sopId' when calling removeSOPById");
      }


      var pathParams = {
        'sop-id': sopId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['jwtAuth'];
      var contentTypes = [];
      var accepts = [];
      var returnType = null;

      return this.apiClient.callApi(
        '/sop/{sop-id}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
