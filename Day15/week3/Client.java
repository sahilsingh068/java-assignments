package com.week3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Client {
	public static void main(String[] args) {
		HashMap<Integer, Employee> empHashMap=new HashMap<>();
		int eid=100;
		while(true) {
			System.out.println("Employee Management Application");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.get Employee Info");
			System.out.println("4.get All Employee");
			System.out.println("5.Delete Employee");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter details of employee");
				System.out.println("Enter employee name");
				String empName=sc.next();
				System.out.println("Enter phone number");
				int phNum=sc.nextInt();
				System.out.println("Enter salary");
				int empSal=sc.nextInt();
				System.out.println("Enter Address");
				String empAdd=sc.next();
				Employee emp=new Employee(empName, phNum, empSal, empAdd);
				empHashMap.put(++eid, emp);
				System.out.println("Employee added successfully!!!!!"+eid);
				break;
			}
            case 2: {
            	System.out.println("Enter to details to update employee data");
            	System.out.println("Enter ID to update");
            	int eId=sc.nextInt();
            	System.out.println("Enter name");
            	String empName1=sc.next();
            	System.out.println("Enter phone number");
            	int phNum1=sc.nextInt();
            	System.out.println("Enter salary");
            	int empSal1=sc.nextInt();
            	System.out.println("Enter address");
            	String empAdd1=sc.next();
            	Employee emp1=new Employee(empName1, phNum1, empSal1, empAdd1);
            	empHashMap.put(eId, emp1);
            	System.out.println("Employee Details Updated Successfully"+eId);
				break;
			}
            case 3: {
            	System.out.println("Enter employee id for details");
            	int eId1=sc.nextInt();
            	Employee objEmployee=empHashMap.get(eId1);
            	System.out.println(objEmployee);
				break;
			}
            case 4: {
            	Set<Entry<Integer, Employee>> resEntries=empHashMap.entrySet();
            	Iterator<Entry<Integer,Employee>> itr=resEntries.iterator();
            	while(itr.hasNext()) {
            		Entry<Integer, Employee> finalResult=itr.next();
            		System.out.println(finalResult.getKey()+" "+finalResult.getValue());
            	}
				
				break;
			}
            case 5: {
            	System.out.println("Enter Id to employee");
            	int eId2=sc.nextInt();
            	Employee eobj=empHashMap.remove(eId2);
            	System.out.println("Employee Deleted"+eId2);
				
				break;
			}

			default:
				System.out.println("Wrong Selection---------");
			}
			
		}
	}

}
