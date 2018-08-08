import VueFormGenerator from "vue-form-generator";

var MyObject = function() {
var jsonschema = {
	fields: [{
			type: "input",
			inputType: "text",
			label: "FA-ID",
			model: "fa-id",
			readonly: false,
			featured: true,
			disabled: false,
			required: false
		},
		{
			type: "input",
			inputType: "text",
			label: "Name",
			model: "name",
			required: true,
			hint: "Minimum 4 characters"
		},
		{
			type: "input",
			inputType: "text",
			label: "Description",
			model: "description",
			placeholder: "Description",
			required: false
		},
		{
			type: "select",
			label: "Representation",
			model: "representation",
			inputName: "representation",
			required: true,
			validator: "string",
			values: [{
					id: "cwl",
					name: "Cwl"
				},
				{
					id: "r",
					name: "R"
				},
				{
					id: "python",
					name: "Python"
				},
				{
					id: "Knime",
					name: "knime"
				}
			]
		},
		{
			type: "select",
			label: "Type",
			model: "type",
			inputName: "type",
			required: true,
			validator: "string",
			values: [{
					id: "prediction_workflow",
					name: "Prediction Workflow"
				},
				{
					id: "training_workflow",
					name: "training workflow"
				}
			]
		},
		{
			type: "array",
			label: "Parameters",
			model: "parameters",
			inputName: "parameters",
			validator: "array",
			showRemoveButton: true,
			itemFieldClasses: "form-control",
			itemContainerClasses: "input-group pb-2",
		  newElementButtonLabelClasses: "btn btn-outline-dark",
			removeElementButtonClasses: "btn btn-danger input-group-append",
			moveElementUpButtonClasses: "btn btn-outline-dark input-group-append",
			moveElementDownButtonClasses: "btn btn-outline-dark input-group-append",
			newElementButtonLabel: "Add",
		  items: {
				type: "object",
				default: {},
				schema: {
					fields: [{
						type: "input",
						inputType: "text",
						label: "Name",
						model: "name",
						placeholder: "Name",
						required: true
					}]
				}
			}
		},
		{
			type: "array",
			label: "Tags",
			model: "tags",
			showRemoveButton: true,
			fieldClasses: "arrayEditor",
			newElementButtonLabelClasses: "btn btn-primary",
			items: {
				type: "object",
				default: {},
				schema: {
					fields: [{
						type: "input",
						inputType: "text",
						label: "Fa ID",
						model: "fa-id",
						placeholder: "Fa id",
						required: true
					}, {
						type: "input",
						inputType: "text",
						label: "Name",
						model: "name",
						placeholder: "Name",
						required: true
					}, {
						type: "input",
						inputType: "text",
						label: "Description",
						model: "description",
						placeholder: "Description",
						required: true
					}]
				}
			}
		},
		{
			type: "input",
			inputType: "text",
			label: "File ID",
			model: "file-id",
			placeholder: "file id",
			required: true
		},
		{
        type: "input",
        inputType: "text",
        label: "Product Id",
        model: "product-id",
        readonly: true,
        buttons: [
            {
                classes: "btn-location",
                label: "Search product",
                onclick: function(model) {
                this.$root.$emit('bv::show::modal','modal10')
                }
            }
        ]
      },
		{
			type: "array",
			label: "Modules",
			model: "modules",
			showRemoveButton: true,
			fieldClasses: "arrayEditor",
			newElementButtonLabelClasses: "btn btn-primary",
			items: {
				type: "object",
				default: {},
				schema: {
					fields: [{
						type: "input",
						inputType: "text",
						label: "File ID",
						model: "file-id",
						placeholder: "File id",
						required: true
					}, {
						type: "select",
						label: "Module type",
						model: "module-type",
						inputName: "module-type",
						required: true,
						validator: "string",
						values: [{
								id: "read",
								name: "read"
							},
							{
								id: "transform_signal",
								name: "transform_signal"
							},
							{
								id: "binning",
								name: "binning"
							},
							{
								id: "transform_sample",
								name: "transform_sample"
							},
							{
								id: "predict",
								name: "predict"
							},
							{
								id: "train",
								name: "train"
							}
						]
					}, {
						type: "array",
						label: "Module parameters",
						model: "module-parameters",
						showRemoveButton: true,
						fieldClasses: "arrayEditor",
						newElementButtonLabelClasses: "btn btn-primary",
						items: {
							type: "object",
							default: {},
							schema: {
								fields: [{
									type: "input",
									inputType: "text",
									label: "Name",
									model: "name",
									placeholder: "name",
									required: true
								}, {
									type: "input",
									inputType: "text",
									label: "Value",
									model: "value",
									placeholder: "value"
								}]
							}
						}
					}]
				}
			}
		},
		{
			type: "input",
			inputType: "string",
			label: "Model type",
			model: "model-type",
			placeholder: "knime_workflow"
		}
	]
};



        var getJSONSchema = function() {
            return jsonschema;
        }



        return {
            getJSONSchema: getJSONSchema
        }
    }();

export default MyObject;