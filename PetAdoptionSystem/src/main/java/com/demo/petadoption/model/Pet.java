package com.demo.petadoption.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pet {

    @Id
    private String petId;
    private String name;
    private String type; // Dog, Cat, etc.
    private int age;
    private boolean available;
    
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(String petId, String name, String type, int age, boolean available) {
		super();
		this.petId = petId;
		this.name = name;
		this.type = type;
		this.age = age;
		this.available = available;
	}

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}