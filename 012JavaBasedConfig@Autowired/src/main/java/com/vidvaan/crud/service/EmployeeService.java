package com.vidvaan.crud.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vidvaan.crud.dao.EmployeeDAO;

public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public void save() {
		
		System.out.println("Employee Service Save Called...");
		employeeDAO.save();
	}

}
