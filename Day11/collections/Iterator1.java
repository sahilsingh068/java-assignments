package com.collections;
//import java.util.Iterator;
//import java.util.ArrayList;
import java.util.*;
public class Iterator1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("I");
		list.add("live");
		list.add("in");
		list.add("Jammu");
		list.add("and");
		list.add("Kashmir");
		System.out.println("List before iterator: "+list);
		Iterator itr=list.iterator();
		System.out.println("Iterator with values");
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		
	}

}
