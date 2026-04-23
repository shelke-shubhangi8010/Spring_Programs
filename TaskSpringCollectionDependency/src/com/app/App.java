package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.question;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		
		question q =(question) context.getBean("q1");
		q.display();
	}

}
