package com.spring.restweb.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.restweb.model.Patient;
import com.spring.restweb.services.PatientService;


@Service
public class PatientServiceImpl implements PatientService {
	
	Map<Integer,Patient> patinets=new HashMap<>();
	int currentId=123;
	//private ArrayList response;
	
	public PatientServiceImpl()
	{
		init();
	}
	
	void init()
	{
		Patient patient=new Patient();
		patient.setId(currentId);
		patient.setName("John");
		patinets.put(patient.getId(), patient);
	}

	@Override
	public List<Patient> getPatinets() {
		
		Collection<Patient> results = patinets.values();
		List<Patient> response = new ArrayList(results);
		return response;
	}

	@Override
	public Patient getPatient(int id) {
		
		System.out.println("data: "+patinets.get(id));
		
		return patinets.get(id);
	}
	

}
