package com.springcontainer;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	@Bean("sahil")
	public Employee getEmployee() {
		Employee emp= new Employee();
		
		emp.setEmpid(125);
		emp.setEmpname("soma");
		
		return emp;
	}
	
	@Bean("add")
	public Address getAddress() {
		Address add= new Address();
		
		add.setColony("sarawsthi nagar colony");
		
		return add;
	}

}
