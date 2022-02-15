package com.java.collections;

import java.util.HashMap;

public class KeySetEx {
	public static void main(String[] args) {
		HashMap<Integer, String> priceHashMap=new HashMap<>();
		priceHashMap.put(1200, "jeans");
		priceHashMap.put(1300, "shirt");
		priceHashMap.put(1400, "trousers");
		priceHashMap.put(1500, "jacket");
		System.out.println(priceHashMap);
		System.out.println(priceHashMap.keySet());
	}
	

}
