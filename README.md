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
REST stands for REpresentational State Transfer. 
It is developed by Roy Thomas Fielding, who also developed HTTP. 
The main goal of RESTful web services is to make web services more effective. 
RESTful web services try to define services using the different concepts that are already present in HTTP. 
REST is an architectural approach, not a protocol.



It does not define the standard message exchange format. We can build REST services with both XML and JSON. JSON is more popular format with REST. The key abstraction is a resource in REST. A resource can be anything. It can be accessed through a Uniform Resource Identifier (URI). For example:

The resource has representations like XML, HTML, and JSON. The current state capture by representational resource. When we request a resource, we provide the representation of the resource. The important methods of HTTP are:

GET: It reads a resource.
PUT: It updates an existing resource.
POST: It creates a new resource.
DELETE: It deletes the resource.