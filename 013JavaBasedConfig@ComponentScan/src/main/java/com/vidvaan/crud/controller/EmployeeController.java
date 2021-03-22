package com.vidvaan.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vidvaan.crud.service.EmployeeService;

@Controller("conEmp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public void save() {

		System.out.println("Employee Controller Save Called...");
		employeeService.save();
	}

}
