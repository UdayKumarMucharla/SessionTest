package com.spring.jwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SpringSampleTable")
public class SpringSampleModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int Id;
	
	@Column
	private String Name;
	
	@Column
	private String Email;
	
	@Column
	private String Password;
	
	@Column
	private String Length;
	
	@Column
	private String Size;

	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getLength() {
		return Length;
	}


	public void setLength(String length) {
		Length = length;
	}

	public String getSize() {
		return Size;
	}


	public void setSize(String size) {
		Size = size;
	}
	

}
