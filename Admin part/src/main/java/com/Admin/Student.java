package com.Admin;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private String phone;
	private String address;
	private String birth;
	private String userName;
	private String password;
	
	public Student(int id, String name, String email, String phone,String address,String dob, String userName, String password) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address=address;
		this.birth=dob;
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
	
	public String getAddress() {
		return address;
	}
	
	public String getBirth() {
		return birth;
	}


	public String getUserName() {
		return userName;
	}

	
	public String getPassword() {
		return password;
	}


}
