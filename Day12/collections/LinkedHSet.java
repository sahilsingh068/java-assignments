package com.java.collections;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> listHashSet=new LinkedHashSet<>();
		//Using for loop
		for(int i=0;i<10;i++) {
			listHashSet.add(i);
		}
		System.out.println(listHashSet);
		// Using iterator
		Iterator itr=listHashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
