package com.spring.restweb.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.spring.restweb.model.Patient;

//This is service interface here we have all the method (CRUD) and implemnt by Impl file 

@Path("/patientservices")
public interface PatientService {
	//this method is used to get all the patients data
	@Path("/patients")
	@GET
	List<Patient> getPatinets();
	//this method is used to get the patients by id
	@Path("/patients/{id}")
	@GET
	Patient getPatient(@PathParam(value = "id") int  id);
	//this method is used to create the  patients
	@Path("/patients")
	@POST
	Response createPatients(Patient patients);

}
