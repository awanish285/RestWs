package com.spring.restweb.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.spring.restweb.model.Patient;

@Path("/patientservices")
public interface PatientService {
	@Path("/patients")
	@GET
	List<Patient> getPatinets();
	
	@Path("/patients/{id}")
	@GET
	Patient getPatient(@PathParam(value = "id") int  id);
	
	@Path("/patients")
	@POST
	Response createPatients(Patient patients);

}
