package com.ash.hibernate.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class SimpleUser {

	public enum Gender {
		MALE, FEMALE
	}

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	
	@Column(name="pass")
	private String password;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SimpleUser [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + "]";
	}

	

}
