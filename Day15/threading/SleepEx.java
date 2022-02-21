package com.threading;

public class SleepEx {
	public static void main(String[] args) {
		for(int i=0;i<7;i++) {
			System.out.println("Show will print after the given time spaam: "+i);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
