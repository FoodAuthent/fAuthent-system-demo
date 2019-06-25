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
    define(['../ApiClient', '../model/Organization', '../model/OrganizationBase', '../model/OrganizationCreateRequest'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Organization'), require('../model/OrganizationBase'), require('../model/OrganizationCreateRequest'));
  } else {
    // Browser globals (root is window)
    if (!root.FoodAuthentSwaggerApi) {
      root.FoodAuthentSwaggerApi = {};
    }
    root.FoodAuthentSwaggerApi.OrganizationApi = factory(root.FoodAuthentSwaggerApi.ApiClient, root.FoodAuthentSwaggerApi.Organization, root.FoodAuthentSwaggerApi.OrganizationBase, root.FoodAuthentSwaggerApi.OrganizationCreateRequest);
  }
}(this, function(ApiClient, Organization, OrganizationBase, OrganizationCreateRequest) {
  'use strict';

  /**
   * Organization service.
   * @module api/OrganizationApi
   * @version 1.0.0
   */

  /**
   * Constructs a new OrganizationApi. 
   * @alias module:api/OrganizationApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the createOrganization operation.
     * @callback module:api/OrganizationApi~createOrganizationCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Organization} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * create new organization.
     * TODO
     * @param {module:model/OrganizationCreateRequest} organizationCreateRequest TODO
     * @param {module:api/OrganizationApi~createOrganizationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Organization}
     */
    this.createOrganization = function(organizationCreateRequest, callback) {
      var postBody = organizationCreateRequest;

      // verify the required parameter 'organizationCreateRequest' is set
      if (organizationCreateRequest === undefined || organizationCreateRequest === null) {
        throw new Error("Missing the required parameter 'organizationCreateRequest' when calling createOrganization");
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
      var accepts = ['application/json', 'text/plain'];
      var returnType = 'Organization';

      return this.apiClient.callApi(
        '/organization', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteOrganization operation.
     * @callback module:api/OrganizationApi~deleteOrganizationCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * delete existing organization.
     * TODO
     * @param {String} dn The organization&#39;s LDAP dn
     * @param {module:api/OrganizationApi~deleteOrganizationCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deleteOrganization = function(dn, callback) {
      var postBody = null;

      // verify the required parameter 'dn' is set
      if (dn === undefined || dn === null) {
        throw new Error("Missing the required parameter 'dn' when calling deleteOrganization");
      }


      var pathParams = {
        'dn': dn
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
      var accepts = ['text/plain'];
      var returnType = null;

      return this.apiClient.callApi(
        '/organization/{dn}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getOrganization operation.
     * @callback module:api/OrganizationApi~getOrganizationCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Organization} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * get existing organization.
     * TODO
     * @param {String} dn The organization&#39;s LDAP dn
     * @param {module:api/OrganizationApi~getOrganizationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Organization}
     */
    this.getOrganization = function(dn, callback) {
      var postBody = null;

      // verify the required parameter 'dn' is set
      if (dn === undefined || dn === null) {
        throw new Error("Missing the required parameter 'dn' when calling getOrganization");
      }


      var pathParams = {
        'dn': dn
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
      var accepts = ['application/json', 'text/plain'];
      var returnType = 'Organization';

      return this.apiClient.callApi(
        '/organization/{dn}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updateOrganization operation.
     * @callback module:api/OrganizationApi~updateOrganizationCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Organization} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * update existing organization.
     * TODO
     * @param {String} dn The organization&#39;s LDAP dn
     * @param {module:model/OrganizationBase} organizationBase TODO
     * @param {module:api/OrganizationApi~updateOrganizationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Organization}
     */
    this.updateOrganization = function(dn, organizationBase, callback) {
      var postBody = organizationBase;

      // verify the required parameter 'dn' is set
      if (dn === undefined || dn === null) {
        throw new Error("Missing the required parameter 'dn' when calling updateOrganization");
      }

      // verify the required parameter 'organizationBase' is set
      if (organizationBase === undefined || organizationBase === null) {
        throw new Error("Missing the required parameter 'organizationBase' when calling updateOrganization");
      }


      var pathParams = {
        'dn': dn
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
      var accepts = ['application/json', 'text/plain'];
      var returnType = 'Organization';

      return this.apiClient.callApi(
        '/organization/{dn}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
