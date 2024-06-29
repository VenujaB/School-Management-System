package com.Contactus; // Package of Contact us

public class ContactUs { // Contact Us Class

		// Private Attribute using private encapsulate private data
					
	private int CUS_ID;  // Instance Variables
	private String CUS_FName;  // Instance Variables
	private String CUS_Email;  // Instance Variables
	private String CUS_Message; // Instance Variables
	
	public ContactUs() { 
		
		// Default Constructor
		CUS_ID = 0;
		CUS_FName = null;
		CUS_Email = null;
		CUS_Message = null;
	}
	
	public ContactUs(int CUS_ID, String CUS_FName, String CUS_Email, String CUS_Message) {
		
		// Overload Constructor
		
		this.CUS_ID = CUS_ID;
		this.CUS_FName = CUS_FName;
		this. CUS_Email =  CUS_Email;
		this.CUS_Message = CUS_Message;
	}

	public int getCUS_ID() { // Get method 
		return CUS_ID; // return value
	}

	public void setCUS_ID(int CUS_ID) { // Set Method
		this.CUS_ID = CUS_ID;
	}

	public String getCUS_FName() { // Get method 
		return CUS_FName; // return value
	}

	public void setCUS_FName(String CUS_FName) {  // Set Method
		this.CUS_FName = CUS_FName;
	}

	public String getCUS_Email() { // Get method 
		return CUS_Email; // return value
	}

	public void setCUS_Email(String CUS_Email) { // Set Method
		this.CUS_Email = CUS_Email;
	}

	public String getCUS_Message() { // Get method 
		return CUS_Message; // return value
	}

	public void setCUS_Message(String CUS_Message) {  // Set Method
		this.CUS_Message = CUS_Message;
	}
	
	
}
