package com.Contactus;

import java.sql.Connection;
import java.sql.Statement;

import com.Teacher.DBConnect;


public class ContactUsDBUtil {

	private static boolean isSuccess; // static variable 
	private static Connection con = null; // Static variable for Connection
	private static Statement stmt = null;// Static Variable for Statement

	
	public static boolean insertcontactus(String CUS_FName, String CUS_Email, String CUS_Message) {
		
		isSuccess = false;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
	    	con = DBConnect.getConnection(); // Database Connection
	    	stmt = con.createStatement(); // Create Statement
			
			String sql = "insert into contactus values (0, '"+CUS_FName+"', '"+CUS_Email+"', '"+CUS_Message+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				
				isSuccess = true;
			}
			
			else {
				
				isSuccess = false;
				
			}
		
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
			return isSuccess;
	}
	
} 
		

