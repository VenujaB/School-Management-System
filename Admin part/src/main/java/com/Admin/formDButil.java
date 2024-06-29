package com.Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class formDButil {
	
	
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	
	private static String url="jdbc:mysql://localhost:3306/form";
	private static String user="root";
	private static String pass="Shanuka321!";
	
	
	
	
			
			
	
	public static boolean InsertForm(String name , String email , String gender ) {
		
		boolean isSuccess=false;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection(url,user,pass);
			stmt = con.createStatement();
			String sql = "insert into form2 values('"+name+"' , '"+email+"' , '"+gender+"')";
			int rs=stmt.executeUpdate(sql);
			 
			if(rs>0) {
				
				isSuccess=true;
				
			}
			
			else{
				isSuccess=false;
				
			}
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return isSuccess;
	}

}
