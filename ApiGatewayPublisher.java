package com.assignment.soap;

import javax.xml.ws.Endpoint;
//Author Syed Taqi Raza(100887193) - SOAP Assignment 3 - NET4001

//Endpoint publisher
public class ApiGatewayPublisher {

	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/gateway", new ApiGatewayImpl());
	   System.out.println("API Gateway endpoints published!");
    }

}