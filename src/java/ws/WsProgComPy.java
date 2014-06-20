/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Rodrigo
 */
@WebService(serviceName = "WsProgComPy")
public class WsProgComPy {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public float suma(@WebParam(name = "nro1") float nro1, @WebParam(name = "nro2") float nro2) {
        //TODO write your implementation code here:
        return nro1+nro2;
    }
}
