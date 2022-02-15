package com.java.collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//import javax.naming.spi.DirStateFactory.Result;

public class EntrySetEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap=new TreeMap<>();
		treeMap.put(1000, "sahil");
		treeMap.put(1001, "singh");
		treeMap.put(1002, "manhas");
		treeMap.put(1003, "raghu");
		System.out.println(treeMap);
		Set<Entry<Integer,String>> res=treeMap.entrySet();
		Iterator itr=res.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
