package com.Shubhangi.Shelke.Spring_AOP_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.Shubhangi.Shelke.service.PaymentService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigTest.class);
    	
    	   PaymentService service= context.getBean(PaymentService.class);
    	   service.processPayment() ;
    	   }
}
