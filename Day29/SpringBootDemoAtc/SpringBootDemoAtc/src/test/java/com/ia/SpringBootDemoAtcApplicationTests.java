package com.ia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ia.entity.Employee;
import com.ia.service.EmployeeService;

@SpringBootTest
class SpringBootDemoAtcApplicationTests {

	@Autowired
	EmployeeService service;
	
	@Test
	void testAddEmployee() {
		
		Employee employee=new Employee(101, "sahil", 10000, "jaipur");
		
		Employee emp=service.addEmployee(employee);
		
		assertEquals(emp.getEmpName(),"sahil");
	}
	
	
	@Test
	void testUpdateEmployee() {
		
		Employee employee=new Employee(101, "rivanshu", 1520, "jaipur");
			

		Employee emp=service.updateEmployee(employee);
		
		assertEquals(emp.getEmpName(),"singh");
	}
	
	@Test
	void testDeleteEmployee() {
		
		String emp=service.deleteEmployee(101);
		assertEquals(emp,"employee deleted");
	}

}
