package com.config.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Bank bank = (Bank) context.getBean("bank");
		bank.startBanking();
	}
}
