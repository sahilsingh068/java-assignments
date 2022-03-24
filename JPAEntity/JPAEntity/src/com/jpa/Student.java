package com.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data")
public class Student {
	@Id
	private int stId;
	private String stName;
	private String stAdd;
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStAdd() {
		return stAdd;
	}
	public void setStAdd(String stAdd) {
		this.stAdd = stAdd;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int stId, String stName, String stAdd) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.stAdd = stAdd;
	}
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", stAdd=" + stAdd + "]";
	}
	

}
