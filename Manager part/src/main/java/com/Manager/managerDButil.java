package com.Manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpSession;



public class managerDButil {
	
	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	
	
	//Login Validate function
	public static boolean validate(String username , String Password) {
		
		
		
		try {
			
			//Database connection using DBconnect class
			con= DBconnect.getConnection();
			stmt=con.createStatement();
			
			////selecting values from the database table
			
			String sql = "select * from manager_details where Username='"+username+"' and Password='"+Password+"' ";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				
				isSuccess=true;
				
			}
			else {
				
				isSuccess=false;}
			
			
		}catch(Exception e) {
			System.out.println("kusername="+username+"\nkPassword="+Password);
			e.printStackTrace();//display relevent 
			
		}
		
		return isSuccess;
			
	}
	
	
	

	public static List<Employee> getEmployee(String userName){
		
		//creating employee arraylist object
		
		ArrayList<Employee> emp=new ArrayList<>();
		   
		
		try {
			//DB connection
			con= DBconnect.getConnection();
			stmt = con.createStatement();
			
			//select the specific details from table
			
			String sql = "select * from na_employee where Username='"+userName+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				//assigning table values in to variables
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String NIC=rs.getString(3);
				String email=rs.getString(4);
				String Phone=rs.getString(5);
				String DOB=rs.getString(6);
				String UserU=rs.getString(7);
				String passU=rs.getString(8);
				
				//creating an object using Employee class
				Employee e=new Employee(id,name,NIC,email,Phone,DOB,UserU,passU);
				
				//adding employee class object in to the array list
				emp.add(e);
				
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return emp;//returning employee array-list object
		
	}
	
	public static boolean InsertManager(String name ,String nic ,  String email , String phone , String dob, String User , String password) {
		
		boolean isSuccess=false;
		
		try {
			System.out.println("try");
			//DB connection
			con= DBconnect.getConnection();
			stmt = con.createStatement();
			
			//inserting values to the table
			
			String sql = "insert into na_employee values(0 , '"+name+"' ,'"+nic+"', '"+email+"' , '"+phone+"' ,'"+dob+"', '"+User+"' , '"+password+"')";
			int rs=stmt.executeUpdate(sql);
			 
			if(rs>0) {
				
				isSuccess=true;
				
			}
			
			else{
				isSuccess=false;
				
			}
			
			
			
		}catch(Exception e) {
			System.out.println("catch");
			
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean updateManager(String id , String name ,String nic , String email , String phone ,  String dob , String username , String password) {
		
		try {
			
			//DB connection
			
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			
			//Updating values in the table
			
			String sql= "Update na_employee set Name='"+name+"' ,NIC='"+nic+"', Email='"+email+"' , Phone='"+phone+"' ,DOB='"+dob+"', Username='"+username+"' , Password='"+password+"'"
					    +"where Username='"+username+"'";
			
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
	
	
	public static List<Employee>getManagerEmployee(String Username){
		
		ArrayList<Employee> emp=new ArrayList<>();
		
		try {
			
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			
			String sql="select * from na_employee where Username='"+Username+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int ID=rs.getInt(1);
				String Name=rs.getString(2);
				String NIC=rs.getString(3);
				String Email=rs.getString(4);
				String Phone=rs.getString(5);
				String DOB=rs.getString(6);
				String UserName=rs.getString(7);
				String Password=rs.getString(8);
				
				Employee emp1=new Employee(ID,Name,NIC,Email,Phone,DOB,UserName,Password);
				emp.add(emp1);
				
			}
		}catch(Exception e){e.printStackTrace();}
		
		
		return emp;
		
		
	}
	
	
	
	
	public static boolean viewManager(String username) {
		
try {
			
			//DB connect
			con= DBconnect.getConnection();
			stmt=con.createStatement();
			
			//selecting specific data in the table
			
			String sql = "select * from na_employee where Username='"+username+"'";
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
	


public static Manager getManager1(String username) { 
	
	//creating object using Manager class
	Manager manager = new Manager();
		
				
		try {
			
			//DB connection
				Class.forName("com.mysql.jdbc.Driver");
				con = DBconnect.getConnection();
				stmt = con.createStatement();
				//selecting specific data from the table
				
				String sql = "SELECT * FROM manager_details WHERE Username = '"+username+"'";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
				
					//setting database table values into the Manager properties using setters
					
				manager.setID(rs.getInt("ID"));
				manager.setNIC(rs.getString("NIC"));
				manager.setName(rs.getString("Name"));
				manager.setEmail(rs.getString("Email"));
				manager.setPhone(rs.getString("Phone"));
				manager.setDOB(rs.getString("DOB"));
				manager.setUserName(rs.getString("Username"));
				manager.setPassword(rs.getString("Password"));
							
				}
			
			
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
			return manager;
}
	
	



public static boolean ManagerNEdelete(String id) {
	
	int convID=Integer.parseInt(id);
	
	try {
		//DB connection
		con = DBconnect.getConnection();
		stmt = con.createStatement();
		
		//deleting relevent data in the table
		
		String sql="delete from na_employee where ID='"+convID+"' ";
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

