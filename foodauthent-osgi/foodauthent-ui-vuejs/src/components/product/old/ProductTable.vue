<template>

<div id="productTable">
    <b-container fluid>
        <!-- UPDATE -->
        <b-row>
            <b-col>
                <b-btn id="refreshTable" variant="primary" size="sm" @click="loadTableData">
                    <md-icon>autorenew</md-icon>
                </b-btn>
            </b-col>
            <!-- PER PAGE -->
            <b-col class="my-1">
                <b-form-group horizontal label="PER PAGE" class="mb-0">
                    <b-form-select @change="perPagehandler($event)" :options="pageOptionsPerPage" v-model="perPage" />
                </b-form-group>
            </b-col>

            <!-- SEARCH -->
            <b-col class="my-1 col-sm-6">
                <b-form-group horizontal label="SEARCH" class="mb-50">
                    <b-input-group>
                        <b-form-input v-model="filter" placeholder="Search for gtin or keywords" />
                        <b-input-group-append>
                            <b-btn :disabled="!filter" variant="primary" @click="search">Search</b-btn>
                            <b-btn :disabled="!filter" @click="clearSearch">Clear</b-btn>
                        </b-input-group-append>
                    </b-input-group>
                </b-form-group>
            </b-col>
        </b-row>
    </b-container>

    <!-- TABLE -->
    <b-table bordered striped hover responsive show-empty :sort-by.sync="sortBy" :sort-desc.sync="sortDesc" :items="items" :fields="fields" :current-page="currentPage" :per-page="perPage" @row-clicked="myRowClickHandler">
        <template slot="actions" slot-scope="row">
            <div class="widewidth">
                <b-btn size="sm" v-b-modal.modalEdit @click.stop="info(row.item, row.index, $event.target)">
                    <md-icon>edit</md-icon>
                </b-btn>
                <b-btn size="sm" v-b-modal.modalMeta @click.stop="showMetadata(row.item, row.index, $event.target)">
                    <md-icon>search</md-icon>
                </b-btn>
                <b-btn size="sm" v-b-modal.modalDelete>
                    <md-icon>delete_forever</md-icon>
                </b-btn>
            </div>
        </template>
    </b-table>


    <!-- PAGINATION -->
    <b-pagination v-on:input="myPaginationHandler(currentPage)" :total-rows="resultsCount" :per-page="perPage" v-model="currentPage" />

    <!-- MODAL EDIT -->
    <b-modal id="modalEdit" title="Edit" @ok="handleEditOk">
        <vue-form-generator :schema="schema" :model="model" :options="formOptions"> </vue-form-generator>
    </b-modal>

    <!-- MODAL METADATA -->
    <b-modal id="modalMeta" size="lg" title="Metadata" @ok="handleMetadataOk">
        <div class="panel panel-default">
            <div class="panel-heading">Metadata</div>
            <div class="panel-body">
                <pre v-if="model" v-html="JSON.stringify(itemsMetadata, undefined, 4)"></pre>
            </div>
        </div>
    </b-modal>

    <!-- MODAL Delete -->
    <b-modal id="modalDelete" title="Delete" @ok="handleDeleteOk">
        <p>Are you sure do you want to delete this record?</p>
        <pre v-if="selected" v-html="JSON.stringify(selected, undefined, 4)"></pre>
    </b-modal>

</div>

</template>

<script>

var getProducts = require("@/utils/productFunction.js").default.getProducts;
var deleteProducts = require("@/utils/productFunction.js").default.deleteProducts;
var updateProducts = require("@/utils/productFunction.js").default.updateProducts;
var findProductByGtin = require("@/utils/productFunction.js").default.findProductByGtin;

import productForm from "@/components/product/ProductForm";
import product from "@/components/product/Product";
import jsonschema from "@/generated/schema/product.json";
var getModelSchemas = require("@/utils/commonFunction.js").default.getModelSchemas;
var getCustomMetadata = require("@/utils/commonFunction.js").default.getCustomMetadata;
var schemaIdHolder = {
    "schemaID": "withOutSchema"
};
export default {
    name: "Product",
    data() {
        return {
            model: {},
            schema: jsonschema,
            formOptions: {
                validateAfterLoad: true,
                validateAfterChanged: true
            },
            items: [],
            itemsMetadata: {},
            selected: {},
            fields: [],
            currentPage: 1,
            resultsCount: 1,
            perPage: 10,
            sortBy: "brand",
            shownItems: null,
            sortDesc: false,
            filter: null,
            pageOptionsPerPage: [5, 10, 25, 50, 100]
        };
    },
    mounted() {
        this.loadTableData();
        getModelSchemas("product", {}, schemaIdHolder);
    },
    computed: {
        sortOptions() {
            //Create an options list from our fields
            return this.fields.filter(f => f.sortable).map(f => {
                return {
                    text: f.label,
                    value: f.key
                };
            });
        }
    },
    methods: {
        loadTableData() {
                let self = this;
                getProducts(self);
            },
            search() {
                const regex = /\b\d{8}(?:\d{4,6})?\b/;
                let self = this;
                var str = self.filter;
                let m;
                if ((m = regex.exec(str)) !== null) {
                    findProductByGtin(self);
                } else {
                    getProducts(self);
                }
            },
            clearSearch() {
                this.filter = null;
                document.getElementById("refreshTable").click();
            },
            //Manage when the number of items displayed on the table change
            perPagehandler(newObjectState) {
                let self = this;
                self.currentPage = 0; //just a workaround to go back in page 1
                self.perPage = newObjectState;
                document.getElementById("refreshTable").click();
                // self.loadTableData();
            },
            //Manage the pagination, when a page number is pressed this call the API to get the results for the new page
            myPaginationHandler(page) {
                let self = this;
                self.currentPage = page;
                getProducts(self);
                self.currentPage = 1;
            },
            //Manage the ok button to confirm the edit action
            handleEditOk() {
                let self = this;
                //console.log("selected", this.selected);
                // productForm.methods.editRecord(JSON.stringify(this.selected, undefined, 4));
                console.log("This is the model", this.model);
                //updateProducts(JSON.stringify(this.model, undefined, 4), self);
                updateProducts(this.model, self);
                //product.data.tabIndex = 1;
            },
            //Manage the ok button to confirm the delete action
            handleDeleteOk() {
                let self = this;
                console.log("gtin:", this.selected["gtin"]);
                deleteProducts(this.selected["gtin"], self);
            },
            //Manage the ok button to confirm the Metadata action
            handleMetadataOk() {
             let self = this;
             self.itemsMetadata = {};
            },
            myRowClickHandler(record, index) {
                // 'record' will be the row data from items
                // `index` will be the visible row number (available in the v-model 'shownItems')
                //console.log(record); // This will be the item data for the row
                this.selected = record;
            },
            info(item, index, button) {
                this.model = item;
                this.$root.$emit('bv::show::modal', 'modalEdit', button);
            },
            showMetadata(item, index, button) {
                let self = this;
                getCustomMetadata("product", schemaIdHolder.schemaID, item["fa-id"], self);
                console.log("The metadata items are:", self.itemsMetadata);
            },
            // onFiltered(filteredItems) {
            // Trigger pagination to update the number of buttons/pages due to filtering
            //this.totalRows = filteredItems.length;
            // this.currentPage = 1;
            // }
    }
};

</script>
<style lang="scss" scoped>

.md-table + .md-table {
    margin-top: 16px;
}

.md-app {
    /*max-height: px; */
    border: 1px solid rgba(#000, 0.12);
}

.md-drawer {
    max-width: 250px;
}

</style>
