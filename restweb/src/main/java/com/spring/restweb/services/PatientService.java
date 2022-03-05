package com.spring.restweb.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.spring.restweb.model.Patient;

@Path("/patientservices")
public interface PatientService {
	@Path("/patients")
	@GET
	List<Patient> getPatinets();

}
