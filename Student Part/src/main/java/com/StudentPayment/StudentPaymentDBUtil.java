package com.StudentPayment;

import java.sql.Connection;
import java.sql.Statement;

import com.Student.DBConnect;

public class StudentPaymentDBUtil {

	private static boolean isSuccess; // static variable 
	private static Connection con = null; // Static variable for Connection
	private static Statement stmt = null; // Static Variable for Statement
	
	public static boolean insertstudentpayment(String PayHName, String PayCNumber, String PayDate, String PayCVV, String PayAmount) {
		
	isSuccess = false; 
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
	    	con = DBConnect.getConnection(); // Database Connection
	    	stmt = con.createStatement(); // Create Statement
			
	    	String sql = "INSERT INTO studentpayment values (0,'"+PayHName+"', '"+PayCNumber+"', '"+PayDate+"','"+PayCVV+"', '"+PayAmount+"')";
	    	int rs = stmt.executeUpdate(sql);
	    	
	    	if(rs > 0) {
	    		
	    		isSuccess = true;
	    	}
	    	
	    	else {
	    		
	    		isSuccess = false;
	    	}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
			return isSuccess;
	}
	
}
