package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	
	
	private static String url="jdbc:mysql://localhost:3306/manager";
	private static String UserName="root";
	private static String Password="Audit1234@";
	private static Connection con;
	
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection(url,UserName,Password);
				
		}catch(Exception e) {
			
			System.out.println("Database connection is not success"+e);
			
		}
		
		
		return con;
		
	}
	

}
