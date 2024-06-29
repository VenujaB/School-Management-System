package com.Teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpSession;



public class teacherDButil {
	
	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	
	
	
	public static boolean validate(String username , String Password) {
		
		
		
		try {
			
			
			con= DBconnect.getConnection();
			stmt=con.createStatement();
			
			String sql = "select * from admin where Username='"+username+"' and PWD='"+Password+"' ";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				
				
				
				
				System.out.println("username="+username+"\nPassword="+Password);
				isSuccess=true;
				
			}
			else {
				System.out.println("fusername="+username+"\nfPassword="+Password);
				isSuccess=false;}
			
			
		}catch(Exception e) {
			System.out.println("kusername="+username+"\nkPassword="+Password);
			e.printStackTrace();
			
		}
		
		return isSuccess;
			
	}
	
	
	

	public static List<Teacher> getTeacher(String userName){
		
		ArrayList<Teacher> teacher=new ArrayList<>();
		   
		
		try {
			
			con= DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from teacher where Username='"+userName+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String nic=rs.getString(3);
				String email=rs.getString(4);
				String Phone=rs.getString(5);
				String Address=rs.getString(6);
				String DOB=rs.getString(7);
				String UserU=rs.getString(8);
				String passU=rs.getString(9);
				
				Teacher t=new Teacher(id,name,nic,email,Phone,Address,DOB,UserU,passU);
				
				teacher.add(t);
				
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return teacher;
		
	}
	
	public static boolean InsertTeacher(String name ,String NIC , String email , String phone ,String address,String birth, String User , String password) {
		
		boolean isSuccess=false;
		
		try {
			
			
			con= DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into teacher values(0 , '"+name+"' ,'"+NIC+"', '"+email+"' , '"+phone+"' ,'"+address+"','"+birth+"', '"+User+"' , '"+password+"')";
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
	
	public static boolean updateTeacher(String id , String name ,String NIC, String email , String phone ,String address, String birth, String username , String password) {
		
		try {
			
			System.out.println("Uddate not  done..try..!!!");
			
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			
			String sql= "Update teacher set Name='"+name+"' ,NIC='"+NIC+"', Email='"+email+"' , Phone='"+phone+"' ,Address='"+address+"',DOB='"+birth+"', Username='"+username+"' , Password='"+password+"'"
					    +"where Username='"+username+"'";
			
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				System.out.println("Uddate done....!!!");
				isSuccess=true;
				
			}
			
			else {
				System.out.println("Uddate not  done....!!!");
				isSuccess=false;
				
			}
			
			
		}catch(Exception e) {
			System.out.println("Uddate not  done..catch..!!!");
			e.printStackTrace();
			
		}
		
		return isSuccess;
	}
	
	
	public static List<Teacher> getAdminTeacher(String Username){
		
		
		ArrayList<Teacher> teacher=new ArrayList<>();
		
		
		try {
			
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			
			String sql="select * from teacher where Username='"+Username+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int ID=rs.getInt(1);
				String Name=rs.getString(2);
				String nic=rs.getString(3);
				String Email=rs.getString(4);
				String Phone=rs.getString(5);
				String Address=rs.getString(6);
				String DOB=rs.getString(7);
				String UserName=rs.getString(8);
				String Password=rs.getString(9);
				
				Teacher teacher1=new Teacher(ID,Name,nic,Email,Phone,Address,DOB,UserName,Password);
				teacher.add(teacher1);
				
				
				
			}
			
			
		}catch(Exception e) {
			
			e.printStackTrace();			
		}
		
		return teacher;
		
		
	}
	
	
	public static boolean viewTeacher(String username) {
		
try {
			
			
			con= DBconnect.getConnection();
			stmt=con.createStatement();
			
			String sql = "select * from teacher where Username='"+username+"'";
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
	
	
	public static boolean AdminTeacherDelete(String id) {
		
		int ConID=Integer.parseInt(id);
		
		try {
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			
			String sql="delete from teacher where ID='"+ConID+"'";
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
