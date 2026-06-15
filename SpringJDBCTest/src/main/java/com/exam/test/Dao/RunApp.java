package com.exam.test.Dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {

    public static void main(String[] args) {

        // Load Spring XML File
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "com/exam/test/Dao/spring.xml");

        // Get DAO Bean
        StudentDao dao =
                (StudentDao) context.getBean("studentdao");

        // Save Student
        dao.save(new Student("Siya", "siya@123.com"));

        // Fetch All Students
        List<Student> students = dao.findAll();

        // Print Students
        for (Student s : students) {

            System.out.println(
                    s.getId() + " "
                    + s.getName() + " "
                    + s.getEmail());
        }

        // Delete Student
      //  dao.delete(1);

      
        
        System.out.println("Data Inserted Successfully");
    }
}