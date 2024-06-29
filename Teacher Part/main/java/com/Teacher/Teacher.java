package com.Teacher; // Package Teacher

public class Teacher { // Teacher Class

	private int TID; //Instance Variables
	private String TName; //Instance Variables
	private String TEmail; //Instance Variables
	private String TNIC; //Instance Variables
	private String TContact; //Instance Variables
	private String TLocation; //Instance Variables
	private String TGender; //Instance Variables
	private String Tdob; //Instance Variables
	private String TPassword; //Instance Variables
	
	
	public Teacher() {  //Overload constructor
		
		TID = 0;
		TName = null;
		TNIC = null;
		TContact = null;
		TLocation = null;
		TGender = null;
		Tdob = null;
		TPassword = null;
		
	}
	
	
	public Teacher(int TID, String TName, String TEmail, String TNIC, String TContact, String TLocation, String TGender,
	String Tdob, String TPassword) {  //Default constructor
		
		this.TID = TID;
		this.TName = TName;
		this.TEmail = TEmail;
		this.TNIC = TNIC;
		this.TContact = TContact;
		this.TLocation = TLocation;
		this.TGender = TGender;
		this.Tdob = Tdob;
		this.TPassword = TPassword;
	}


	public int getTID() { //Get method
		return TID; //Return Value
	}

	public String getTName() { //Get method
		return TName; //Return Value
	}

	public String getTEmail() { //Get method
		return TEmail; //Return Value
	}

	public String getTNIC() { //Get method
		return TNIC; //Return Value
	}

	public String getTContact() { //Get method
		return TContact; //Return Value
	}

	public String getTLocation() { //Get method
		return TLocation; //Return Value
	}

	public String getTGender() { //Get method
		return TGender; //Return Value
	}

	public String getTdob() { //Get method
		return Tdob; //Return Value
	} 

	public String getTPassword() { //Get method
		return TPassword; //Return Value
	}


	public void setTID(int TID) { //Set method
		this.TID = TID;
	}


	public void setTName(String TName) {  //Set method
		this.TName = TName;
	}


	public void setTEmail(String TEmail) {  //Set method
		this.TEmail = TEmail;
	}


	public void setTNIC(String TNIC) {  //Set method
		this.TNIC = TNIC;
	}


	public void setTContact(String TContact) {  //Set method
		this.TContact = TContact;
	}


	public void setTLocation(String TLocation) {  //Set method
		this.TLocation = TLocation;
	}


	public void setTGender(String TGender) {  //Set method
		this.TGender = TGender;
	}


	public void setTdob(String Tdob) {  //Set method
		this.Tdob = Tdob;
	}


	public void setTPassword(String TPassword) {  //Set method
		this.TPassword = TPassword;
	}
	
	
	
}
