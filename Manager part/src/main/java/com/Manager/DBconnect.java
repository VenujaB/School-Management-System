package com.Manager;//helper class

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	
	
	private static String url="jdbc:mysql://localhost:3306/manager";
	private static String UserName="root";
	private static String Password="Audit1234@";
	private static Connection con;
	
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");//driver manager
			
			con=DriverManager.getConnection(url,UserName,Password);//getting connection
				
		}catch(Exception e) {
			
			System.out.println("Database connection is not success"+e);
			
		}
		
		
		return con;//returning connection
		
	}
	

}
