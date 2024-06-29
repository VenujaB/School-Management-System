package com.Contactus; // Package of Contact us

import java.sql.Connection; // Import Java SQl Connection
import java.sql.Statement;  // Import Java SQl Statement

import com.Student.DBConnect; // Create a class Database Connection Helper class


public class ContactUsDBUtil { // Beginning of Contact Us DB Utility  Class

	private static boolean isSuccess; // static variable 
	private static Connection con = null; // Static variable for Connection
	private static Statement stmt = null;// Static Variable for Statement

	// Beginning of the static  Insert Contact Us Method
	public static boolean insertcontactus(String CUS_FName, String CUS_Email, String CUS_Message) {
		
		isSuccess = false; 
		
		try { // Beginning of the Try catch block
			
			Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
	    	con = DBConnect.getConnection(); // Database Connection
	    	stmt = con.createStatement(); // Create Statement
			// Sql Query
			String sql = "insert into contactus values (0, '"+CUS_FName+"', '"+CUS_Email+"', '"+CUS_Message+"')";
			int rs = stmt.executeUpdate(sql); // Execute the sql statement
			
			if(rs > 0) { 
				
				isSuccess = true; // Return true
			}
			
			else {
				
				isSuccess = false; // Return False
				
			}
		
			
		}catch (Exception e) { // Catch Exception
			
			e.printStackTrace();
		}  // End of the try catch block
		
			return isSuccess;
	}   // End of the Insert Contact Us Method
	 
}   // End of Contact Us DB Utility  Class
		

