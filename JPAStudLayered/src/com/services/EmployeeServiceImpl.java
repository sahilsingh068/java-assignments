package com.services;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao dao;
	public EmployeeServiceImpl()
	{
		dao= new EmployeeDaoImpl();
	}
	

	@Override
	public void addEmployee(Employee employee) {
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		dao.beginTransaction();
		dao.deleteEmployee(employee);
		dao.commitTransaction();
		
	}

	@Override
	public Employee findEmployeeById(int id) {
		Employee employee=dao.getEmployeeById(id);
		return employee;
	}

}
