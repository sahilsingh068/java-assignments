package com.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Employee emp= new Employee(123, "bansal", 78203);
		
//		Resource resource = new ClassPathResource("springConfig.xml");
//
//		BeanFactory factory= new XmlBeanFactory(resource);
		
//		ApplicationContext factory= new ClassPathXmlApplicationContext("springConfig.xml");
		
		ApplicationContext factory= new AnnotationConfigApplicationContext(Test.class);
		
		emp.setEmpid(124);
		emp.setEmpname("kushi");
		
	}

}
