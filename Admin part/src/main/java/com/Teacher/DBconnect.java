package com.Teacher;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	
	
	private static String url="jdbc:mysql://localhost:3306/admin2";
	private static String UserName="root";
	private static String Password="Shanuka321!";
	private static Connection con;
	
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection(url,UserName,Password);
				
		}catch(Exception e) {
			
			System.out.println("Database connection is not success");
			
		}
		
		
		return con;
		
	}
	

}