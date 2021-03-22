package com.vidvaan.crud.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.crud.config.SpringConfig;
import com.vidvaan.crud.controller.EmployeeController;

public class EmployeeTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		EmployeeController employeeController=(EmployeeController) applicationContext.getBean("employeeController");
		employeeController.save(); 
	}

}
