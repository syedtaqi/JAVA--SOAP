package com.assignment.soap;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
//Author Syed Taqi Raza - SOAP Assignment 3 - NET4001
@WebService(endpointInterface = "com.assignment.soap.ApiGateway")
public class ApiGatewayImpl implements ApiGateway {
	@Resource
	WebServiceContext wsContext;
	private int count;
	 
	public ApiGatewayImpl() {
		count = 0;
	}
	
	@Override
	public String request(String serviceName) {
		try {
			count++;
			
			MessageContext mc = wsContext.getMessageContext();
		   // HttpServletRequest req = (HttpServletRequest) mc.get(MessageContext.SERVLET_REQUEST);
		    
		   // System.out.println("Client IP = " + req.getRemoteAddr() + " request Service " + serviceName);
		    System.out.println("Total request (including this one): " + count); 
		    
			if(serviceName.equalsIgnoreCase("A")) { // forward request to either server 1 and 2
				ServiceA serviceA = null;
				if(count % 2 == 0) {
					serviceA = (ServiceA) Naming.lookup("//localhost/server1");
				}
				else {
					serviceA = (ServiceA) Naming.lookup("//localhost/server2");
				}
				
				return serviceA.getMessage();
			}
			else if(serviceName.equalsIgnoreCase("B")) { // forward request to either server 3 and 4
				ServiceB serviceB = null;
				if(count % 2 == 0) {
					serviceB = (ServiceB) Naming.lookup("//localhost/server3");
				}
				else {
					serviceB = (ServiceB) Naming.lookup("//localhost/server4");
				}
				
				return serviceB.getMessage();
			}
			else {
				return "Sorry, Service " + serviceName + " is NOT supported by Gateway API Server";
			}
			
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (RemoteException e) {
			e.printStackTrace();
			return "Sorry, Service " + serviceName + " is NOT supported by Gateway API Server";
		}
		catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		return "Sorry, Failed to process Service " + serviceName + " request";
	}
}