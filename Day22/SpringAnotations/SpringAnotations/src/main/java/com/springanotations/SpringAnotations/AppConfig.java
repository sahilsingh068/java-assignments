package com.springanotations.SpringAnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {
	
	@Bean("sahil")
	public Employee getEmployee() {
		Employee emp= new Employee();
		
		emp.setEmpId(125);
		emp.setEmpName("sahil");
		emp.setEmpSal(7000);
		
		return emp;
	}
	
	@Bean("address")
	public Address getAddress() {
		Address add= new Address();
		
		add.setColony("vip nagar colony");
		add.setDistrict("jaipur");
		
		return add;
	}
	
	

}
