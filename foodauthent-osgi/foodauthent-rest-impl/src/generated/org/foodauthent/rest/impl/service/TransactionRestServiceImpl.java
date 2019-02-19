/*
 * TODO	
 */
package org.foodauthent.rest.impl.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import org.foodauthent.model.TransactionPageResult;

import org.foodauthent.api.TransactionService;
import org.foodauthent.api.ServiceRegistry;

import org.foodauthent.rest.api.service.TransactionRestService;

import org.foodauthent.common.exception.FAExceptions;

/**
 * FoodAuthent Swagger API
 *
 * <p>This is the FoodAuthent API Description [www.foodauthent.net]
 *
 * <p> All Transaction related endpoints.
 *
 * @author Martin Horn, University of Konstanz
 */
@javax.annotation.Generated(value = "org.foodauthent.codegen.FoodAuthentCodegen")
@Component(service = TransactionRestService.class, immediate = true)
public class TransactionRestServiceImpl implements TransactionRestService {

	@Reference(cardinality = ReferenceCardinality.MANDATORY)
    private TransactionService service;


    /**
     * Muliple keywords can be provided with comma separated strings, e.g, keyword1, keyword2.
     *
     * @param pageNumber the page number starting at 0
     * @param pageSize entries per page, minimum 1
     * @param keywords Keywords to search for
     * @return the response
     */
    public Response findTransactionByKeyword(Integer pageNumber, Integer pageSize, java.util.List<String> keywords) {
        
            Object res = service.findTransactionByKeyword(pageNumber, pageSize, keywords);
            return Response.ok(res).build();
    }
}

