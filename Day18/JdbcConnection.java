package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username: ");
		String userName=sc.next();
		System.out.println("Enter password: ");
		String password=sc.next();
		Class.forName("org.postgresql.Driver");
		Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost/task","postgres","postgres");
		// Statement stmt=conn.createStatement();
		
		 // create table
		// boolean result=stmt.execute("create table media(userName varchar(50),password varchar(40))");
		// System.out.println("Table created:"+result);
		//  int result=stmt.executeUpdate("insert into media values ('sahil','singh@123')");
		 // System.out.println("insert record" +result);
		 PreparedStatement stmt=conn.prepareStatement("select * from media where userName=? and password=?");
		 stmt.setString(1, userName);
		 stmt.setString(2, password);
		 
		 
		 ResultSet result=stmt.executeQuery();
		 if(result.next()) {
			 System.out.println("Login success!!!!!");
		 } else {
			 System.out.println("Login failed------\n enter correct credentails");
		 }
		 conn.close();
		 
	
	}

}
