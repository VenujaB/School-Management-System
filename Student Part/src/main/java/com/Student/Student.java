package com.Student; // Package of Student

public class Student { // Student Class 

	// Private Attribute using private encapsulate private data
	
	// Attributes
	private int SID;  // Instance Variables 
	private String SName;  // Instance Variables
	private String SEmail;  // Instance Variables
	private String SContact;  // Instance Variables
	private String SLocation;  // Instance Variables
	private String SGender;  // Instance Variables
	private String Sdob;  // Instance Variables
	private String SPassword;  // Instance Variables
	
	public Student() { // Default Constructor
		
		SID =0;
		SName = null;
		SEmail = null;
		SContact = null;
		SLocation = null;
		SGender = null;
		Sdob = null;
		SPassword = null;
		
	}
	
	// Overload Constructor
	public Student(int SID, String SName, String SEmail, String SContact, String SLocation, String SGender, String Sdob, String SPassword) {
		
		this.SID = SID;
		this.SName = SName;
		this.SEmail = SEmail;
		this.SContact = SContact;
		this.SLocation = SLocation;
		this.SGender = SGender;
		this.Sdob = Sdob;
		this.SPassword = SPassword;
	}
	
	public int getSID() { // Get Student ID
		return SID; // Return Student ID
	}
	
	public String getSName() { // Get Student Name 
		return SName; // Return Student Name
	}
	
	public String getSEmail() { // Get Student Email
		return SEmail; // Return Student Email
	}
	
	public String getSContact() { // Get Student Contact Number
		return SContact; // Return Student Contact Number
	}
	
	public String getSLocation() { // Get Student Location
		return SLocation; // Return Student Location
	}
	
	public String getSGender() { // Get Student Gender
		return SGender; // Return Student Gender
	}
	public String getSdob() { // Get Student Date of Birth
		return Sdob; // Return Student Date of Birth
	}
	
	public String getSPassword() { // Get Student Password
		return SPassword; // Return Student Password
	}

	public void setSID(int sID) { // Set Method for Student ID
		SID = sID;
	}

	public void setSName(String sName) { // Set Method for Student Name
		SName = sName;
	}

	public void setSEmail(String sEmail) { // Set Method for Student Email
		SEmail = sEmail;
	}

	public void setSContact(String sContact) { // Set Method for Student Contact
		SContact = sContact;
	}

	public void setSLocation(String sLocation) { // Set Method for Student Location
		SLocation = sLocation;
	}

	public void setSGender(String sGender) { // Set Method for Student Gender
		SGender = sGender;
	}

	public void setSdob(String sdob) { // Set Method for Student Date of birth
		Sdob = sdob;
	}

	public void setSPassword(String sPassword) { // Set Method for Student Password
		SPassword = sPassword;
	}
	
	
	
	
	
}
