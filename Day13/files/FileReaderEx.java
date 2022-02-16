package com.files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException{
		FileReader fReader=new FileReader("hello.txt");
		while(fReader.read()!=-1) {
			char c=(char) fReader.read();
			System.out.println(c);
		}
	}

}
