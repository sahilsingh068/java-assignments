package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
	public static void main(String[] args) throws IOException{
		FileReader fReader=new FileReader("hello.txt");
		BufferedReader bfReader=new BufferedReader(fReader);
		while(fReader.read()!=-1) {
			char c=(char) fReader.read();
			System.out.println(c);
		}
	}

}
