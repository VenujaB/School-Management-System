package com.Admin;

public class Admin {
	
	private int id;
	private String name;
	private String email;
	private String phone;
	private String userName;
	private String password;
	
	public Admin() {};
	
	public Admin(int id, String name, String email, String phone, String userName, String password) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.userName = userName;
		this.password = password;
	}

	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}


	public String getUserName() {
		return userName;
	}

	
	public String getPassword() {
		return password;
	}
	
	public void setID(int id) {
	    this.id=id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setUserName(String user) {
		this.userName = user;
	}
   
	public void setPassword(String password) {
		this.password=password;
	}


	
	
	
	
	
	

}
