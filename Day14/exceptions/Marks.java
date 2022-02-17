package com.exceptions;

public class Marks {
	public void pass(int marks) {
		if(marks<40) {
			System.out.println("You are fail");
		}
		else {
			System.out.println("You are passed");
		}
	}
	public static void main(String[] args) {
		Marks marks=new Marks();
		marks.pass(12);
		System.out.println("Rest of code");
	}

}
