package com.threading;
class Demo extends Thread {
	public void run() {
		System.out.println("Child Priority "+Thread.currentThread().getPriority());
	}
}
public class PriorityEx {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.start();
		d.setPriority(10);
		Thread.currentThread().setPriority(8);
		System.out.println("Main Priority "+Thread.currentThread().getPriority());
	}

}
