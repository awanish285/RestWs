package com.spring.restweb.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Patinet")
public class Patient {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
