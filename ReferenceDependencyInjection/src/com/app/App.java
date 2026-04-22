package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext  context= new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e= (Employee) context.getBean("e1");
		e.display();
	}

}
