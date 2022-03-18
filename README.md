# RestWs

#Description

This project is demo if RestWs and perform all the CRUD operation.

#Tech Stack

Java,Springboot,RestWs

#Tools
Maven,sts

#VC
Git


================================================================================================================================================
#Maven Dependency for Spring RestWs

this dependency is adding in pom.xml file after adding file in pom.xml file your project is now RestWs 

       <dependency>
		<groupId>org.apache.cxf</groupId>
		<artifactId>cxf-spring-boot-starter-jaxrs</artifactId>
		<version>3.5.1</version>
		</dependency>
		
================================================================================================================================================
1) REST stands for REpresentational State Transfer. 
2) It is developed by Roy Thomas Fielding, who also developed HTTP. 
3) The main goal of RESTful web services is to make web services more effective. 
4) RESTful web services try to define services using the different concepts that are already present in HTTP. 
5) REST is an architectural approach, not a protocol.

=======================================================================================================================================================

1) It does not define the standard message exchange format. 
2) We can build REST services with both XML and JSON. JSON is more popular format with REST. The key abstraction is a resource in REST. 
3) A resource can be anything. It can be accessed through a Uniform Resource Identifier (URI). For example:
4) The resource has representations like XML, HTML, and JSON. The current state capture by representational resource. When we request a resource, we provide the representation of the resource. The important methods of HTTP are:

#HTTP Method:

1) GET: It reads a resource.
2) PUT: It updates an existing resource.
3) POST: It creates a new resource.
4) DELETE: It deletes the resource.


================================================================================================================================================================


#RESTful Service Constraints

There must be a service producer and service consumer.
The service is stateless.
The service result must be cacheable.
The interface is uniform and exposing resources.
The service should assume a layered architecture.


===========================================================================================================================================================================

#Advantages of RESTful web services

RESTful web services are platform-independent.
It can be written in any programming language and can be executed on any platform.
It provides different data format like JSON, text, HTML, and XML.
It is fast in comparison to SOAP because there is no strict specification like SOAP.
These are reusable.
They are language neutral.

=========================================================================================================================================================================================

1) Web services are the types of internet software that uses standardized messaging protocol over the distributed environment. 

2) It integrates the web-based application using the REST, SOAP, WSDL, and UDDI over the network. 
3) For example, Java web service can communicate with .Net application.

==================================================================================================================================================================================================

#Features of web Services

1) Web services are designed for application to application interaction.
2) It should be interoperable.
3) It should allow communication over the network.


#Components of Web Services

#The web services must be able to fulfill the following conditions:

1) The web service must be accessible over the internet.
2) The web service is discoverable through a common mechanism like UDDI.
3) It must be interoperable over any programming language or Operating System.

===================================================================================================================================================================
#Uses of Web Services

1) Web services are used for reusing the code and connecting the existing program.
2) Web services can be used to link data between two different platforms.
3) It provides interoperability between disparate applications.

How does data exchange between applications?

Suppose, we have an Application A which create a request to access the web services. The web services offer a list of services. The web service process the request and sends the response to the Application A. The input to a web service is called a request, and the output from a web service is called response. The web services can be called from different platforms.


There are two popular formats for request and response XML and JSON.

