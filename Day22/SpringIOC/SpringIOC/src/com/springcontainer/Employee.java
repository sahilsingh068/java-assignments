package com.springcontainer;

public class Employee {
	private int empid;
	private String empname;
	private int empsal;
	public int getEmpid() {
		return empid;
	}
	Address address;
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, int empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
	}
	

}
