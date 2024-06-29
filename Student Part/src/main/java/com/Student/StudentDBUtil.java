
package com.Student; // Student Package

import java.sql.Connection; // Import Java Connection
import java.sql.ResultSet; // Import Java ResultSet
import java.sql.Statement; // Import java Statment



public class StudentDBUtil { // Beginning of Student DB Utility  Class

		// Created Static Variable and its keep track of information an entire class
	
		private static boolean isSuccess; // Static Variables
		private static Connection con = null; // Static Variables
		private static Statement stmt = null; // Static Variables
		private static ResultSet rs = null; // Static Variables
		
		// Beginning of the static boolean validate Method
	
		public static boolean validate(String SEmail, String SPassword) { // Student validate Email and password
			// Singleton design pattern
			
			
			try { // Beginning of the try catch block
				
				Class.forName("com.mysql.jdbc.Driver"); // Connect jdbc driver
				con = DBConnect.getConnection(); // Connect to DBConnect class and get connection
				stmt = con.createStatement(); // Create statement
				
				// SQL Query for Email and Password
				String sql = "SELECT * FROM students WHERE  SEmail = '"+SEmail+"' AND  SPassword ='"+SPassword+"'";
				rs = stmt.executeQuery(sql); // Execute Sql Query
				
				if(rs.next()) {
					
					// print Email and Password  catch the condition true
					isSuccess = true;																 
				}
				
				else {
					
					// print F Email and F Password  catch the condition false
					
					isSuccess = false;
				}
				
			}catch(Exception e) { // Catch the Exception
				
				e.printStackTrace(); // Print Exception
			}  // End of the try catch block
			
				return isSuccess; // Return isSuccess
			
	} // End of the static boolean validate Method
		
		
		// Beginning of the static get student method
		
		public static Student getStudent(String SEmail) { 
					
		Student student = new Student(); // Create the object for student class
			
					
			try { // Beginning of the try catch block
					
					con = DBConnect.getConnection(); // Get connection from helper class
					stmt = con.createStatement(); // Create Statement
					
					// Sql Query
					String sql = "SELECT * FROM students WHERE SEmail = '"+SEmail+"'";
					rs = stmt.executeQuery(sql); // Execute Query
					
					while(rs.next()) {
						
					student.setSID(rs.getInt("SID")); // Get id from Database 
					student.setSName(rs.getString("SName")); // Get student name from Database 
					student.setSEmail(rs.getString("SEmail")); // Get student email from Database 
					student.setSContact(rs.getString("SContact")); // Get student contact from Database 
					student.setSLocation(rs.getString("SLocation"));; // Get student location from Database 
					student.setSGender(rs.getString("SGender")); // Get student gender from Database 
					student.setSdob(rs.getString("Sdob")); // Get student date of birth from Database 
					student.setSPassword(rs.getString("SPassword")); // Get student password from Database 
								
					}
								
				
			}catch (Exception e) { // Exception
				
				e.printStackTrace(); // Print Exception
			} // End of try catch block
			
				return student; // Return Student object
		}  // End of the static get student method
	
	
	//Beginning of the update Student method	
		public static boolean updatestudent(String SID, String SName, String SEmail, String SContact, String SLocation, String Sdob, String SGender, String SPassword) {
						
			try { // Beginning of the try catch block
			
			Class.forName("com.mysql.jdbc.Driver"); // JDBC Driver connect
			con = DBConnect.getConnection(); // Get connection from helper class
			stmt = con.createStatement(); // Create statement
			// Sql Query
			String sql = "update students set SName= '"+SName+"', SContact = '"+SContact+"', SEmail = '"+SEmail+"', SLocation = '"+SLocation+"', Sdob = '"+Sdob+"', SGender = '"+SGender+"', SPassword = '"+SPassword+"' where SID= '"+SID+"'";
			int rs = stmt.executeUpdate(sql);	 // Execute Query
			
			if(rs>0) { // Check condition
				
				isSuccess = true; // Return true
				
			}
			else {
				isSuccess = false;  // Return false
				 
			}
						
			}catch (Exception e) { // Exception 
				
				e.printStackTrace(); // Print Exception
				
			}  // End of the try catch block
				
			
			return isSuccess; // Return isSucces boolean value true or false
			
		} //End of the update Student method
		 
		 
 } // End of Student DB Utility  Class
		
		
		
		
		

