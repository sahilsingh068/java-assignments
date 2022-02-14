package com.collections;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for(int i=0;i<10;i++) {
			a.add(i);
		}
		System.out.println(a);
		System.out.println("FOR EACH LOOP");
		for(Object o:a) {
			System.out.println(o);
		}
		System.out.println("ODD NUMBERS");
		for(int i=0;i<10;i++) {
			if(i%2!=0)
				System.out.println(i);
		}
	}

}
