package com.java8;
interface Addition {
	public int add(int a,int b);
}
public class AddEx {
	public static void main(String[] args) {
		Addition ad=(int a,int b)->(a+b);
		System.out.println(ad.add(12, 25));
	}

}
