package com.java.collections;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<>();
		hashMap.put(101, "banana");
		hashMap.put(102, "apple");
		hashMap.put(103, "mango");
		hashMap.put(104, "walnut");
		hashMap.put(105, "kiwi");
		System.out.println(hashMap);
		hashMap.remove(101);
		System.out.println(hashMap);
		hashMap.replace(103, "almond");
		System.out.println(hashMap);
		
	}

}
