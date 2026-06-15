package com.exam.test.Dao;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private String email;

	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void save(Student student) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int i) {
		// TODO Auto-generated method stub
		
	}

}
