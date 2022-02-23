package com.java8;
interface Square {
	public void square(int n);
}
public class SquareRoot {
	public static void main(String[] args) {
		Square s=n-> System.out.println("Square root:"+Math.sqrt(n));
		s.square(5);
	}

}
