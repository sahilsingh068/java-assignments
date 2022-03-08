package com.client;

import com.entities.Employee;
import com.services.EmployeeService;
import com.services.EmployeeServiceImpl;

public class Client {
	public static void main(String[] args) {
		EmployeeService service= new EmployeeServiceImpl();
		Employee employee= new Employee(111, "sahil", 80000, "india");
		//ADD VALUES TO DATABASE
//		service.addEmployee(employee);
//		employee=service.findEmployeeById(111);
//		System.out.println("id:" +employee.getEmpId());
//		System.out.println("name :"+employee.getEmpName());
//    	System.out.println("salary :"+employee.getEmpSal());
		
		
    	// UPDATE VALUES TO DATABASE
//    	employee.setEmpName("rivanshu");
//	    employee.setEmpAdd("usa");
//		employee.setEmpSal(30000);
//		
//		service.updateEmployee(employee);
//		
//		 employee=service.findEmployeeById(111);
//		System.out.println("updated id:"+employee.getEmpName());
//		System.out.println("updated id:"+employee.getEmpAdd());
//		System.out.println("updated id:"+employee.getEmpSal());
		// DELETE
		service.deleteEmployee(employee);
		System.out.println("end of program");
	}

}
