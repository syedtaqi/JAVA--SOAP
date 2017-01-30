package com.assignment.soap;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//Author Syed Taqi Raza - SOAP Assignment 3 - NET4001

public class Server4 extends UnicastRemoteObject implements ServiceB {
    /**
	 * 
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int count = 0;
	
	public Server4() throws RemoteException {
        super(0);    // required to avoid the 'rmic' step, see below
    }

	@Override
	public String getMessage() {
		count++;
		
		return "Hello I'm Service B from Server 4!";
	}
}
