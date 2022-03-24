package com.springanotations.SpringAnotations;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan
public class Test {
	public static void main(String[] args) {
		
		//Resource resource=new ClassPathResource("springConfig.xml");
		//BeanFactory factory =new XmlBeanFactory(resource);
		//ApplicationContext factory=new ClassPathXmlApplicationContext("springConfig.xml");
		ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp =(Employee) factory.getBean("sahil");
		System.out.println(emp);
	}

}
