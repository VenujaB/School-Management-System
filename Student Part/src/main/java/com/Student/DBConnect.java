package com.Student; // Package


import java.sql.Connection; // Import sql Connection
import java.sql.DriverManager; // Import sql Driver Manager

public class DBConnect { // Beginning of the DB Connect Class (Helper Class)

	private static String url = "jdbc:mysql://localhost:3306/woodlandinternationalschool"; // database Url
	private static String userName = "root"; // Database user name;
	private static String password = "123456789"; // Database password
	private static Connection con; // return object connection method
	
	public static Connection getConnection() { // get connection method
		
		try { // Beginning of Try catch block
			
			Class.forName("com.mysql.jdbc.Driver"); // jdbc driver connection 
			con = DriverManager.getConnection(url, userName, password);
			
			
		}catch(Exception e) { // catch block
			
		System.out.println("Database Not Connected"); // if connection not Successful display message;
		} // End of Try catch block
		
		return con; // return con
	}
	
}  // End of the DB Connect Class (Helper Class)
