/*
 * TODO	
 */
package org.foodauthent.api;

import java.io.File;
import org.foodauthent.model.Prediction;
import org.foodauthent.model.PredictionJob;
import org.foodauthent.model.TrainingJob;
import org.foodauthent.model.Workflow;

/**
 * 
 *
 * @author Martin Horn, University of Konstanz
 */
@javax.annotation.Generated(value = "org.foodauthent.codegen.FoodAuthentCodegen")
public interface WorkflowService {

    /**
     * 
     *
     * @param workflowId TODO
     * @param fingerprintsetId TODO
     *
     * @return the result
     */
    PredictionJob createPredictionJob(java.util.UUID workflowId, java.util.UUID fingerprintsetId);
        
    /**
     * 
     *
     * @param workflowId TODO
     * @param fingerprintsetId TODO
     *
     * @return the result
     */
    TrainingJob createTrainingJob(java.util.UUID workflowId, java.util.UUID fingerprintsetId);
        
    /**
     * Creates/adds a new workflow.
     *
     * @param workflow TODO
     *
     * @return the result
     */
    java.util.UUID createWorkflow(Workflow workflow);
        
    /**
     * Muliple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param keywords Keywords to search for
     *
     * @return the result
     */
    java.util.List<java.util.UUID> findPredictionWorkflows(java.util.List<String> keywords);
        
    /**
     * Muliple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param keywords Keywords to search for
     *
     * @return the result
     */
    java.util.List<java.util.UUID> findTrainingWorkflows(java.util.List<String> keywords);
        
    /**
     * 
     *
     * @param jobId TODO
     *
     * @return the result
     */
    PredictionJob getPredictionJob(java.util.UUID jobId);
        
    /**
     * 
     *
     * @param predictionId TODO
     *
     * @return the result
     */
    java.util.List<Prediction> getPredictionResult(java.util.UUID predictionId);
        
    /**
     * 
     *
     * @param jobId TODO
     *
     * @return the result
     */
    TrainingJob getTrainingJob(java.util.UUID jobId);
        
    /**
     * TODO
     *
     * @param workflowId 
     *
     * @return the result
     */
    Workflow getWorkflowById(java.util.UUID workflowId);
        
    /**
     * Uplloads the workflow file associated with the workflow of the given workflow-id. Upon upload, the workflow will be validated in order to make sure that it complies with the respective workflow inputs and outputs (as determined by the workflow&#39;s type parameter)
     *
     * @param workflowId 
     * @param upfile The file to upload.
     *
     * @return the result
     */
    java.util.UUID saveWorkflowFile(java.util.UUID workflowId, java.io.InputStream upfile, org.glassfish.jersey.media.multipart.FormDataContentDisposition upfileDetail);
        
}
