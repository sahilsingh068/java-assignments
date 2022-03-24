package com.rt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rt.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	

}
