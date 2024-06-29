package com.Contactus; 

public class ContactUs { 

	private int CUS_ID;
	private String CUS_FName;
	private String CUS_Email;
	private String CUS_Message;
	
	public ContactUs() {
		
		CUS_ID = 0;
		CUS_FName = null;
		CUS_Email = null;
		CUS_Message = null;
	}
	
	public ContactUs(int CUS_ID, String CUS_FName, String CUS_Email, String CUS_Message) {
		
		this.CUS_ID = CUS_ID;
		this.CUS_FName = CUS_FName;
		this. CUS_Email =  CUS_Email;
		this.CUS_Message = CUS_Message;
	}

	public int getCUS_ID() {
		return CUS_ID;
	}

	public void setCUS_ID(int CUS_ID) {
		this.CUS_ID = CUS_ID;
	}

	public String getCUS_FName() {
		return CUS_FName;
	}

	public void setCUS_FName(String CUS_FName) {
		this.CUS_FName = CUS_FName;
	}

	public String getCUS_Email() {
		return CUS_Email;
	}

	public void setCUS_Email(String CUS_Email) {
		this.CUS_Email = CUS_Email;
	}

	public String getCUS_Message() {
		return CUS_Message;
	}

	public void setCUS_Message(String CUS_Message) {
		this.CUS_Message = CUS_Message;
	}
	
	
}
