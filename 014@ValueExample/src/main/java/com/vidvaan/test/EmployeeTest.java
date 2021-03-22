package com.vidvaan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vidvaan.bean.Employee;
import com.vidvaan.config.SpringConfig;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(employee);
	}

}
