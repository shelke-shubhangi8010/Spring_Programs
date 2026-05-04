package com.Shelke.SpringORMTask;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/Shelke/SpringORMTask/config.xml");

		CustomerDao dao = (CustomerDao) context.getBean("customerDaoImpl");
		Customer c = new Customer();

		c.setId(1);
		c.setEmail("shubhangi2259@gmail.com");
		c.setCity("pune");
		c.setName("Shubhangi");

		dao.create(c);

     // fetch Alll

		List<Customer> list = dao.findAll();
		System.out.println(list);

	}
}
