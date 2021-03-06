/*
 * TODO	
 */
package org.foodauthent.rest.impl.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import org.foodauthent.model.DiscoveryServiceTransaction;
import org.foodauthent.model.ObjectEvent;
import org.foodauthent.model.ObjectEventPageResult;

import org.foodauthent.api.ObjectEventService;
import org.foodauthent.api.ServiceRegistry;

import org.foodauthent.rest.api.service.ObjectEventRestService;

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
@javax.annotation.Generated(value = "org.foodauthent.codegen.FoodAuthentCodegen")
@Component(service = ObjectEventRestService.class, immediate = true)
public class ObjectEventRestServiceImpl implements ObjectEventRestService {

	@Reference(cardinality = ReferenceCardinality.MANDATORY)
    private ObjectEventService service;


    /**
     * Convert the ObjectEvent to Discovery Service Transaction.
     *
     * @param objecteventId 
     * @return the response
     */
    public Response convertObjectEventToTransaction(java.util.UUID objecteventId) {
        
            Object res = service.convertObjectEventToTransaction(objecteventId);
            return Response.ok(res).build();
    }

    /**
     * Creates/adds a new ObjectEvent.
     *
     * @param objectEvent TODO
     * @return the response
     */
    public Response createObjectEvent(ObjectEvent objectEvent) {
        
            Object res = service.createObjectEvent(objectEvent);
            return Response.ok(res).build();
    }

    /**
     * Muliple keywords(epcClass) can be provided with comma separated strings, e.g, keyword1, keyword2.
     *
     * @param pageNumber the page number starting at 1
     * @param pageSize entries per page, minimum 1
     * @param keywords Keywords to search for
     * @return the response
     */
    public Response findObjectEventByKeyword(Integer pageNumber, Integer pageSize, java.util.List<String> keywords) {
        
            Object res = service.findObjectEventByKeyword(pageNumber, pageSize, keywords);
            return Response.ok(res).build();
    }

    /**
     * Get the ObjectEvent an id.
     *
     * @param objecteventId 
     * @return the response
     */
    public Response getObjectEventById(java.util.UUID objecteventId) {
        
            Object res = service.getObjectEventById(objecteventId);
            return Response.ok(res).build();
    }
}

