/*
 * TODO	
 */
package org.foodauthent.rest.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.io.File;
import org.foodauthent.model.FileMetadata;

import org.foodauthent.api.FileService;
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
public class FileRestService{

    private final FileService service = ServiceRegistry.get(FileService.class);


    /**
     * TODO
     *
     * @param fileMetadata The actual metadata object.
     * @return the response
     */
    @POST
    @Path("/file")
    @Consumes({ "application/json" })
    public Response createFileMetadata(FileMetadata fileMetadata
) {
        
            Object res = service.createFileMetadata(fileMetadata);
            return Response.ok(res).build();
    }

    /**
     * TODO
     *
     * @param fileId 
     * @return the response
     */
    @GET
    @Path("/file/{file-id}/data")
    @Produces({ "application/binary" })
    public Response getFileData(@PathParam("file-id") java.util.UUID fileId
) {
        
            Object res = service.getFileData(fileId);
            return Response.ok(res).build();
    }

    /**
     * TODO
     *
     * @param fileId 
     * @return the response
     */
    @GET
    @Path("/file/{file-id}")
    @Produces({ "application/json" })
    public Response getFileMetadata(@PathParam("file-id") java.util.UUID fileId
) {
        
            Object res = service.getFileMetadata(fileId);
            return Response.ok(res).build();
    }

    /**
     * TODO
     *
     * @param fileId 
     * @param upfile The file to upload.
     * @return the response
     */
    @PUT
    @Path("/file/{file-id}/data")
    @Consumes({ "multipart/form-data" })
    public Response saveFileData(@PathParam("file-id") java.util.UUID fileId
, 
            @org.glassfish.jersey.media.multipart.FormDataParam("upfile") java.io.InputStream upfile,
            @org.glassfish.jersey.media.multipart.FormDataParam("upfile") org.glassfish.jersey.media.multipart.FormDataContentDisposition upfileDetail
) {
        
            Object res = service.saveFileData(fileId, upfile, upfileDetail);
            return Response.ok(res).build();
    }
}

