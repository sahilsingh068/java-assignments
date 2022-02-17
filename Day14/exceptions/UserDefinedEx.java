package com.exceptions;
class MyException extends Exception {
	private int age;
	public MyException(int age) {
		this.age=age;
	}
	public String toString() {
		return "Not eligible to vote";
	}
}
public class UserDefinedEx {
	static void validate(int age) throws MyException {
		if(age<18) {
			System.out.println("Not eligible");
		}
		else {
			System.out.println("Eligible");
		}
		
	}
	public static void main(String[] args) throws MyException {
		UserDefinedEx.validate(12);
		System.out.println("Rest of code");
		
	}
	

}
