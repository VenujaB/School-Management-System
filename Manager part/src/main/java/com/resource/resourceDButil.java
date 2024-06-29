package com.resource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Manager.DBconnect;
import com.Manager.Manager;

public class resourceDButil {
	
	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	
	
	
public static boolean insertresource(String name,String type,String price,String no,String capacity,String details) {
		
		boolean isSuccess = false;
		
			
		try {
			

			con = DBconnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into resource values(0,'"+name+"','"+type+"','"+price+"','"+no+"','"+capacity+"','"+details+"')";
			
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess =false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	

public static List<Resource> getResource(String rNO){
	
	ArrayList<Resource> resource=new ArrayList<>();
	   
	
	try {
		
		con= DBconnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from resource where RNO_or_VNO='"+rNO+"'";
		rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			
			int id=rs.getInt(1);
			String rname=rs.getString(2);
			String type=rs.getString(3);
			String price=rs.getString(4);
			String no=rs.getString(5);
			String capacity=rs.getString(6);
			String details=rs.getString(7);
			
			
			Resource r=new Resource(id,rname,type,price,no,capacity,details);
			
			resource.add(r);
			
		}
		
	}catch(Exception e) {
		
		e.printStackTrace();
		
	}
	
	return resource;
	
}

public static boolean updateResource(String id , String rname ,String type , String price , String rNO ,  String capacity , String details) {
	
	try {
		
		System.out.println("HAsitha");
		
		con=DBconnect.getConnection();
		stmt=con.createStatement();
		
		String sql= "Update resource set Resource_name='"+rname+"' ,type='"+type+"', price='"+price+"' , RNO_or_VNO='"+rNO+"' ,seat_Capasity='"+capacity+"', details='"+details+"'"
				    +"where RNO_or_VNO='"+rNO+"'";
		
		int rs=stmt.executeUpdate(sql);
		
		if(rs>0) {
			
			System.out.println("HAsitha");
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


public static List<Resource>getManagerResource(String rNO){
	
	ArrayList<Resource> resource=new ArrayList<>();
	
	try {
		
		con=DBconnect.getConnection();
		stmt=con.createStatement();
		
		String sql="select * from resource where RNO_or_VNO='"+rNO+"'";
		rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			
			int id=rs.getInt(1);
			String rname=rs.getString(2);
			String type=rs.getString(3);
			String price=rs.getString(4);
			String no=rs.getString(5);
			String capacity=rs.getString(6);
			String details=rs.getString(7);
			
			Resource resource1=new Resource(id,rname,type,price,no,capacity,details);
			resource.add(resource1);
			
		}
	}catch(Exception e){e.printStackTrace();}
	
	
	return resource;
	
	
}




public static boolean viewResource(String rNO) {
	
try {
		
		
		con= DBconnect.getConnection();
		stmt=con.createStatement();
		
		String sql = "select * from resource where RNO_or_VNO='"+rNO+"'";
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






/*public static Resource getResource1(String Rno) {  // Need to Change
Resource resource = new Resource();
	
			
	try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM students WHERE Username = '"+username+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
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
} */


public static boolean ManagerResourcedelete(String id) {

int convID=Integer.parseInt(id);

try {
	
	con = DBconnect.getConnection();
	stmt = con.createStatement();
	
	String sql="delete from resource where id='"+convID+"' ";
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
