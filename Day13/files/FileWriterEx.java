package com.files;
import java.io.IOException;
import java.io.FileWriter;

public class FileWriterEx  {
	public static void main(String[] args) throws IOException{
		FileWriter fWriter=new FileWriter("hello.txt");
		fWriter.write("hey");
		fWriter.write("data");
		fWriter.write("inserted");
		fWriter.write("in");
		fWriter.write("file");
		fWriter.close();
		System.out.println("written successfully");
		
		
	}

}
