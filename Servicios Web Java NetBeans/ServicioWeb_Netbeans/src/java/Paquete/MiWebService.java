/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Santiago
 */
@WebService(serviceName = "MiWebService")
public class MiWebService {

    @WebMethod(operationName = "Suma")
    public Integer Suma(@WebParam(name = "Num1")
    int Num1, @WebParam(name = "Num2")
    int Num2) {
        return Num1+Num2;
    }
}
