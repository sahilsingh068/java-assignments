package com.threading;
class Demo3 extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("thread started "+Thread.currentThread().getName());
			Thread.yield();
		}
		
		
	}
}
public class YieldEx {
	public static void main(String[] args) {
		Demo3 d=new Demo3();
		d.start();
		for(int i=0;i<5;i++) {
			System.out.println("thread started "+Thread.currentThread().getName());
		}
		
	}

}
