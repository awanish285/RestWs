package com.spring.restweb.model;

import javax.xml.bind.annotation.XmlRootElement;

//this is the model class ..

//this is the XML form  @XmlRootElement  which is means what is the name of our xml root

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
