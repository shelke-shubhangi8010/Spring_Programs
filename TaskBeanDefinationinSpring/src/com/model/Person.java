package com.model;

public class Person {

	private int id;
	private String city;
	private String name;
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show()
	{
		System.out.println("Person name is : "+name);
		System.out.println("Person id is : "+ id);
		System.out.println("Person City Is :" +city);
	}
	
	
}
