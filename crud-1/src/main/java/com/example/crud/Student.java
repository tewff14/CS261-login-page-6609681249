package com.example.crud;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = DatabaseHelper.getLastIndex() + 1;

	@Column(name = "eng_name", nullable = false)
	private String engName;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "faculty", nullable = false)
	private String faculty;

	@Column(name = "type", nullable = false)
	private String type;

	@Column(name = "user_name", nullable = false)
	private String userName;

	@Column(name = "password", nullable = false)
	private String password;

	public void setEngName(String name) {
		this.engName = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUserName(String name) {
		this.userName = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// ************************************
	public String getEngName(String name) {
		return this.engName;
	}

	public String getEmail(String email) {
		return this.email;
	}

	public String getFaculty(String faculty) {
		return this.email;
	}

	public String getType(String type) {
		return this.type;
	}

	public String getUserName(String name) {
		return this.userName;
	}

	public String getPassword(String password) {
		return this.password;
	}

}
