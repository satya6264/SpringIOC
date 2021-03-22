package com.vidvaan.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.vidvaan.crud.service.EmployeeService;

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	
//	public void setEmployeeService(EmployeeService employeeService) {
//		this.employeeService = employeeService;
//	}



	public void save() {
		
		System.out.println("Employee Controller Save Called...");
		employeeService.save();
	}

}
