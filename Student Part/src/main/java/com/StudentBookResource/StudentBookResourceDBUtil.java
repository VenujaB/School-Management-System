package com.StudentBookResource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Student.DBConnect;

public class StudentBookResourceDBUtil { // Beginning of the Student BookResource DB Utility class

	private static boolean isSuccess; // static variable 
	private static Connection con = null; // Static variable for Connection
	private static Statement stmt = null;// Static Variable for Statement
	private static ResultSet rs;
	
	// Beginning Insert Book Resource Method
	public static boolean insertbookresource(String ResourceID, String StuName, String StuEmail, String StuMobile, String ResourceType, String BookDate, String BookTime) {
		
		isSuccess = false; 
		
		try { // Beginning of the try catch block
			
			Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
	    	con = DBConnect.getConnection(); // Database Connection
	    	stmt = con.createStatement(); // Create Statement
			// Sql Query
	    	String sql = "INSERT INTO bookresource values (0,'"+ResourceID+"', '"+StuName+"', '"+StuEmail+"','"+StuMobile+"', '"+ResourceType+"', '"+BookDate+"', '"+BookTime+"')";
	    	int rs = stmt.executeUpdate(sql);
	    	
	    	if(rs > 0) { // Check condition
	    		
	    		isSuccess = true; // Return true
	    	}
	    	
	    	else {
	    		
	    		isSuccess = false; // Return true
	    	}
			
		}catch(Exception e) { // Exception 
			
			e.printStackTrace(); // Print Exception
			
		} // End of the try catch block
		
		return isSuccess; // Return isSucces boolean value true or false
		
	}// End Insert Book Resource Method
	
		// Beginning of the Get Resource Book Method
	
		public static List<StudentBookResource> getResourceBook(String StuEmail){
		
			// Array list
				ArrayList<StudentBookResource> booking =new ArrayList<>();
		   
		
				try { // Beginning of the try catch block
			
					Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
			    	con = DBConnect.getConnection(); // Database Connection
			    	stmt = con.createStatement(); // Create Statement
					String sql = "select * from bookresource where StuEmail='"+StuEmail+"'";
					rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int id=rs.getInt(1);
				String ResourceID=rs.getString(2);
				String StuName=rs.getString(3);
				String stuEmail =rs.getString(4);
				String StuMobile=rs.getString(5);
				String ResourceType=rs.getString(6);
				String BookDate=rs.getString(7);
				String BookTime=rs.getString(8);
				
				StudentBookResource  bookresource = new  StudentBookResource(id,ResourceID,StuName,stuEmail,StuMobile,ResourceType,BookDate,BookTime);
				
				booking.add(bookresource);
				
			}
			
		}catch(Exception e) { // Exception
			
			e.printStackTrace();  // Print Exception
			
		} // End of the try catch block
		
		return booking; // Return Booking
			
		}	 // End of the Get Resource Book Method
		
		
			// Beginning of view booking method
		
		public static boolean viewBooking(String StuEmail) {
			
			try { // Beginning of the try catch block
						
						
						Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
						con = DBConnect.getConnection(); // Database Connection
						stmt = con.createStatement();
						String sql = "select * from bookresource where StuEmail='"+StuEmail+"'";
						rs=stmt.executeQuery(sql);
						
						if(rs.next()) { // Check condition
							
							isSuccess=true; // Return true
							
						}
						else {
							
							isSuccess=false; // Return false
							
						} 
						
						
					}catch(Exception e) { // Exception 
						
						e.printStackTrace(); // Print Exception
						
					} // End of the try catch block
					
					return isSuccess; // Return isSucces boolean value true or false
					
		}	// End of the try catch block
		
		
		// Beginning of the Update Booking method
		
		public static boolean updateBooking(String ResourceID , String StuName ,String StuEmail , String StuMobile , String ResourceType ,  String BookDate , String BookTime) {
			
			try { // Beginning of the try catch block
				
				
				
				Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
				con = DBConnect.getConnection(); // Database Connection
				stmt = con.createStatement();
				// Sql Query
				String sql= "Update bookresource set ResourceID='"+ResourceID+"' , StuName='"+StuName+"', StuEmail = '"+StuEmail+"',  StuMobile ='"+StuMobile+"' , ResourceType ='"+ResourceType+"' ,BookDate='"+BookDate+"', BookTime ='"+BookTime+"' "+"where ResourceID='"+ResourceID+"'";
				int rs=stmt.executeUpdate(sql); // Execute Query
				
				if(rs>0) { // Check condition
					
					
					isSuccess=true; // Return true
				}
				
				else {
					
					isSuccess=false; // Return false
					
				}
				
				
			}catch(Exception e) { // Exception 
				
				e.printStackTrace(); // Print Exception
				
			}  // End of the try catch block
			
				return isSuccess; // Return isSucces boolean value true or false
				
		} // End of the try catch block
		
		
		// Beginning of the Book Resource Delete Method
		
		public static boolean BookResourceDelete(String ResourceID) {
			
			
			
			try { // Beginning of the try catch block
				
				Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
				con = DBConnect.getConnection(); // Get connection from helper class
				stmt = con.createStatement(); // Create statement
				// Sql Query
				String sql="delete from bookresource where ResourceID ='"+ResourceID+"'";
				int rs=stmt.executeUpdate(sql);  // Execute Query
				
				if(rs>0) { // Check condition
					
					isSuccess=true; // Return true
					
				}else 
				{
					isSuccess=false; // Return false
					
				}
				
				
			}catch(Exception e) { // Exception 
				
				e.printStackTrace(); // Print Exception
				
			} // End of the try catch block
			
			
			return isSuccess; // Return isSucces boolean value true or false
			
		} // End of the Book Resource Delete Method
		

		// Beginning of the Get book Resource Method
		public static List<StudentBookResource> getBookResource(String ResourceID){
			
			
			ArrayList<StudentBookResource> stuBR =new ArrayList<>();
			
			
			try { // Beginning of the try catch block
				
				Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
				con = DBConnect.getConnection(); // Get connection from helper class
				stmt = con.createStatement(); // Create statement
				// Sql Query
				String sql="select * from bookresource where ResourceID='"+ResourceID+"'";
				rs=stmt.executeQuery(sql); // Execute Query
				
				while(rs.next()) { // Check condition
					
					int id=rs.getInt(1);
					String resourceID=rs.getString(2);
					String StuName=rs.getString(3);
					String StuEmail=rs.getString(4);
					String StuMobile=rs.getString(5);
					String ResourceType=rs.getString(6);
					String BookDate=rs.getString(7);
					String BookTime=rs.getString(8);
					
					// Create instance variable 
					
					StudentBookResource sbr = new StudentBookResource(id ,resourceID ,StuName,StuEmail,StuMobile,ResourceType,BookDate,BookTime);
					stuBR.add(sbr); // Store all details in object
					
			}
				
				
			}catch(Exception e) { // Exception 
				
				e.printStackTrace(); // Print Exception	 	
			}// End of the try catch block
			
			return stuBR; // Return StudentBookResource
			
			
		} // End of the Get book Resource Method
		
		
} // End of the Student BookResource DB Utility class
