package com.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("springConfigxml.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Student stud=(Student) factory.getBean("studentbean");
		System.out.println(stud);
	}

}
