package com.java8;
import java.util.function.Predicate;
public class EvenOdd {
	public static void main(String[] args) {
		Predicate<Integer> objPredicate=x->(x%2==0);
		System.out.println(objPredicate.test(10));
	}

}
