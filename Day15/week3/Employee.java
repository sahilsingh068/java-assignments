package com.week3;

public class Employee {
	
	private String empName;
	private int phNum;
	private int empSal;
	private String address;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getPhNum() {
		return phNum;
	}
	public void setPhNum(int phNum) {
		this.phNum = phNum;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", phNum=" + phNum + ", empSal=" + empSal + ", address=" + address
				+ "]";
	}
	public Employee() {
		
	}
	public Employee(String empName, int phNum, int empSal, String address) {
		super();
		this.empName = empName;
		this.phNum = phNum;
		this.empSal = empSal;
		this.address = address;
	}
	
	

}
