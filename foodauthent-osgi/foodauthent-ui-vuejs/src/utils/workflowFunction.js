var MyObject = function () {
  var ApiClient = require("../generated/rest-client/src/ApiClient.js");
  var apiClient = new ApiClient();
  //only for test---
  apiClient.basePath = "http://" + window.location.hostname + ":9090/v0/foodauthent";
  //only for test---
  var WorkflowApi = require("../generated/rest-client/src/api/WorkflowApi.js");
  var workflowApi = new WorkflowApi(apiClient);

  var getWorkflows = function (self) {
    console.log('Get Workflow');
    var callback = function (error, data, response) {
      console.log("data:", data);
      console.log("response:", response);
      if (error) {
        //this.response = data;
        console.error(error);
      } else {
        var jsonResult = data.results;
        var length = jsonResult.length;
        for (var i = 0; i < length; i++) {
          // console.log(jsonResult[i]);
          jsonResult[i]['actions'] = '';
          console.log(jsonResult[i]);
        }
        self.items = data.results;
        console.log("API called successfully. Returned data: ", data);
      }
    };
    var opt = {
      pageNumber: 0,
      pageSize: 100
    };
    workflowApi.findWorkflowByKeyword(
      opt,
      callback
    );
  };

  var getPredictions = function (self) {
    console.log('Get  Prediction');
    var callback = function (error, data, response) {
      console.log("data:", data);
      console.log("response:", response);
      if (error) {
        //this.response = data;
        console.error(error);
      } else {
        self.items = data.results;
        console.log("API called successfully. Returned data: ", data);
      }
    };
    var opt = {
      pageNumber: 0,
      pageSize: 100
    };
    workflowApi.findPredictionWorkflows(
      opt,
      callback
    );
  };

  var getPredictionJobs = function (self) {
    console.log('Get Prediction Job');
    var callback = function (error, data, response) {
      console.log("data:", data);
      console.log("response:", response);
      if (error) {
        //this.response = data;
        console.error(error);
      } else {
        self.items = data.results;
        console.log("API called successfully. Returned data: ", data);
      }
    };
    var opt = {
      pageNumber: 0,
      pageSize: 100
    };
    workflowApi.findPredictionJobs(
      opt,
      callback
    );
  };

  var getTrainingJobs = function (self) {
    console.log('Get Trainingjob');
    var callback = function (error, data, response) {
      console.log("data:", data);
      console.log("response:", response);
      if (error) {
        //this.response = data;
        console.error(error);
      } else {
        self.items = data.results;
        console.log("API called successfully. Returned data: ", data);
      }
    };
    var opt = {
      pageNumber: 0,
      pageSize: 100
    };
    workflowApi.findTrainingJobs(
      opt,
      callback
    );
  };


  var saveWorkflow = function (json, self) {
    console.log('Save Workflow');
    var callback = function (error, data, response) {
      console.log("data:", data);
      console.log("response:", response);
      if (error) {
        console.error(error);
        self.showError = true;
      } else {
        self.response = data.results;
        self.showSuccess = true;
        console.log("API called successfully. Returned data: ", data);
      }
    };
    var opt = {
      workflow: json
    };
    workflowApi.createWorkflow(
      opt,
      callback
    );
  };

  var savePredictionJob = function (json, self) {
    console.log('Save Prediction Job');
    var callback = function (error, data, response) {
      console.log("data:", data);
      console.log("response:", response);
      if (error) {
        console.error(error);
      } else {
        self.response = data.results;
        console.log("API called successfully. Returned data: ", data);
      }
    };
    //TO-DO set the right requested fields
    var opt = {
      product: json
    };
    workflowApi.createPredictionJob(
      opt,
      callback
    );
  };

  var saveTrainingJob = function (json, self) {
    console.log('Save Prediction Job');
    var callback = function (error, data, response) {
      console.log("data:", data);
      console.log("response:", response);
      if (error) {
        console.error(error);
      } else {
        self.response = data.results;
        console.log("API called successfully. Returned data: ", data);
      }
    };
    //TO-DO set the right requested fields
    var opt = {
      product: json
    };
    workflowApi.createTrainingJob(
      opt,
      callback
    );
  };

  var deleteWorkflow = function (id, self) {
    console.log('Delete Products');
    var callback = function (error, data, response) {
      console.log("data:", data);
      console.log("response:", response);
      if (error) {
        console.error(error);
        self.showError = true;
      } else {
        self.response = data.results;
        self.showSuccess = true;
        console.log("API called successfully. Returned data: ", data);
      }
    };
    var opt = {
      id: id
    };
    alert("When the Api will support thie features it will work and delete this id: " + id);
    // productApi.createProduct(
    //   opt,
    //   callback
    // );
  };


  return {
    getWorkflows: getWorkflows,
    getPredictions: getPredictions,
    getPredictionJobs: getPredictionJobs,
    getTrainingJobs: getTrainingJobs,
    savePredictionJob: savePredictionJob,
    saveTrainingJob: saveTrainingJob,
    saveWorkflow: saveWorkflow,
    deleteWorkflow: deleteWorkflow
  }
}();

export default MyObject;