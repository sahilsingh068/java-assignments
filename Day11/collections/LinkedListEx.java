package com.collections;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(100);
		li.add("Sahil");
		li.add(true);
		li.add(false);
		li.add(56.7f);
		System.out.println(li.add(199));
		System.out.println("contains: "+li.contains("Sahil"));
		System.out.println("Size: "+li.size());
		System.out.println("First:"+li.getFirst());
		System.out.println("Last: "+li.getLast());
	}

}
