package com.assignment.soap;


import java.rmi.Remote;
import java.rmi.RemoteException;
//Author Syed Taqi Raza(100887193) - SOAP Assignment 3 - NET4001

//Service Endpoint Interface
public interface ServiceA extends Remote {
	String getMessage() throws RemoteException;;	
}