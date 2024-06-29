 package com.StudentApply; // Package Student Apply


import java.sql.Connection; // Import java sql Connection 
import java.sql.Statement; // Import java sql Statement

import com.Student.DBConnect; // Import DB Connect 

public class StudentApplyDBUtil { // Beginning of the Student Apply DB Util Class

	private static boolean isSuccess; // static variable 
	private static Connection con = null; // Static variable for Connection
	private static Statement stmt = null; // Static Variable for Statement

	
	
	public static boolean insertapply(String stuAname, String stuAemail, String stuAcontact, String stuAlocation, String stuAgender, 
			String stuAdob, String stuAgname, String stuAgnumber ) { // Beginning Boolean Insert Method
		
     isSuccess = false;  // Boolean 
    
    try { // Beginning of the Try Catch Block
    	
    	Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
    	con = DBConnect.getConnection(); // Database Connection
    	stmt = con.createStatement(); // Create Statement
    	
    	// SQL Query for insert values
    	String sql = "INSERT INTO studentApply values (0, '"+stuAname+"', '"+stuAemail+"', '"+stuAcontact+"', '"+stuAgender+"', '"
    			+ ""+stuAdob+"', '"+stuAgname+"', '"+stuAgnumber+"')";
    	
    	int rs = stmt.executeUpdate(sql); // Execute update database sql
    	
    	if(rs > 0) {
    		
    		isSuccess = true;
    	}
    	
    	else {
    		
    		isSuccess = false;
    	}
    	
    	
    }catch (Exception e) { // Catch Exception
    	
    	e.printStackTrace(); // Display Exception
    }
		
			return isSuccess; // Return isSuccess True or False
	} // End of the Boolean insert method
	
	
} // End of the Student Apply DB Util class
