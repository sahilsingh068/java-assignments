package com.rp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp.entity.Employee;
import com.rp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/addEmployee") //
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	@GetMapping("/getEmployee/{eid}")
	public Employee getEmployee(@PathVariable("eid")int empId) {
		return service.getEmployee(empId);
	}
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
	@DeleteMapping("/deleteEmployee/{eid}")
	public Employee deleteEmployee(@PathVariable("eid")int empId) {
		return service.getEmployee(empId);
	}

}
