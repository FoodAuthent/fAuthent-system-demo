/*
 * TODO	
 */
package org.foodauthent.api;

import org.foodauthent.model.SOP;
import org.foodauthent.model.SOPPageResult;

import org.foodauthent.common.exception.FAExceptions;

/**
 * 
 *
 * @author Martin Horn, University of Konstanz
 */
@javax.annotation.Generated(value = "org.foodauthent.codegen.FoodAuthentCodegen")
public interface SopService {

    /**
     * TODO
     *
     * @param sop TODO
     *
     * @return the result
     */
    java.util.UUID createNewSOP(SOP sop);
        
    /**
     * Muliple tags can be provided with comma separated strings. Use keyword1, keyword2, keyword3 for testing. If no keyword is specified, all entries will be considered.
     *
     * @param pageNumber 
     * @param pageSize 
     * @param keywords Keywords to search for
     *
     * @return the result
     */
    SOPPageResult findSOPByKeyword(Integer pageNumber, Integer pageSize, java.util.List<String> keywords);
        
    /**
     * TODO
     *
     * @param sopId 
     *
     * @return the result
     */
    SOP getSOPById(java.util.UUID sopId);
        
    /**
     * TODO
     *
     * @param sopId 
     *
     * 
     */
    void removeSOPById(java.util.UUID sopId);
        
}
