package com.dao;

import com.entities.Employee;

public interface EmployeeDao {
	Employee getEmployeeById(int id);
	void addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(Employee employee);
	void commitTransaction();
	void beginTransaction();
	
	

}
