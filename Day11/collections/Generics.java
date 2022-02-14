package com.collections;

import java.util.ArrayList;

public class Generics {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println(list);
		for(Object o:list) {
			Integer i=(Integer) o;
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
