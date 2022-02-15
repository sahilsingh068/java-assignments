package com.java.collections;

import java.util.PriorityQueue;

public class PriorityQEx {
	public static void main(String[] args) {
		PriorityQueue<String> pQueue=new PriorityQueue<String>();
		pQueue.add("sahil");
		pQueue.add("rivanshu");
		pQueue.add("rishabh");
		pQueue.add("singh");
		System.out.println("head:"+pQueue.element());
		pQueue.remove();
		System.out.println(pQueue);
		for (String string : pQueue) {
			System.out.println(string);
			
		}
				
	}

}
