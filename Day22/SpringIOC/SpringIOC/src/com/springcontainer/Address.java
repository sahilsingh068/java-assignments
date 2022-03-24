package com.springcontainer;

public class Address {
	private int hNum;
	private String colony;
	private String district;
	private String state;
	public int gethNum() {
		return hNum;
	}
	public void sethNum(int hNum) {
		this.hNum = hNum;
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
	public void setState(String state) {
		this.state = state;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int hNum, String colony, String district, String state) {
		super();
		this.hNum = hNum;
		this.colony = colony;
		this.district = district;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hNum=" + hNum + ", colony=" + colony + ", district=" + district + ", state=" + state + "]";
	}
	

}
