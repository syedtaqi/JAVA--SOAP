package com.assignment.soap;


import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
//Author Syed Taqi Raza(100887193) - SOAP Assignment 3 - NET4001

public class Client1 {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:9999/gateway");

        // 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://soap.assignment.com/", "ApiGatewayImplService");
//        QName Bname = new QName("http://gateway.api.com/", "srvB");

        
        Service service = Service.create(url, qname);
      //  Service srviceB = Service.create(url, Bname);

        ApiGateway gateway = service.getPort(ApiGateway.class);
     //   ApiGateway gate = srviceB.getPort(ApiGateway.class);

        System.out.println(gateway.request("A"));
        System.out.println(gateway.request("A"));
        System.out.println(gateway.request("A"));
        System.out.println(gateway.request("A"));
        
        System.out.println(gateway.request("B"));
        System.out.println(gateway.request("B"));
        System.out.println(gateway.request("B"));
        System.out.println(gateway.request("B"));

    }

}