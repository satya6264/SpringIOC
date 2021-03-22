package com.vidvaan.bean;

import org.springframework.beans.factory.InitializingBean;

public class SpringBean implements InitializingBean{

	public SpringBean() {
		System.out.println("Object created");
	}
	
	public void init() {
		System.out.println("init");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Hello I am init");
		
	}

}
