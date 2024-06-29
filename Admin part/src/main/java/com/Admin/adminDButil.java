package com.Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpSession;



public class adminDButil {
	
	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	
	
	//login validate function
	public static boolean validate(String username , String Password) {
		
		
		
		try {
			
			//database connection using dbconnect class
			
			con= DBconnect.getConnection();
			stmt=con.createStatement();
			
			//selecting values from the database table
			
			String sql = "select * from admin where Username='"+username+"' and PWD='"+Password+"' ";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				
				
				
				
				
				isSuccess=true;
				
			}
			else {
				
				isSuccess=false;}
			
			
		}catch(Exception e) {
			System.out.println("kusername="+username+"\nkPassword="+Password);
			e.printStackTrace();
			
		}
		
		return isSuccess;
			
	}
	
	
	

	public static List<Student> getStudent(String userName){
		
		//creating student array list object
		
		ArrayList<Student> student=new ArrayList<>();
		   
		
		try {
			
			//DB connection
			
			con= DBconnect.getConnection();
			stmt = con.createStatement();
			
			//select the specific details from table
			
			String sql = "select * from student where Username='"+userName+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				//assigning table values into variables
				
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String Phone=rs.getString(4);
				String Address=rs.getString(5);
				String DOB=rs.getString(6);
				String UserU=rs.getString(7);
				String passU=rs.getString(8);
				
				//creating and object using student class
				
				Student s=new Student(id,name,email,Phone,Address,DOB,UserU,passU);
				
				//adding student class object in to the array list
				
				student.add(s);
				
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return student;//returning student array list object
		
	}
	
	public static boolean InsertStudent(String name , String email , String phone ,String address,String birth, String User , String password) {
		
		boolean isSuccess=false;
		
		try {
			
			//db connection
			con= DBconnect.getConnection();
			stmt = con.createStatement();
			
			//inserting values to the table
			
			String sql = "insert into student values(0 , '"+name+"' , '"+email+"' , '"+phone+"' ,'"+address+"','"+birth+"', '"+User+"' , '"+password+"')";
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
	
	public static boolean updateStudent(String id , String name , String email , String phone ,String address, String birth, String username , String password) {
		
		try {
			
			
			
			//DB connection
			
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			
			//updating values in the table
			
			String sql= "Update student set Name='"+name+"' , sEmail='"+email+"' , sPhone='"+phone+"' ,sAddress='"+address+"',sDOB='"+birth+"', Username='"+username+"' , Password='"+password+"'"
					    +"where Username='"+username+"'";
			
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				
				isSuccess=true;
				
			}
			
			else {
			
				isSuccess=false;
				
			}
			
			
		}catch(Exception e) {
			System.out.println("Uddate not  done..catch..!!!");
			e.printStackTrace();
			
		}
		
		return isSuccess;
	}
	
	
	public static List<Student> getAdminStudent(String Username){
		
		
		ArrayList<Student> student=new ArrayList<>();
		
		
		try {
			
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			
			String sql="select * from student where Username='"+Username+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int ID=rs.getInt(1);
				String Name=rs.getString(2);
				String Email=rs.getString(3);
				String Phone=rs.getString(4);
				String Address=rs.getString(5);
				String DOB=rs.getString(6);
				String UserName=rs.getString(7);
				String Password=rs.getString(8);
				
				Student student1=new Student(ID,Name,Email,Phone,Address,DOB,UserName,Password);
				student.add(student1);
				
				
				
			}
			
			
		}catch(Exception e) {
			
			e.printStackTrace();			
		}
		
		return student;
		
		
	}
	
	
	public static boolean viewStudent(String username) {
		
try {
			
			//DB connect
	
			con= DBconnect.getConnection();
			stmt=con.createStatement();
			
			//selecting specific data in the table
			
			String sql = "select * from student where Username='"+username+"'";
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
	
	
	public static boolean AdminStuDelete(String id) {
		
		int ConID=Integer.parseInt(id);
		
		try {
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			
			String sql="delete from student where ID='"+ConID+"'";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				
				isSuccess=true;
				
			}else {isSuccess=false;}
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		return isSuccess;
	}
	
	public static Admin getAdmin1(String username) {  // Need to Change
		
		//connecting object using student class
		
		Admin admin = new Admin();
			
					
			try {
				
				//DB connection
				
					Class.forName("com.mysql.jdbc.Driver");
					con = DBconnect.getConnection();
					stmt = con.createStatement();
					
					//selecting specific data from the table
					
					String sql = "SELECT * FROM admin WHERE Username = '"+username+"'";
					rs = stmt.executeQuery(sql);
					
					while(rs.next()) {
						
						//setting database table values into the manager using setters
						
					admin.setID(rs.getInt("ID"));
					admin.setName(rs.getString("Name"));
					admin.setEmail(rs.getString("Email"));
					admin.setPhone(rs.getString("Phone"));
					admin.setUserName(rs.getString("Username"));
					admin.setPassword(rs.getString("PWD"));
								
					}
				
				
				
			}catch (Exception e) {
				
				e.printStackTrace();
			}
			
				return admin;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////
	public static boolean viewAll() {
		try {
			
			//DB connection
			
		con= DBconnect.getConnection();
		stmt=con.createStatement();
		
		//deleting relevant data in the table
		
		String sql = "select * from admin";
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


public static List<Admin> getView(){
	
	ArrayList<Admin> admin=new ArrayList<>();
	   
	
	try {
		
		con= DBconnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from admin";
		rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String email=rs.getString(3);
			String Phone=rs.getString(4);
			String UserU=rs.getString(5);
			String passU=rs.getString(6);
			
			Admin a=new Admin(id,name,email,Phone,UserU,passU);
			
			admin.add(a);
			
		}
		
	}catch(Exception e) {
		
		e.printStackTrace();
		
	}
	
	return admin;
	
}

public static boolean ViewDelete(String username) {
	
	//int ConID=Integer.parseInt(id);
	
	try {
		con=DBconnect.getConnection();
		stmt=con.createStatement();
		
		String sql="delete from admin where Username='"+username+"'";
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
