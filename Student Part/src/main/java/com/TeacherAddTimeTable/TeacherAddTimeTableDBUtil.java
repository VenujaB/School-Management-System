package com.TeacherAddTimeTable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Student.DBConnect;


public class TeacherAddTimeTableDBUtil {

	private static boolean isSuccess; // static variable 
	private static Connection con = null; // Static variable for Connection
	private static Statement stmt = null;// Static Variable for Statement
	private static ResultSet rs = null;
	
	public static boolean insertTimeTable(String ModuleID, String Grade, String Time, String Date) {
		
	isSuccess = false; 
		

		try {
			
			Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
	    	con = DBConnect.getConnection(); // Database Connection
	    	stmt = con.createStatement(); // Create Statement
			
	    	String sql = "INSERT INTO timetable values (0,'"+ModuleID+"', '"+Grade+"', '"+Time+"','"+Date+"')";
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
		
			public static List<TeacherAddTimeTable> getView(){
				
				ArrayList<TeacherAddTimeTable> timetable = new ArrayList<>();
				   
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
			    	con = DBConnect.getConnection(); // Database Connection
			    	stmt = con.createStatement(); // Create Statement
					String sql = "select * from timetable";
					rs=stmt.executeQuery(sql);
					
					while(rs.next()) {
						
						
						
						int id=rs.getInt(1);
						String ModuleID =rs.getString(2);
						String Grade=rs.getString(3);
						String Time =rs.getString(4);
						String Date=rs.getString(5);
						
						
						TeacherAddTimeTable tat =new TeacherAddTimeTable(id,ModuleID,Grade,Time,Date);
						
						
						timetable.add(tat);
						 System.out.println(timetable);
						}
					
					
					
					}catch(Exception e) {
					
					e.printStackTrace();
					
					}
				
					return timetable;
		}
			
			
			public static boolean viewAll() {
				
				try {

					Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
			    	con = DBConnect.getConnection(); // Database Connection
			    	stmt = con.createStatement(); // Create Statement
				
			    	String sql = "select * from timetable";
			    	rs=stmt.executeQuery(sql);
				
			    	if(rs.next()) {
					
					isSuccess=true;
					
			    	}
			    	else {
					
					isSuccess=false;}
				
				
					}catch(Exception e) {
				
						e.printStackTrace();
				
					}
				
				return isSuccess;
			}
}
