package com.config.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext contex = new ClassPathXmlApplicationContext("com/config/annotation/spring.xml");

		// Instructor instructor= (Instructor) contex.getBean("instructor");
		// System.out.println(instructor.hashCode());  // generate randome number using hash code()

		Instructor instructor2 = (Instructor) contex.getBean("instructor");

		System.out.println(instructor2);

	}

}
