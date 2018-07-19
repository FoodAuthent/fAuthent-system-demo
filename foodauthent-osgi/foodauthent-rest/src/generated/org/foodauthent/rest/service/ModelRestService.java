/*
 * TODO	
 */
package org.foodauthent.rest.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.io.File;
import org.foodauthent.model.Model;

import org.foodauthent.api.ModelService;
import org.foodauthent.api.ServiceRegistry;

/**
 * FoodAuthent Swagger API
 *
 * <p>This is the FoodAuthent API Description [www.foodauthent.net]
 *
 * <p> 
 *
 * @author Martin Horn, University of Konstanz
 */
@Path("/v0/foodauthent")
@javax.annotation.Generated(value = "org.foodauthent.codegen.FoodAuthentCodegen")
public class ModelRestService{

	private final ModelService service = ServiceRegistry.get(ModelService.class);


    /**
     * Creates/adds a new model.
     *
     * @param model TODO
     * @return the response
     */
    @POST
    @Path("/model")
    @Consumes({ "application/json" })
    public Response createModel(Model model
) {
	    Object res = service.createModel(model);    
	  	try {
	   		return Response.ok(res).build();
	   	} catch(Exception e) {
	   		//TODO
	   		e.printStackTrace();
	   		throw e;
	   	}
    }

    /**
     * TODO
     *
     * @param modelId 
     * @return the response
     */
    @GET
    @Path("/model/{model-id}")
    @Produces({ "application/json" })
    public Response getModelById(@PathParam("model-id") java.util.UUID modelId
) {
	    Object res = service.getModelById(modelId);    
	  	try {
	   		return Response.ok(res).build();
	   	} catch(Exception e) {
	   		//TODO
	   		e.printStackTrace();
	   		throw e;
	   	}
    }

    /**
     * Uploads the model file associated with the model of the given model-id.
     *
     * @param modelId 
     * @param upfile The file to upload.
     * @return the response
     */
    @PUT
    @Path("/model/{model-id}/file")
    @Consumes({ "multipart/form-data" })
    public Response saveModelFile(@PathParam("model-id") java.util.UUID modelId
, 
            @org.glassfish.jersey.media.multipart.FormDataParam("upfile") java.io.InputStream upfile,
            @org.glassfish.jersey.media.multipart.FormDataParam("upfile") org.glassfish.jersey.media.multipart.FormDataContentDisposition upfileDetail
) {
	    Object res = service.saveModelFile(modelId, upfile, upfileDetail);    
	  	try {
	   		return Response.ok(res).build();
	   	} catch(Exception e) {
	   		//TODO
	   		e.printStackTrace();
	   		throw e;
	   	}
    }
}

