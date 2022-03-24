package com.rt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.Employee;
import com.rt.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/addEmployee") //http://localhost:4000/employee/addEmployee
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	@GetMapping("/getEmployee/{eid}")
	public Optional<Employee> getEmployee(@PathVariable("eid")int empId) {
		return service.getEmployee(empId);
	}
	@GetMapping("/getAllEmployee")
	public Iterable<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
	@DeleteMapping("/deleteEmployee/{eid}")
	public void deleteEmployee(@PathVariable("eid")int empId) {
		 service.getEmployee(empId);
	}

}
