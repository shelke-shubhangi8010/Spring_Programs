package com.exam.test.SpringJDBCTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/exam/test/SpringJDBCTest/spring.xml");
       
       JdbcTemplate template =(JdbcTemplate) context.getBean("jdbcTemplate");
       
       String sql= "insert into employee values(?,?,?)";
       int result = template.update(sql,1,"Shubhangi","Shelke");
       
       System.out.println("Number of record inserted are...:"+result);
    }
}
