package com.donato.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Contact {

	@Id
	@GeneratedValue
	int ID;
	String firstName;
	String lastName;
	String email;

	public Contact() {
	}

	public Contact(String firstName, String lastName, String email) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

}
