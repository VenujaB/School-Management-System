package com.StudentApply; // Student Apply package

public class StudentApply { // Beginning of the Student Apply Class

	// Student Apply Class Attribute
	private int stuAid;
	private String stuAname;
	private String stuAemail;
	private String stuAcontact;
	private String stuAlocation;
	private String stuAgender;
	private String stuAdob;
	private String stuAgname;
	private String stuAgnumber;
	
	public StudentApply() {}; // Default Constructor
	
	// Overload constructor
	public StudentApply(int stuAid, String stuAname, String stuAemail, String stuAcontact, String stuAlocation, String stuAgender, 
			String stuAdob, String stuAgname, String stuAgnumber) {
		
		this.stuAid = stuAid;
		this.stuAname = stuAname;
		this.stuAemail = stuAemail;
		this.stuAcontact = stuAcontact;
		this.stuAlocation = stuAlocation;
		this.stuAgender = stuAgender;
		this.stuAdob = stuAdob;
		this.stuAgname = stuAgname;
		this.stuAgnumber = stuAgnumber;
	}

	public int getStuAid() { // Get Method for Student Apply Id
		return stuAid; // Return Student Apply ID
	}

	public void setStuAid(int stuAid) { // Set Method for Student Apply ID
		this.stuAid = stuAid; 
	}

	public String getStuAname() { // Get Method for Student Apply Name
		return stuAname; // Return Student Apply Name
	}

	public void setStuAname(String stuAname) {  // Set Method for Student Apply Name
		this.stuAname = stuAname;
	}

	public String getStuAemail() { // Get Method for Student Apply Email
		return stuAemail; // Return Student Apply Email
	}

	public void setStuAemail(String stuAemail) { // Set Method for Student Apply Email
		this.stuAemail = stuAemail; 
	}

	public String getStuAcontact() { // Get Method for Student Apply Contact Number
		return stuAcontact;
	}

	public void setStuAcontact(String stuAcontact) { // Set Method for Student Apply Contact Number
		this.stuAcontact = stuAcontact; 
	}

	public String getStuAlocation() { // Get Method for Student Apply Location 
		return stuAlocation; // Return Student Apply Contact Number
	}

	public void setStuAlocation(String stuAlocation) { // Set Method for Student Apply Location
		this.stuAlocation = stuAlocation;
	}

	public String getStuAgender() {  // Get Method for Student Apply Gender
		return stuAgender; // Return Student Gender
	}

	public void setStuAgender(String stuAgender) { // Set Student Apply Age
		this.stuAgender = stuAgender;
	}

	public String getStuAdob() { // Get Student Apply Date of Birth
		return stuAdob; // Return Student Apply Date of Birth
	}

	public void setStuAdob(String stuAdob) { // Set Student Apply Date of birth
		this.stuAdob = stuAdob;
	}

	public String getStuAgname() { //  Get Student Apply Guardian Name
		return stuAgname; // Return Student Apply Guardian Name
	}

	public void setStuAgname(String stuAgname) { // Set Student Apply Guardian Name
		this.stuAgname = stuAgname;
	}

	public String getStuAgnumber() { // Get Student Apply Guardian Number
		return stuAgnumber; // Return Student Apply Guardian Number
	}

	public void setStuAgnumber(String stuAgnumber) { // Set Student Apply  Number
		this.stuAgnumber = stuAgnumber;
	}
	
} // End of the Student Apply Class
