var modelApi;
function setUpApi(){
	  var ApiClient = require("../generated/rest-client/src/ApiClient.js");
	  var apiClient = new ApiClient();
	  
	  if(localStorage.getItem('token')){
		  console.log("Inside the token set");
		  var headerToken = {Authorization: 'Bearer ' + localStorage.getItem('token')};
		  apiClient.defaultHeaders = headerToken;  
	  }
	  //only for test---
	  apiClient.basePath = window.location.origin + "/v0/foodauthent";
	  //only for test---
	  var ModelApi = require("../generated/rest-client/src/api/ModelApi.js");
	  modelApi = new ModelApi(apiClient);
}

var MyObject = function () {
   
  var getModels = function (self) {
	  setUpApi();
	    console.log('Get Models');
	    var filterArray = null;
	    if(self.filter !== null){
//	    var filterArray = self.filter.replace(/^\s+|\s+$/g,"").split(/\s*,\s*/);	
	    var filterArray = self.filter.split(" ");
	    }
	    var callback = function (error, data, response) {
	      console.log("data:", data);
	      console.log("response:", response);
	      if(data !== undefined && data !== null){
	    	  self.resultsCount = data.resultCount; 
	      }else{
	    	  self.resultsCount = 0;
	      }
	      if(response.body !== null){
	    	  self.pageCount = response.body.pageCount; 
	      }else{
	    	  self.pageCount = 0;
	      }
	      if (error) {
	        //this.response = data;
	        console.error(error);
	      } else {
	        var jsonResult = data.results;
	        var length = jsonResult.length;
	        for (var i = 0; i < length; i++) {
	          // console.log(jsonResult[i]);
	          jsonResult[i]['actions'] = '';
	        }
	        self.items = data.results;
	        console.log("API called successfully. Returned data: ", data);
	      }
	    };
	    var opt = {
	      pageNumber: self.currentPage,
	      pageSize: self.perPage,
	      keywords: filterArray
	    };
	    modelApi.findModelByKeyword(
	      opt,
	      callback
	    );
	  };
	  

  
  var saveModel = function (json, self) {
	  setUpApi();
    console.log('Save Model');
    //just a workaround, the backend wait for a list of UUID string, not object
    var idsFingerprintset =[];  
    var tempArrayFingerprint = json["fingerprintset-ids"];
    for (var key in tempArrayFingerprint) {
        if (tempArrayFingerprint.hasOwnProperty(key)) {           
            idsFingerprintset.push(tempArrayFingerprint[key]["fingerprintset-id"]);
        }
    }
    json["fingerprintset-ids"] = idsFingerprintset;
    	
    var idsObjectEvent =[];  
    var tempArrayObjecEvent = json["objectevent-ids"];
    for (var key in tempArrayObjecEvent) {
        if (tempArrayObjecEvent.hasOwnProperty(key)) {           
            //console.log(key, tempArrayObjecEvent[key]["objectevent-id"]);
        	idsObjectEvent.push(tempArrayObjecEvent[key]["objectevent-id"]);
        }
    }
    json["objectevent-ids"] = idsObjectEvent;
    var callback = function (error, data, response) {
      console.log("data:", data);
      console.log("response:", response);
      if (error) {
        console.error(error);
        self.response = response.error.message;
        self.showError = true;
        self.loading = false;
      } else {
        self.response = data.results;
        self.showSuccess = 5;
        self.loading = false;
        console.log("API called successfully. Returned data: ", data);
      }
    };
    var opt = {
      model: json
    };
    modelApi.createModel(
      opt,
      callback
    );
  };

    var deleteModel = function (id, self) {
  	  setUpApi();
    console.log('Delete model');
    var callback = function (error, data, response) {
      console.log("data:", data);
      console.log("response:", response);
      if (error) {
        console.error(error);
        self.showError = true;
      } else {
        self.response = data.results;
        self.showSuccess = 5;
        console.log("API called successfully. Returned data: ", data);
      }
    };
    var opt = {
      id: id
    };
    alert("When the Api will support thie features it will work and delete this id: "+id);
    // productApi.createProduct(
    //   opt,
    //   callback
    // );
  };
  
  
	  
	  var findModelById = function (self) {
		  setUpApi();
		    console.log('Search Model for Id: ',self.filter);
		    var callback = function (error, data, response) {
		      console.log("data:", data);
		      console.log("response:", response);
		      if(data !== undefined && data !== null){
		    	  self.resultsCount = data.resultCount; 
		      }else{
		    	  self.resultsCount = 0;
		      }
		      if(response.body !== null){
		    	  self.pageCount = response.body.pageCount; 
		      }else{
		    	  self.pageCount = 0;
		      }
		      if (error) {
		        //this.response = data;
		        console.error(error);
		      } else {
		        var jsonResult = [];
		        jsonResult.push(response.body);
		        jsonResult[0]['actions'] = '';
		        self.items = jsonResult;
		        console.log("API called successfully. Returned data: ", data);
		      }
		    };
		    var modelId = self.filter;
		    modelApi.getModelById(
		      modelId,
		      callback
		    );
		  };
  
  var updateModel = function (json, self) {
	  setUpApi();
	    console.log('Update Model');
	    var callback = function (error, data, response) {
	      console.log("data:", data);
	      console.log("response:", response);
	      if (error) {
	        console.error(error);
	        self.showError = true;
	      } else {
	        self.response = data;
	        self.showSuccess = 5;
	        console.log("API called successfully. Returned data: ", data);
	      }
	    };
	    var opt = {
	      model: json
	    };
	    console.log("json:", json);
	    modelApi.updatedModel(
	       opt,
	       callback
	     );
	  };


  return {
    getModels: getModels,
    saveModel: saveModel,
    deleteModel: deleteModel,
    updateModel: updateModel,
    findModelById: findModelById
  }
}();

export default MyObject;