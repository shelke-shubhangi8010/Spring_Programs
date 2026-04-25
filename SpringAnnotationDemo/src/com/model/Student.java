package com.model;

import org.springframework.stereotype.Component;


// @component  = it will convert pogo class into stereotype annotation
// it is treated your bean class
@Component  
public class Student {

	public void display() {
		
		System.out.println("Student Bean is created");
	}
	
}
