package com.java8;
@FunctionalInterface
interface Demo {
	public void demo();
}
public class LambdaEx {
	public static void main(String[] args) {
		int len=10;
		// using lambda expression
		Demo d=()-> {
			System.out.println("length is:"+len);
		};
		d.demo();
	}

}
