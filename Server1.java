package com.assignment.soap;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//Author Syed Taqi Raza(100887193) - SOAP Assignment 3 - NET4001

public class Server1 extends UnicastRemoteObject implements ServiceA {

	
    /**
	 * 
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int count = 0;
	
	public Server1() throws RemoteException {
        super(0);    // required to avoid the 'rmic' step, see below
    }

	@Override
	public String getMessage() {
		count++;
		
		return "Hello I'm Service A from Server 1!";
	}
}