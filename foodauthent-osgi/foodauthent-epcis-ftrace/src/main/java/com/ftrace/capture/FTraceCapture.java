
package com.ftrace.capture;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import epcglobal.epcis.xsd._1.EPCISDocumentType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "fTraceCapture", targetNamespace = "http://ns.ftrace.com/fTraceCapture")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.ftrace.fish.ObjectFactory.class,
    com.ftrace.fruit.ObjectFactory.class,
    com.ftrace.epcis.ObjectFactory.class,
    com.ftrace.capture.ObjectFactory.class,
    de.foodauthent.epcis.ObjectFactory.class,
    epcglobal.epcis.xsd._1.ObjectFactory.class,
    epcglobal.xsd._1.ObjectFactory.class,
    org.unece.cefact.namespaces.standardbusinessdocumentheader.ObjectFactory.class
})
public interface FTraceCapture {


    /**
     * 
     * @param fTraceCaptureRequest
     * @return
     *     returns com.ftrace.ns.ftracecapture.FtraceCaptureResponse
     */
    @WebMethod
    @WebResult(name = "ftraceCaptureResponse", targetNamespace = "http://ns.ftrace.com/fTraceCapture", partName = "ftraceCaptureResponse")
    public FtraceCaptureResponse ftraceCapture(
        @WebParam(name = "fTraceCaptureRequest", targetNamespace = "http://ns.ftrace.com/fTraceCapture", partName = "fTraceCaptureRequest")
        EPCISDocumentType fTraceCaptureRequest);

}
