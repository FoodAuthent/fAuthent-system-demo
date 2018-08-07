/*
 * TODO	
 */
package org.foodauthent.rest.api.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.foodauthent.model.Model;

import org.foodauthent.api.ModelService;
import org.foodauthent.api.ServiceRegistry;

import org.foodauthent.common.exception.FAExceptions;

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
public interface ModelRestService{


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
);

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
);
}
