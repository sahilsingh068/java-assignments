package com.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employ {
	String name;
	int salary;
}
public class Employee {
	public static void main(String[] args) {
		Employ emp=new Employ();
		ArrayList<Employ> list=new ArrayList<>();
		emp.name="sahilsingh";
		emp.salary=10000;
		Predicate<Employ> p=emp1->emp.salary>7000;
		System.out.println(p.test(emp));
	}

}
