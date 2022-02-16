package com.files;

import java.io.File;
import java.io.IOException;
public class Demo {
	public static void main(String[] args) {
		try {
			File file=new File("D:hello.txt");
			file.createNewFile();
			System.out.println("File created");
			
		} catch (Exception e) {
			System.out.println("error");
			// TODO: handle exception
		}
		
	
	}

}
