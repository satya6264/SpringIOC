package com.vidvaan.crud.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.crud.controller.EmployeeController;

public class EmployeeTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController employeeController=(EmployeeController) applicationContext.getBean("employeeController");
		employeeController.save(); 
	}

}
