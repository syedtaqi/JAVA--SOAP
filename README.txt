Author: Syed Taqi Raza (100887193) - Net4001- SOAP Assignment 3

Note In your workspace. make folders : com >> assignment >> soap 

Step 1. Run ServicePublisher.java class

Step 2. Run ApiGatewayPublisher.java class

Step 3. Run Client1.java class

ApiGatewayImpl.java
	Recieves requests and forwards the requests to backend servers	
	Loadbalancing done : Maps the service to the servers
			   1.  Even number count : Server 1 or Server 3
			   2.  Odd number count : Server 2 or Server 4
	Also counts the total requests done including the current one


Client1.java
	Requests the ApiGateway server for the serviceA and ServiceB
	Get response back from the gateway that it belongs to either server

ApiGatewayPublisher: Publishes the endpoints 
ServicePublisher: Use RMI to Instantiate all the servers. 

Server1:	returns the statement that service recieved from server 1
Server2:	returns the statement that service recieved from server 2
Server3:  	returns the statement that service recieved from server 3
Server4:   	returns the statement that service recieved from server 4

ApiGateway.Java	Interface between Client1 and Api Gateway
ServiceA.Java	Interface between ApiGateway and Service Server A
ServiceB.Java	Interface between ApiGateway and Service Server B