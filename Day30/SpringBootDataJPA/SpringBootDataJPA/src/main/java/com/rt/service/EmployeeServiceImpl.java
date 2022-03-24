package com.rt.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dao.EmployeeDao;
import com.rt.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	@Override
	public Employee addEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		dao.deleteById(empId);
	}

	@Override
	public Optional<Employee> getEmployee(int empId) {
		return dao.findById(empId);
	}

	@Override
	public Iterable<Employee> getAllEmployee() {
		return dao.findAll();
	}

}
