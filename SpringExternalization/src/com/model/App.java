package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	MyDAO dao =(MyDAO) context.getBean("MyDAO");
		
		System.out.println(dao);
		
	}

}
