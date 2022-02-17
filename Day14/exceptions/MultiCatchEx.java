package com.exceptions;

public class MultiCatchEx {
	public static void main(String[] args) {
		try {
			int a[]=new int[3];
			a[4]=50/2;			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of memory occurs");
			// TODO: handle exception
		}
		catch (Exception e) {
			System.out.println("Parent Exceptions occurs");
			// TODO: handle exception
		}
		System.out.println("Rest of code");
		
		
	}

}
