# food_authent_swagger_api

FoodAuthentSwaggerApi - JavaScript client for food_authent_swagger_api
This is the FoodAuthent API Description [www.foodauthent.net]
This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.JavascriptClientCodegen

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/),
please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install food_authent_swagger_api --save
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing 
into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

Finally, switch to the directory you want to use your food_authent_swagger_api from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

You should now be able to `require('food_authent_swagger_api')` in javascript files from the directory you ran the last 
command above from.

#### git
#
If the library is hosted at a git repository, e.g.
https://github.com/GIT_USER_ID/GIT_REPO_ID
then install it via:

```shell
    npm install GIT_USER_ID/GIT_REPO_ID --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file, that's to say your javascript file where you actually 
use this library):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var FoodAuthentSwaggerApi = require('food_authent_swagger_api');

var api = new FoodAuthentSwaggerApi.FileApi()

var fileMetadata = new FoodAuthentSwaggerApi.FileMetadata(); // {FileMetadata} The actual metadata object.


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.createFileMetadata(fileMetadata, callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/v0/foodauthent*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FoodAuthentSwaggerApi.FileApi* | [**createFileMetadata**](docs/FileApi.md#createFileMetadata) | **POST** /file | Creates a new file by posting the file metadata first.
*FoodAuthentSwaggerApi.FileApi* | [**getFileData**](docs/FileApi.md#getFileData) | **GET** /file/{file-id}/data | Let one download the actual file data.
*FoodAuthentSwaggerApi.FileApi* | [**getFileMetadata**](docs/FileApi.md#getFileMetadata) | **GET** /file/{file-id} | Returns the file metadata.
*FoodAuthentSwaggerApi.FileApi* | [**saveFileData**](docs/FileApi.md#saveFileData) | **PUT** /file/{file-id}/data | Uploads (and replaces) the actual file-data for the given file id
*FoodAuthentSwaggerApi.FingerprintApi* | [**createFingerprintSet**](docs/FingerprintApi.md#createFingerprintSet) | **POST** /fingerprintset | Create a new fingerprint set.
*FoodAuthentSwaggerApi.FingerprintApi* | [**findFingerprintSetByKeyword**](docs/FingerprintApi.md#findFingerprintSetByKeyword) | **GET** /fingerprintset | Finds fingerprint sets by some key words or return all fingerprint sets.
*FoodAuthentSwaggerApi.FingerprintApi* | [**getFingerprintSetById**](docs/FingerprintApi.md#getFingerprintSetById) | **GET** /fingerprintset/{fingerprintset-id} | Get the fingerprintset by id.
*FoodAuthentSwaggerApi.ModelApi* | [**createModel**](docs/ModelApi.md#createModel) | **POST** /model | Creates/adds a new model.
*FoodAuthentSwaggerApi.ModelApi* | [**findModelByKeyword**](docs/ModelApi.md#findModelByKeyword) | **GET** /model | Finds Models by some key words or return all Models.
*FoodAuthentSwaggerApi.ModelApi* | [**getModelById**](docs/ModelApi.md#getModelById) | **GET** /model/{model-id} | Get the model by id.
*FoodAuthentSwaggerApi.ProductApi* | [**createProduct**](docs/ProductApi.md#createProduct) | **POST** /product | Create a new product entity.
*FoodAuthentSwaggerApi.ProductApi* | [**findProductByGtin**](docs/ProductApi.md#findProductByGtin) | **GET** /product/findByGtin | Find product by gtin.
*FoodAuthentSwaggerApi.ProductApi* | [**findProductByKeyword**](docs/ProductApi.md#findProductByKeyword) | **GET** /product | Finds Products by some key words or return all Products.
*FoodAuthentSwaggerApi.SopApi* | [**createNewSOP**](docs/SopApi.md#createNewSOP) | **POST** /sop | Creates a new SOP.
*FoodAuthentSwaggerApi.SopApi* | [**findSOPByKeyword**](docs/SopApi.md#findSOPByKeyword) | **GET** /sop | Finds SOPs by some key words or return all sop&#39;s.
*FoodAuthentSwaggerApi.SopApi* | [**getSOPById**](docs/SopApi.md#getSOPById) | **GET** /sop/{sop-id} | Get the sop an id.
*FoodAuthentSwaggerApi.SopApi* | [**removeSOPById**](docs/SopApi.md#removeSOPById) | **DELETE** /sop/{sop-id} | Delete a sop specified by id.
*FoodAuthentSwaggerApi.WorkflowApi* | [**createPredictionJob**](docs/WorkflowApi.md#createPredictionJob) | **POST** /workflow/prediction/job | Starts a prediction for a fingerprint.
*FoodAuthentSwaggerApi.WorkflowApi* | [**createTrainingJob**](docs/WorkflowApi.md#createTrainingJob) | **POST** /workflow/training/job | Starts creating a model for a set of fingerprints.
*FoodAuthentSwaggerApi.WorkflowApi* | [**createWorkflow**](docs/WorkflowApi.md#createWorkflow) | **POST** /workflow | Creates/adds a new workflow.
*FoodAuthentSwaggerApi.WorkflowApi* | [**findModelByKeyword**](docs/WorkflowApi.md#findModelByKeyword) | **GET** /prediction | Finds Prediction by some key words or return all Predictions.
*FoodAuthentSwaggerApi.WorkflowApi* | [**findPredictionJobs**](docs/WorkflowApi.md#findPredictionJobs) | **GET** /workflow/prediction/job | Finds predictions jobs by some key words or return all predictions jobs suitable for prediction.
*FoodAuthentSwaggerApi.WorkflowApi* | [**findPredictionWorkflows**](docs/WorkflowApi.md#findPredictionWorkflows) | **GET** /workflow/prediction | Finds workflows by some key words or return all workflows suitable for prediction.
*FoodAuthentSwaggerApi.WorkflowApi* | [**findTrainingJobs**](docs/WorkflowApi.md#findTrainingJobs) | **GET** /workflow/training/job | Finds training jobs by some key words or return all training jobs.
*FoodAuthentSwaggerApi.WorkflowApi* | [**findTrainingWorkflows**](docs/WorkflowApi.md#findTrainingWorkflows) | **GET** /workflow/training | Finds workflows by some key words or return all workflows suitable for training models.
*FoodAuthentSwaggerApi.WorkflowApi* | [**findWorkflowByKeyword**](docs/WorkflowApi.md#findWorkflowByKeyword) | **GET** /workflow | Finds Workflow by some key words or return all Workflows.
*FoodAuthentSwaggerApi.WorkflowApi* | [**getPredictionJob**](docs/WorkflowApi.md#getPredictionJob) | **GET** /workflow/prediction/job/{job-id} | Lets one to ask for the status of a particular job.
*FoodAuthentSwaggerApi.WorkflowApi* | [**getPredictionResult**](docs/WorkflowApi.md#getPredictionResult) | **GET** /prediction/{prediction-id} | Get a specific prediction result.
*FoodAuthentSwaggerApi.WorkflowApi* | [**getTrainingJob**](docs/WorkflowApi.md#getTrainingJob) | **GET** /workflow/training/job/{job-id} | Lets one to ask for the status of a particular job.
*FoodAuthentSwaggerApi.WorkflowApi* | [**getWorkflowById**](docs/WorkflowApi.md#getWorkflowById) | **GET** /workflow/{workflow-id} | Get the workflow an id.


## Documentation for Models

 - [FoodAuthentSwaggerApi.FileMetadata](docs/FileMetadata.md)
 - [FoodAuthentSwaggerApi.Fingerprint](docs/Fingerprint.md)
 - [FoodAuthentSwaggerApi.FingerprintSet](docs/FingerprintSet.md)
 - [FoodAuthentSwaggerApi.FingerprintSetPageResult](docs/FingerprintSetPageResult.md)
 - [FoodAuthentSwaggerApi.Model](docs/Model.md)
 - [FoodAuthentSwaggerApi.ModelPageResult](docs/ModelPageResult.md)
 - [FoodAuthentSwaggerApi.Prediction](docs/Prediction.md)
 - [FoodAuthentSwaggerApi.PredictionJob](docs/PredictionJob.md)
 - [FoodAuthentSwaggerApi.PredictionJobPageResult](docs/PredictionJobPageResult.md)
 - [FoodAuthentSwaggerApi.PredictionPageResult](docs/PredictionPageResult.md)
 - [FoodAuthentSwaggerApi.PredictionWorkflowInput](docs/PredictionWorkflowInput.md)
 - [FoodAuthentSwaggerApi.PredictionWorkflowOutput](docs/PredictionWorkflowOutput.md)
 - [FoodAuthentSwaggerApi.Product](docs/Product.md)
 - [FoodAuthentSwaggerApi.ProductPageResult](docs/ProductPageResult.md)
 - [FoodAuthentSwaggerApi.SOP](docs/SOP.md)
 - [FoodAuthentSwaggerApi.SOPPageResult](docs/SOPPageResult.md)
 - [FoodAuthentSwaggerApi.Tag](docs/Tag.md)
 - [FoodAuthentSwaggerApi.TagPageResult](docs/TagPageResult.md)
 - [FoodAuthentSwaggerApi.TrainingJob](docs/TrainingJob.md)
 - [FoodAuthentSwaggerApi.TrainingJobPageResult](docs/TrainingJobPageResult.md)
 - [FoodAuthentSwaggerApi.TrainingWorkflowInput](docs/TrainingWorkflowInput.md)
 - [FoodAuthentSwaggerApi.TrainingWorkflowOutput](docs/TrainingWorkflowOutput.md)
 - [FoodAuthentSwaggerApi.Workflow](docs/Workflow.md)
 - [FoodAuthentSwaggerApi.WorkflowModule](docs/WorkflowModule.md)
 - [FoodAuthentSwaggerApi.WorkflowModuleInput](docs/WorkflowModuleInput.md)
 - [FoodAuthentSwaggerApi.WorkflowPageResult](docs/WorkflowPageResult.md)
 - [FoodAuthentSwaggerApi.WorkflowParameter](docs/WorkflowParameter.md)


## Documentation for Authorization

 All endpoints do not require authorization.
