package com.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	public static void main(String[] args) throws IOException{
		FileWriter fileWriter=new FileWriter("buffer.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write("welcome to ATCS");
		bufferedWriter.close();
		System.out.println("successfully");
	}
	

}
