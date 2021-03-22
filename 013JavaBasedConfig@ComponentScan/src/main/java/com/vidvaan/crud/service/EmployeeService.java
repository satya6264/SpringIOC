package com.vidvaan.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidvaan.crud.dao.EmployeeDAO;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	

	public void save() {
		
		System.out.println("Employee Service Save Called...");
		employeeDAO.save();
	}

}
