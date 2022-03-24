 package com.springanotations.SpringAnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private int hNo;
	private String colony;
	private String district;
	private String state;
	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	//@Autowired
	public void setState(String state) {
		this.state = state;
	}
	public Address(int hNo, String colony, String district, String state) {
		super();
		this.hNo = hNo;
		this.colony = colony;
		this.district = district;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", colony=" + colony + ", district=" + district + ", state=" + state + "]";
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}

}
