package com.java8;
import java.util.function.Predicate;
public class LengthOfString {
	public static void main(String[] args) {
		Predicate<String> p = t -> t.length()>6;
		System.out.println(p.test("sahil"));
	}

}
