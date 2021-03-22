package com.vidvaan.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vidvaan.bean.Question;

public class Test {
	
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Question question = (Question) beanFactory.getBean("question");
		question.display();
		
	}

}
