package com.assignment.soap;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
//Author Syed Taqi Raza - SOAP Assignment 3 - NET4001

public class ServicesPublisher {
	public static void main(String args[]) throws Exception {
        try { //special exception handler for registry creation
            LocateRegistry.createRegistry(1099); 
        }
        catch (RemoteException e) {
            System.err.println("Failed to create registry: " + e);
        }
           
        //Instantiate
        Server1 server1 = new Server1();
        Naming.rebind("//localhost/server1", server1);
        
        Server2 server2 = new Server2();
        Naming.rebind("//localhost/server2", server2);
        
        Server3 server3 = new Server3();
        Naming.rebind("//localhost/server3", server3);
        
        Server4 server4 = new Server4();
        Naming.rebind("//localhost/server4", server4);
        
        System.out.println("Servers are ready");
    }
}
