package com.config.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("com/config/interfaces/spring.xml");
		
		OrderImpl o1=(OrderImpl) context.getBean("Oi");
		
		o1.placeOrder();
		
	}

}
