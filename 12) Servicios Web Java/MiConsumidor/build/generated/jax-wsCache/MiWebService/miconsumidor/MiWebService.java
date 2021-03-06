
package miconsumidor;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MiWebService", targetNamespace = "http://Paquete/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MiWebService {


    /**
     * 
     * @param num2
     * @param num1
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "Suma")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Suma", targetNamespace = "http://Paquete/", className = "miconsumidor.Suma")
    @ResponseWrapper(localName = "SumaResponse", targetNamespace = "http://Paquete/", className = "miconsumidor.SumaResponse")
    @Action(input = "http://Paquete/MiWebService/SumaRequest", output = "http://Paquete/MiWebService/SumaResponse")
    public Integer suma(
        @WebParam(name = "Num1", targetNamespace = "")
        int num1,
        @WebParam(name = "Num2", targetNamespace = "")
        int num2);

}
