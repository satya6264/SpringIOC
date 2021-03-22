package com.vidvaan.student.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.student.bean.Student;

public class TestStudent {
	
	public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	  Student student = context.getBean("student",Student.class);
	  Student student2 = context.getBean("student2",Student.class);
	  
	  System.out.println(student);
	  System.out.println(student2);
	}

}
