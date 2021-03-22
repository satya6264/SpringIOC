package com.vidvaan.crud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vidvaan.crud.controller.EmployeeController;
import com.vidvaan.crud.dao.EmployeeDAO;
import com.vidvaan.crud.service.EmployeeService;

@Configuration
public class SpringConfig {
	
	@Bean
	public EmployeeDAO employeeDAO() {
		return new EmployeeDAO();
	}
	
	@Bean
	public EmployeeService employeeService() {
		EmployeeService employeeService = new EmployeeService();
		employeeService.setEmployeeDAO(employeeDAO());
		return employeeService;
	}
	
	@Bean
	public EmployeeController employeeController() {
		EmployeeController employeeController = new EmployeeController();
		employeeController.setEmployeeService(employeeService( ));
		return employeeController;
		
	}

}
