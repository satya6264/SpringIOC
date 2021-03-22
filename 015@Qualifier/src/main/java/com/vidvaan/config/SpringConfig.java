package com.vidvaan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vidvaan.bean.Dao;
import com.vidvaan.bean.Service;

@Configuration
@ComponentScan(basePackages= {"com.vidvaan"})
public class SpringConfig {
	
	@Bean
	public Service service() {
		return new Service();
	}
	
	@Bean
	public Dao dao1() {
		System.out.println("Dao1 is called");
		return new Dao();
		
	}
	
	@Bean
	public Dao dao2() {
		System.out.println("Dao2 is called");
		return new Dao();
		
	}

}
