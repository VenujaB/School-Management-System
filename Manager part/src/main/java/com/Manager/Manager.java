package com.Manager;

public class Manager {
	
	
	private int id;
	private String name;
	private String NIC;
	private String email;
	private String phone;
	
	private String DOB;
	private String userName;
	private String password;
	
	public Manager() {
		
		
	};
	
	public Manager(int id, String name,String NIC , String email, String phone  , String DOB , String userName, String password) {
		
		this.id = id;
		this.name = name;
		this.NIC=NIC;
		this.email = email;
		this.phone = phone;
		
		this.DOB=DOB;
		this.userName = userName;
		this.password = password;
	}

	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getNIC() {
		return NIC;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	
   
	
	public String getDOB() {
		return DOB;
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

	public void setNIC(String nic) {
		this.NIC = nic;
	}

	public void setName(String Name) {
		this.name=Name;
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

	public void setDOB(String dob) {
		this.DOB = dob;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
	
	

}
