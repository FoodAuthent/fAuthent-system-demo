<template>

<div id="sampleTable">
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
                        <!--<b-form-input v-model="filter" placeholder="Type to Search for id or keyword" />-->
                        <b-form-input v-model="filterVal" @change="onSearch" placeholder="Type to Search for id or keyword" />
                        <b-input-group-append>
                            <b-btn :disabled="!filterVal" variant="primary" @click="search">Search</b-btn>
                            <b-btn :disabled="!filterVal" @click="clearSearch">Clear</b-btn>
                        </b-input-group-append>
                    </b-input-group>
                </b-form-group>
            </b-col>
        </b-row>
        <b-row>
            <!-- TABLE -->
            <b-table ref="table" bordered striped hover show-empty responsive :items="items" :fields="fields" :current-page="currentPage" :per-page="perPage" @row-clicked="myRowClickHandler">
									 

				<!-- THE IDs ARE LINKS -->
	 			<template v-for="(field, index) in fields" :slot="field.model" slot-scope="data">
			      <div v-if="checkLinkField(field.model)">
					      <div v-if="checkArray(data.value)">
							      <ul id="listOfIds">
									  <li v-for="(id, index) in data.value">
									   <router-link :to="{ path: field.model.replace('-id',''), query: { faid: id  } }">{{ id }}</router-link>
									  </li>
								</ul>
					      </div>
					       <div v-else>
					        	<router-link :to="{ path: field.model.replace('-id',''), query: { faid: data.value  } }">{{ data.value }}</router-link>
					      </div>
			      </div>
			       <div v-else>
			       		{{data.value}}
			       </div>
			    </template>
			    
					    
				<!-- ACTIONS edit-delete-info -->
                <template slot="actions" slot-scope="row" v-slot:actions>
                    <div class="widewidth">
 
					  <b-dropdown v-if="hasRelation" id="relations" text="Relations" class="m-2">
					    <b-dropdown-item-button v-b-modal.relationModal v-for="item in relationItems" @click="getRelations(item, row.item, row.index, $event.target)">{{item}}</b-dropdown-item-button>
					  </b-dropdown>
  
                     <b-btn v-if="hasEdit" size="sm" v-b-modal.modalEdit @click.stop="info(row.item, row.index, $event.target)">
                            <md-icon>edit</md-icon>
                        </b-btn> 
                        <b-btn v-if="hasMetadata" size="sm" v-b-modal.modalMeta @click.stop="showMetadata(row.item, row.index, $event.target)">
                            <md-icon>search</md-icon>
                        </b-btn>
                        <b-btn size="sm" v-b-modal.modalDelete @click.stop="showDelete(row.item, row.index, $event.target)">
                            <md-icon>delete_forever</md-icon>
                        </b-btn>
                    </div>
                </template> 

                
            </b-table>
        </b-row>
    </b-container>
    
    <!-- PAGINATION -->
    <b-pagination v-on:input="myPaginationHandler(currentPage)" :total-rows="resultsCount" :per-page.sync="perPage" v-model="currentPage" />

    <!-- MODAL EDIT -->
    <b-modal id="modalEdit" title="edit" @ok="handleEditOk(model)">
        <vue-form-generator :schema="schema" :model="model" :options="formOptions"> </vue-form-generator>
       <!-- <pre v-html="JSON.stringify(model, undefined, 4)"></pre> -->
    </b-modal>
    
        <!-- MODAL METADATA -->
    <b-modal id="modalMeta" size="lg" title="Metadata" @ok="handleMetadataOk">
        <div class="panel panel-default">
            <div class="panel-heading">Metadata</div>
            <div class="panel-body">
                <pre v-html="JSON.stringify(itemsMetadata, undefined, 4)"></pre>
            </div>
        </div>
    </b-modal>

    <!-- MODAL Delete -->
    <b-modal id="modalDelete" title="Delete" @ok="handleDeleteOk">
        <p>Are you sure do you want to delete this record?</p>
        <pre v-if="selected" v-html="JSON.stringify(itemsDelete, undefined, 4)"></pre>
    </b-modal>
    
    <!-- MODAL relation -->
	<b-modal id="relationModal" scrollable size="xl" title="RELATIONS">
	    <div v-if='relationResult'>
	        <table aria-busy="false" aria-colcount="5" class="table b-table table-striped table-hover table-bordered" id="modalTableRelations">
	            <thead role="rowgroup" class="">
	                <tr role="row">
	                    <th v-for="(item, key) in relationResult[0]" role="columnheader" scope="col" aria-colindex="1" class="">{{key}}</th>
	                </tr>
	            </thead>
	            <tbody role="rowgroup" class="">
	                <tr v-for="(item, key) in relationResult[0]" aria-rowindex="1" role="row" class="">
	                    <td v-for="(item, key) in relationResult[0]" role="cell" aria-colindex="1" class="">
	                        <div v-if="checkLinkFieldForRelation(key)">
	                            <div v-if="key=='fa-id'">
	                                <router-link :to="{ path: pathRelation, query: { faid: item  } }">{{ item }}</router-link>
	                            </div>
	                            <div v-else>
	                            <router-link :to="{ path: key.replace('-id',''), query: { faid: item  } }">{{ item }}</router-link>
	                            </div>
	                        </div>
	                        <div v-else>
	                            {{item}}
	                        </div>
	                    </td>
	                </tr>
	            </tbody>
	        </table>
	    </div>
	</b-modal>

