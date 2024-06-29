package com.Teacher; // Teacher Package

import java.sql.Connection; //Import Java connection
import java.sql.ResultSet;
import java.sql.Statement;



public class TeacherDBUtil { //Beginning of Teacher DB Utility Class

	private static boolean isSuccess; // Static Variables
	private static Connection con = null; // Static Variables
	private static Statement stmt = null; // Static Variables
	private static ResultSet rs = null; // Static Variables
	
	public static boolean validate (String TEmail, String TPassword) { // Student validate Email and password
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
		    	con = DBConnect.getConnection(); // Database Connection
		    	stmt = con.createStatement(); // Create Statement
				
				String sql = "SELECT * FROM teachers WHERE TEmail = '"+TEmail+"' AND TPassword = '"+TPassword+"'";
				rs = stmt.executeQuery(sql); //Execute Sql Query
				
				if(rs.next()) {
					
				   //print Email and Password catch the condition true
					isSuccess = true;
				}
				
				else {
					
					//print Email and Password catch the condition fales
					isSuccess = false;
					
					
				}
				
				
			}catch(Exception e) {
				
				e.printStackTrace();
			}
		
			return isSuccess;
	}
	
	//Static get teacher method
	
		public static Teacher getTeacher(String TEmail) {
			
		Teacher teacher = new Teacher(); // Create the object for teacher class
			
				try {
					
					Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
			    	con = DBConnect.getConnection(); // Database Connection
			    	stmt = con.createStatement(); // Create Statement
					String sql = "SELECT * FROM teachers WHERE TEmail = '"+TEmail+"'";
					rs =stmt.executeQuery(sql); //Execute Query
					
					while(rs.next()) {
						
					teacher.setTID(rs.getInt("TID")); //get from database
					teacher.setTName(rs.getString("TName")); //get from database
					teacher.setTEmail(rs.getString("TEmail")); //get from database
					teacher.setTNIC(rs.getString("TNIC")); //get from database
					teacher.setTContact(rs.getString("TContact")); //get from database
					teacher.setTLocation(rs.getString("TLocation")); //get from database
					teacher.setTGender(rs.getString("TGender")); //get from database
					teacher.setTdob(rs.getString("Tdob"));	//get from database		 		
					teacher.setTPassword(rs.getString("TPassword")); //get from database
					
			}
					
									
				}catch (Exception e) {
					
					e.printStackTrace();
				}
			
				return teacher;
		}	
		
		
		public static boolean updateTeacher(String TID, String TName,String TEmail, String TNIC,String TContact,String TLocation,String TGender,String Tdob,String TPassword) {
			
			try { // Exception Handling
				System.out.println("147");
				
				Class.forName("com.mysql.jdbc.Driver");
		    	con = DBConnect.getConnection(); // Database Connection
		    	stmt = con.createStatement(); // Create Statement
			
		    	String sql = "UPDATE teachers SET TName = '"+TName+"', TEmail = '"+TEmail+"', TNIC = '"+TNIC+"', TContact = '"+TContact+"', TLocation = '"+TLocation+"', TGender = '"+TGender+"', Tdob = '"+Tdob+"', TPassword = '"+TPassword+"' WHERE TID = '"+TID+"'";	
		    	
		    	int rs = stmt.executeUpdate(sql);
		    	
		    	System.out.println("123");
			
		    	if(rs>0) { //Check condition 
				
		    		isSuccess = true; //return true
				
		    	}
		    	
		    	else {
		    		isSuccess = false; //return true
				
		    	}
				
				
				}catch (Exception e) { // Exception
				
					e.printStackTrace(); // Print Exception
				
				}
				
			
				return isSuccess;
		
		}	//End of Teacher DB Utility Class
		
}
