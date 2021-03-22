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
		return new EmployeeService();
	}

	@Bean
	public EmployeeController employeeController() {
		return new EmployeeController();

	}

}
