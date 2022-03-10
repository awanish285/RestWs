package com.spring.restweb.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.spring.restweb.model.Patient;
import com.spring.restweb.services.PatientService;

//this is patientServiceimpl class where we have write all the database realted activity

@Service
public class PatientServiceImpl implements PatientService {
	//this map is used to hold the patient data (behave like database)
	Map<Integer,Patient> patinets=new HashMap<>();
	int currentId=123;
	//private ArrayList response;
	
	public PatientServiceImpl()
	{
		init();
	}
	//this init() method is used to set patient name and id and put into the map
	void init()
	{
		Patient patient=new Patient();
		patient.setId(currentId);
		patient.setName("John");
		patinets.put(patient.getId(), patient);
	}
    //this is the method to get all the patient
	@Override
	public List<Patient> getPatinets() {
		
		Collection<Patient> results = patinets.values();
		List<Patient> response = new ArrayList<Patient>(results);
		return response;
	}
     //this method is used to get  the patient data by id
	@Override
	public Patient getPatient(int id) {
		
		System.out.println("data: "+patinets.get(id));
		
		return patinets.get(id);
	}
    //this method is used to create the patient
	@Override
	public Response createPatients(Patient patients) {
		patients.setId(++currentId);
		patinets.put(patients.getId(), patients);
		return Response.ok(patients).build();
	}
	

}
