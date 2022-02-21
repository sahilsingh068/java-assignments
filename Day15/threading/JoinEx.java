package com.threading;
class Test extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(2000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class JoinEx   {
	public static void main(String[] args) throws InterruptedException {
		Test test=new Test();
		test.start();
		test.join(10000);
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
			Thread.yield();
		}
		
	}

}
