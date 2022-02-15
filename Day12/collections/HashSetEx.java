package com.java.collections;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Sahil");
		set.add("singh");
		set.add("robins");
		set.add("kumar");
		set.add("rivanshu");
		set.add("bansal");
		System.out.println("List is: "+set);
		HashSet<String> set1=new HashSet<String>();
		set1.add("rangnath");
		set1.add("sewa");
		set.addAll(set1);
		System.out.println("updated list:"+set);
	}

}
