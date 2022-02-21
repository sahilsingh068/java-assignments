package com.threading;
class threadName extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is created");
	}
}
public class GetThread {
	public static void main(String[] args) {
		threadName t=new threadName();
		t.start();
		t.setName("sahil's thread");
		Thread.currentThread().setName("singh");
		System.out.println(Thread.currentThread().getName());
	}
}