</div>

</template>

<script>
var schemaIdHolder = {
    "schemaID": "withOutSchema"
};

var getModelSchemas = require("@/utils/commonFunction.js").default.getModelSchemas;
var getCustomMetadata = require("@/utils/commonFunction.js").default.getCustomMetadata;
var getLinkInfo = require("@/utils/commonFunction.js").default.getLinkInfo;
var deleteEntity = require("@/utils/commonFunction.js").default.deleteEntity;
var getEntities = require("@/utils/relationFunction.js").default.getEntities;
var getForeignKeyEntities = require("@/utils/relationFunction.js").default.getForeignKeyEntities;
export default {
    props: {
        items: Array,
        fields: Array,
        currentPage: Number,
        perPage: Number,
        filter: Array,
        resultsCount: Number,
        selected: Object,
        pageCount: Number,
        itemsMetadata: Object,
        schema: Object,
        model: Object,
        pageType: String,
        entity: String,
        hasEdit: Boolean,
        schemaIdHolder: Object,
        pageOptionsPerPage: Array,
        search: {
            type: Function,
            required: true
        },
        myPaginationHandler: {
            type: Function,
            required: true
        },
        myRowClickHandler: {
            type: Function,
            required: true
        },
        handleEditOk: {
            type: Function,
            required: true
            },
        loadTableData: {
            type: Function,
            required: false
        }
    },
    data() {
        return {
            filterVal: '',
            itemsDelete: null,
            itemLink: null,
            relationResult: null,
            hasMetadata: false,
            hasEdit: false,
            hasRelation: false,
            entities: null,
            pathRelation: '',
            relationItems: []
               }
    },
    mounted() {
        this.onProp(this.filter);
        this.$watch('filter', this.onProp);
        if(this.pageType != 'noType'){
        this.hasMetadata = true;
        getModelSchemas(this.pageType, {}, this.schemaIdHolder);
        }
        getEntities(this);
    },
    methods: {
        onProp(filter) {
                this.filterVal = filter;
            },
            onSearch() {
                this.$emit('update:filter', this.filterVal)
            },
            clearSearch() {
                this.$emit('update:filter', null);
                this.$emit('update:filterVal', null)
                document.getElementById("refreshTable").click();
            },
            perPagehandler(newObjectState) {
                let self = this;
                self.currentPage = 1; //just a workaround to go back in page 1
                self.perPage = newObjectState;
                self.$emit('update:perPage', newObjectState);
                document.getElementById("refreshTable").click();
            },
            info(item, index, button) {
                this.model = item;
                this.$root.$emit('bv::show::modal', 'modalEdit', button);
            },
            getRelations(type, item, index, button){
            let self = this;
            this.pathRelation = type;
            getForeignKeyEntities(self.entity, type, item["fa-id"], self);
            },
            linkFunction(faId,infoType){
            let self = this;
            console.log("faId: ", faId);
            console.log("infoType: ", infoType);
			getLinkInfo(faId,infoType,self );
			document.body.classList.remove("modal-open");
            },
            checkLinkField(model){
            if(model !== undefined && model !== null && model != 'fa-id'){
             return model.includes("-id") || model.includes("-ids");
             }else{
             return false;
             }
            },
           checkLinkFieldForRelation(model){
            if(model !== undefined && model !== null){
             return model.includes("-id") || model.includes("-ids");
             }else{
             return false;
             }
            },
            checkArray(field){
           	return  Array.isArray(field);
            },
             showDelete(item, index, button) {
                let self = this;
               console.log("ITEM", item);
               self.itemsDelete = item
                console.log("General selected", self.itemsDelete);
                this.$root.$emit('bv::show::modal', 'modalDelete', button);
            },
               handleDeleteOk() {
                let self = this;
                console.log("fa-id:", self.itemsDelete["fa-id"]);
                deleteEntity(self.itemsDelete["fa-id"], self);
                document.getElementById("refreshTable").click();
            },
           showMetadata(item, index, button) {
               let self = this;
               //console.log("ITEM", item);
               if(this.pageType != 'noType'){
               getCustomMetadata(this.pageType, this.schemaIdHolder.schemaID, item["fa-id"], self);
               }
            },
           //Manage the ok button to confirm the Metadata action
            handleMetadataOk() {
             let self = this;
             self.itemsMetadata = {};
            },
            onFiltered(filteredItems) {
                // Trigger pagination to update the number of buttons/pages due to filtering
                this.totalRows = filteredItems.length;
                this.currentPage = 1;
            }
    }
      
}

</script>
<style>
ul {
  list-style-type: none;
}
</style>