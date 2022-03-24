package com.rp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.dao.EmployeeDao;
import com.rp.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	@Override
	public Employee addEmployee(Employee employee) {
		return dao.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(int empId) {
		return dao.deleteEmployee(empId);
	}

	@Override
	public Employee getEmployee(int empId) {
		return dao.getEmployee(empId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAllEmployees();
	}

}
