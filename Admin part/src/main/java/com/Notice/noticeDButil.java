package com.Notice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class noticeDButil {
	
	static boolean isSuccess=false;
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	
	
	
	
	
	
			
			
	
	public static boolean InsertNotice(String notice ) {
		
		
		
		try {
			
			con= DBconnect.getConnection();
			stmt=con.createStatement();
			
			String sql = "insert into notice values(0,'"+notice+"')";
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
	
	
	public static boolean viewAll() {
		try {
			
			//DB connection
			
		con= DBconnect.getConnection();
		stmt=con.createStatement();
		
		//deleting relevant data in the table
		
		String sql = "select * from notice";
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


public static List<Notice> getView(){
	
	ArrayList<Notice> notice=new ArrayList<>();
	   
	
	try {
		
		con= DBconnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from notice";
		rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			
			int id=rs.getInt(1);
			String content=rs.getString(2);
			
			
			Notice n=new Notice(id,content);
			
			notice.add(n);
			
		}
		
	}catch(Exception e) {
		
		e.printStackTrace();
		
	}
	
	return notice;
	
}


}
