package com.spring.restweb.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.spring.restweb.model.Patient;

@Path("/patientservices")
public interface PatientService {
	@Path("/patients")
	@GET
	List<Patient> getPatinets();
	
	@Path("/patients/{id}")
	@GET
	Patient getPatient(@PathParam(value = "id") int  id);

}
