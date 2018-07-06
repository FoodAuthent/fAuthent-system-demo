/*
 * TODO	
 */
package org.foodauthent.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.foodauthent.api.ProductService;
import org.foodauthent.api.ServiceRegistry;
import org.foodauthent.model.Product;

/**
 * FoodAuthent Swagger API
 *
 * <p>
 * This is the FoodAuthent API Description [www.foodauthent.net]
 *
 * <p>
 *
 * @author Martin Horn, University of Konstanz
 */
@Path("/v0/foodauthent")
@javax.annotation.Generated(value = "org.foodauthent.codegen.FoodAuthentCodegen")
public class ProductRestService {

    private final ProductService service = ServiceRegistry.get(ProductService.class);

    /**
     * TODO
     *
     * @param product
     *            TODO
     * @return the response
     */
    @POST
    @Path("/product")
    @Consumes({ "application/json" })
    public Response createProduct(Product product) {
	Object res = service.createProduct(product);
	return Response.ok(res).build();
    }

    /**
     * TODO
     *
     * @param gtin
     *            TODO
     * @return the response
     */
    @GET
    @Path("/product/findByGtin")
    @Produces({ "application/json" })
    public Response findProductByGtin(@QueryParam("gtin") String gtin) {
	Object res = service.findProductByGtin(gtin);
	return Response.ok(res).build();
    }
}
