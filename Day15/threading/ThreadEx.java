package com.threading;

class MyThread extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child thread");
		}
	
	}
}
public class ThreadEx {
	public static void main(String[] args) {
		MyThread m1=new MyThread();
		m1.start();
		System.out.println("main thread");
	}

}
