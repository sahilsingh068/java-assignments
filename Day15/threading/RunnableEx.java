package com.threading;
class RunnableEx implements Runnable {
	public void run() {
		System.out.println("child thread");
	}
	public static void main(String[] args) {
		Runnable r1=new RunnableEx();
		Thread t1=new Thread(r1);
		t1.start();
	}
}

	


