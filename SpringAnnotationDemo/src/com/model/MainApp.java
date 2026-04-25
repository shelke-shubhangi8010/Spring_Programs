/**
 * 
 */
package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext contex=new AnnotationConfigApplicationContext("AppConfig.class");
		
		Student student=contex.getBean(Student.class);
		student.display();
		
		Employee employee = contex.getBean(Employee.class);
		employee.info();
	}

}
