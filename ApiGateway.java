
package com.assignment.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
//Author Syed Taqi Raza - SOAP Assignment 3 - NET4001
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface ApiGateway {
	@WebMethod String request(String serviceName);	
}


