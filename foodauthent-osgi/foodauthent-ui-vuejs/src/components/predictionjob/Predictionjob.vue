<template>

<div class="page-container">
    <md-app>
        <md-app-toolbar class="md-primary">
            <span class="md-title">Prediction Job</span>
        </md-app-toolbar>
     <!--   <md-app-drawer md-permanent="full">
            <md-list v-for="route in this.$router.options.routes">
                <md-list-item>
                    <md-icon>label</md-icon>
                    <router-link :to="route.path" class="md-list-item-text">{{route.name}}</router-link>
                </md-list-item>
            </md-list>
        </md-app-drawer> -->

        <md-app-content>
            <b-card no-body>
                <b-tabs card>
                    <b-tab title="Results" active>
                        <predictionjobTable :items="items" :fields="fields" :schema.sync="schema" :currentPage="currentPage" :perPage.sync="perPage" :filter.sync="filter" :resultsCount="resultsCount" :selected="selected" :pageCount="pageCount" :loadTableData="loadTableData" :myPaginationHandler="myPaginationHandler"
                        :pageOptionsPerPage.sync="pageOptionsPerPage" :search="search" :myRowClickHandler="myRowClickHandler" :handleEditOk="handleEditOk" :itemsMetadata.sync="itemsMetadata" :pageType="pageType" :entity="entity"  :schemaIdHolder="schemaIdHolder">

                        </predictionjobTable>
                    </b-tab>
                    <b-tab title="Create new">
                    	<generalForm :schema="schema" :model="model" :schemas="schemas" :options="formOptions" :save="save" :cancel="cancel" :pageType="pageType" :schemaIdHolder="schemaIdHolder" :showSuccess="showSuccess" :response="response" :showError="showError" :loading="loading"></generalForm>
                    </b-tab>
                </b-tabs>
            </b-card>
        </md-app-content>
    </md-app>

</div>


</template>

<script>
import predictionjobTable from '@/components/predictionjob/PredictionjobTable';
import generalForm from '@/components/general/GeneralForm';
var getPredictionJobs = require("@/utils/workflowFunction.js").default.getPredictionJobs;
var findPredictionJobsByKeyword = require("@/utils/workflowFunction.js").default.findPredictionJobsByKeyword;
var findPredictionJobById = require("@/utils/workflowFunction.js").default.findPredictionJobById;
var savePredictionJob = require("@/utils/workflowFunction.js").default.savePredictionJob;
import jsonschema from "@/schema/prediction.json";
console.log(jsonschema.fields);


var schemas = [];

export default {
    data() {
        return {
            items: [],
            fields: jsonschema.fields,
            currentPage: 1,
            perPage: 10,
            filter: null,
            model: {},
            response: "",
            pageType: "noType",
            entity: "predictionJob",
            loading: false,
            schemas: schemas,
            itemsMetadata: {},
            resultsCount: 1,
            selected: {},
            schemaIdHolder: {
			    schemaID: "withOutSchema"
			},
            pageCount: 0,
            schema: jsonschema,
            pageOptionsPerPage: [5, 10, 25, 50, 100],
            formOptions: {
		        validateAfterLoad: true,
		        validateAfterChanged: true
		    }
        };
    },
    mounted() {
    if(this.$route.query.faid != null || typeof this.$route.query.faid !== 'undefined'){
    this.filter = this.$route.query.faid;
    }
        this.loadTableData();
    },
    methods: {
            search() {
                let self = this;
                //check if it is a valid UUID
                var re = new RegExp("^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$");
                if (re.test(self.filter)) {
                    findPredictionJobById(self);
                } else {
                    findPredictionJobsByKeyword(self);
                }
            },
            myPaginationHandler(page) {
                let self = this;
                self.currentPage = page;
                findPredictionJobsByKeyword(self);
                self.currentPage = 1;
            },
            loadTableData() {
                console.log("Load table data");
                let self = this;
                console.log("current page", self.currentPage);
                console.log("per page", self.perPage);
                findPredictionJobsByKeyword(self);
            },
            save() {
                let self = this;
                self.loading = true;
                console.log("POST BODY", JSON.stringify(this.model, undefined, 4));
                savePredictionJob(self.model["workflow-id"],self.model["fingerprintset-id"], self.model["model-id"],self);
                self.model = {}
            },
           cancel() {
                let self = this;
                self.model = {};
            },
            myRowClickHandler(record, index) {
		       console.log(record); // This will be the item data for the row
		       this.selected = record;
            },
            handleEditOk() {
                let self = this;
                console.log("This is the model", self.model);
            },
                myRowClickHandler(record, index) {
                this.selected = record;
            }
    },
    components: {
        predictionjobTable,
        generalForm
    }
}

</script>
