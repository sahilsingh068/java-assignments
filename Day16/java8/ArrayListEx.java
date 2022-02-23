package com.java8;

import java.util.ArrayList;

interface ArrList {
	public void print();
}
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(123);
		a.add(23);
		a.add(1);
		a.add(12);
		a.add(13);
		a.add(136);
		ArrList ar=()->System.out.println(a);
		ar.print();
	}

}
