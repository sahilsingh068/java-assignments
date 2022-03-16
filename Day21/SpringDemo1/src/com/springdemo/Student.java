package com.springdemo;


public class Student {
	private int stId;
	private String name;
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int stId, String name) {
		super();
		this.stId = stId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", name=" + name + "]";
	}
	

}
