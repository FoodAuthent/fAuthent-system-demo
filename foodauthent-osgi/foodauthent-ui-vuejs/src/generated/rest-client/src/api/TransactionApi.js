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
    define(['../ApiClient', '../model/DiscoveryServiceTransaction', '../model/TransactionPageResult'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/DiscoveryServiceTransaction'), require('../model/TransactionPageResult'));
  } else {
    // Browser globals (root is window)
    if (!root.FoodAuthentSwaggerApi) {
      root.FoodAuthentSwaggerApi = {};
    }
    root.FoodAuthentSwaggerApi.TransactionApi = factory(root.FoodAuthentSwaggerApi.ApiClient, root.FoodAuthentSwaggerApi.DiscoveryServiceTransaction, root.FoodAuthentSwaggerApi.TransactionPageResult);
  }
}(this, function(ApiClient, DiscoveryServiceTransaction, TransactionPageResult) {
  'use strict';

  /**
   * Transaction service.
   * @module api/TransactionApi
   * @version 1.0.0
   */

  /**
   * Constructs a new TransactionApi. 
   * @alias module:api/TransactionApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createTransaction operation.
     * @callback module:api/TransactionApi~createTransactionCallback
     * @param {String} error Error message, if any.
     * @param {String} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates/adds a new Transaction.
     * Creates/adds a new Transaction.
     * @param {Object} opts Optional parameters
     * @param {module:model/DiscoveryServiceTransaction} opts.discoveryServiceTransaction TODO
     * @param {module:api/TransactionApi~createTransactionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link String}
     */
    this.createTransaction = function(opts, callback) {
      opts = opts || {};
      var postBody = opts['discoveryServiceTransaction'];


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

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = String;

      return this.apiClient.callApi(
        '/discovery/transaction', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the findTransactionByKeyword operation.
     * @callback module:api/TransactionApi~findTransactionByKeywordCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TransactionPageResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds transaction by keywords or return all transactions.
     * Muliple keywords can be provided with comma separated strings, e.g, keyword1, keyword2.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.pageNumber the page number starting at 0
     * @param {Number} opts.pageSize entries per page, minimum 1
     * @param {Array.<String>} opts.keywords Keywords to search for
     * @param {module:api/TransactionApi~findTransactionByKeywordCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TransactionPageResult}
     */
    this.findTransactionByKeyword = function(opts, callback) {
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

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = TransactionPageResult;

      return this.apiClient.callApi(
        '/discovery/transaction', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getTransactionById operation.
     * @callback module:api/TransactionApi~getTransactionByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DiscoveryServiceTransaction} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get the Transaction an id.
     * @param {String} transactionId 
     * @param {module:api/TransactionApi~getTransactionByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DiscoveryServiceTransaction}
     */
    this.getTransactionById = function(transactionId, callback) {
      var postBody = null;

      // verify the required parameter 'transactionId' is set
      if (transactionId === undefined || transactionId === null) {
        throw new Error("Missing the required parameter 'transactionId' when calling getTransactionById");
      }


      var pathParams = {
        'transaction-id': transactionId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = DiscoveryServiceTransaction;

      return this.apiClient.callApi(
        '/discovery/transaction/{transaction-id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));