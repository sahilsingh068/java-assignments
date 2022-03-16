package com.springcore;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		//Employee emp=new Employee(111,"sahil",9000,"jaipur");
		//System.out.println(emp);
		Resource resource=new ClassPathResource("springConfig.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		// Beanfactory is a container/interface and accessing some resource and we are giving it through Resource
		
		Employee emp=(Employee) factory.getBean("sleeping");
		System.out.println(emp);
	
	}

}
