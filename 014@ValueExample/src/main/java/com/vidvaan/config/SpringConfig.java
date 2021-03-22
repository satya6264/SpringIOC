package com.vidvaan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vidvaan.bean.Employee;

@Configuration
@ComponentScan(basePackages= {"com.vidvaan"})
public class SpringConfig {
	
	@Bean
	public Employee employee() {
		return new Employee();
	}
	

}
