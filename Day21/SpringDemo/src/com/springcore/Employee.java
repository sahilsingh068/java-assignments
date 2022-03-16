package com.springcore;

public class Employee { //pojo class
	private int empId;
	private String empName;
	private int empSal;
	private String empAdd;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) { //100
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) { //sahil
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) { //1234
		this.empSal = empSal;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) { //jaipur
		this.empAdd = empAdd;
	}
	public Employee(int empId, String empName, int empSal, String empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}
	public Employee() {
		
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}
	
}
