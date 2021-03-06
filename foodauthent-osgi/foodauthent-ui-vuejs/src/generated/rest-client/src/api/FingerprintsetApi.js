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
    define(['../ApiClient', '../model/FingerprintSet', '../model/FingerprintSetPageResult'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/FingerprintSet'), require('../model/FingerprintSetPageResult'));
  } else {
    // Browser globals (root is window)
    if (!root.FoodAuthentSwaggerApi) {
      root.FoodAuthentSwaggerApi = {};
    }
    root.FoodAuthentSwaggerApi.FingerprintsetApi = factory(root.FoodAuthentSwaggerApi.ApiClient, root.FoodAuthentSwaggerApi.FingerprintSet, root.FoodAuthentSwaggerApi.FingerprintSetPageResult);
  }
}(this, function(ApiClient, FingerprintSet, FingerprintSetPageResult) {
  'use strict';

  /**
   * Fingerprintset service.
   * @module api/FingerprintsetApi
   * @version 1.0.0
   */

  /**
   * Constructs a new FingerprintsetApi. 
   * @alias module:api/FingerprintsetApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createFingerprintSet operation.
     * @callback module:api/FingerprintsetApi~createFingerprintSetCallback
     * @param {String} error Error message, if any.
     * @param {String} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a new fingerprint set.
     * @param {module:model/FingerprintSet} fingerprintSet A fingerprint set containing fingerprint metadata.
     * @param {module:api/FingerprintsetApi~createFingerprintSetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link String}
     */
    this.createFingerprintSet = function(fingerprintSet, callback) {
      var postBody = fingerprintSet;

      // verify the required parameter 'fingerprintSet' is set
      if (fingerprintSet === undefined || fingerprintSet === null) {
        throw new Error("Missing the required parameter 'fingerprintSet' when calling createFingerprintSet");
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
        '/fingerprintset', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the findFingerprintSetByKeyword operation.
     * @callback module:api/FingerprintsetApi~findFingerprintSetByKeywordCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FingerprintSetPageResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds fingerprint sets by some key words or return all fingerprint sets.
     * Muliple keywords can be provided with comma separated strings,e.g. use keyword1, keyword2, keyword3.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.pageNumber the page number starting at 1
     * @param {Number} opts.pageSize entries per page, minimum 1
     * @param {Array.<String>} opts.keywords Keywords to search for
     * @param {module:api/FingerprintsetApi~findFingerprintSetByKeywordCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FingerprintSetPageResult}
     */
    this.findFingerprintSetByKeyword = function(opts, callback) {
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
      var returnType = FingerprintSetPageResult;

      return this.apiClient.callApi(
        '/fingerprintset', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getFingerprintSetById operation.
     * @callback module:api/FingerprintsetApi~getFingerprintSetByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FingerprintSet} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the fingerprintset by id.
     * @param {String} fingerprintsetId 
     * @param {module:api/FingerprintsetApi~getFingerprintSetByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FingerprintSet}
     */
    this.getFingerprintSetById = function(fingerprintsetId, callback) {
      var postBody = null;

      // verify the required parameter 'fingerprintsetId' is set
      if (fingerprintsetId === undefined || fingerprintsetId === null) {
        throw new Error("Missing the required parameter 'fingerprintsetId' when calling getFingerprintSetById");
      }


      var pathParams = {
        'fingerprintset-id': fingerprintsetId
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
      var returnType = FingerprintSet;

      return this.apiClient.callApi(
        '/fingerprintset/{fingerprintset-id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
