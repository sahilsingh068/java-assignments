package com.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {
	public static void main(String[] args) throws IOException{
		FileWriter fWriter=new FileWriter("welcome.txt");
		PrintWriter pWriter=new PrintWriter(fWriter);
		pWriter.write("hey");
		pWriter.write("i");
		pWriter.write("am");
		pWriter.write("sahil");
		pWriter.write("singh");
		pWriter.write(10);
		pWriter.close();
		System.out.println("data is inserted");
	}

}
