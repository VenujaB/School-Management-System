package com.TeacherAddMarks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Student.DBConnect;

public class TeacherAddMarksDBUtil {
	
	private static boolean isSuccess; // static variable 
	private static Connection con = null; // Static variable for Connection
	private static Statement stmt = null;// Static Variable for Statement
	private static ResultSet rs = null;

	
	public static boolean insertaddmarks(String StudentID, String StudentName, String ModuleID, String ModuleName, String Marks) {
		
		isSuccess = false;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
	    	con = DBConnect.getConnection(); // Database Connection
	    	stmt = con.createStatement(); // Create Statement
			
			String sql = "insert into marks values (0, '"+StudentID+"', '"+StudentName+"', '"+ModuleID+"', '"+ModuleName+"', '"+Marks+"')";
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
	
		public static boolean viewAll() {
			
		try {

			Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
	    	con = DBConnect.getConnection(); // Database Connection
	    	stmt = con.createStatement(); // Create Statement
		
	    	String sql = "select * from marks";
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
	
		
		public static List<TeacherAddMarks> getView(){
			
			ArrayList<TeacherAddMarks> addmarks = new ArrayList<>();
			   
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
		    	con = DBConnect.getConnection(); // Database Connection
		    	stmt = con.createStatement(); // Create Statement
				String sql = "select * from marks";
				rs=stmt.executeQuery(sql);
				
				while(rs.next()) {
					
					
					
					int ID=rs.getInt(1);
					String StudentID =rs.getString(2);
					String StudentName=rs.getString(3);
					String ModuleID =rs.getString(4);
					String ModuleName=rs.getString(5);
					String Marks=rs.getString(6);
					
					TeacherAddMarks teachaddM =new TeacherAddMarks(ID,StudentID,StudentName,ModuleID,ModuleName,Marks);
					
					
					 addmarks.add(teachaddM);
					 System.out.println(StudentID);
				}
				
				
				
			}catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
			return addmarks;
			
		}
		
		public static boolean updateMarks(String StudentID , String StudentName, String ModuleID , String ModuleName , String Marks) {
			
			try {
				
				
				
				Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
				con = DBConnect.getConnection(); // Database Connection
				stmt = con.createStatement();
				String sql= "Update marks set StudentID ='"+StudentID+"' , StudentName='"+StudentName+"', ModuleID = '"+ModuleID+"',   ModuleName ='"+ ModuleName+"' , Marks ='"+Marks+"' "+"where StudentID ='"+StudentID+"'";
				int rs=stmt.executeUpdate(sql);
				
				if(rs>0) {
					
					
					isSuccess=true;
				}
				
				else {
					
					isSuccess=false;
					
				}
				
				
			}catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
				return isSuccess;
		}
		
	public static List<TeacherAddMarks> getMarks(String StudentID){
	
	ArrayList<TeacherAddMarks> marks =new ArrayList<>();


	try {

		Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
    	con = DBConnect.getConnection(); // Database Connection
    	stmt = con.createStatement(); // Create Statement
		String sql = "select * from marks where StudentID='"+StudentID+"'";
		rs=stmt.executeQuery(sql);

		while(rs.next()) {
	
			int ID=rs.getInt(1);
			String studentID =rs.getString(2);
			String StudentName =rs.getString(3);
			String ModuleID =rs.getString(4);
			String ModuleName =rs.getString(5);
			String Marks=rs.getString(6);
	
	
	
			TeacherAddMarks  tdm = new  TeacherAddMarks(ID,studentID,StudentName,ModuleID,ModuleName,Marks);
	
			marks.add(tdm);
			System.out.println(StudentName);
		}

		}catch(Exception e) {

		e.printStackTrace();

		}

		return marks;
	}
	
	public static boolean MarksDelete(String StudentID) {
			
		try {
			Class.forName("com.mysql.jdbc.Driver"); // JDBC Database Connection
			con = DBConnect.getConnection(); // Database Connection
			stmt = con.createStatement();
			
			String sql="delete from marks where StudentID ='"+StudentID+"'";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				
				isSuccess=true;
				
			}else {isSuccess=false;}
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		return isSuccess;
	}
	
		
}
	
	

