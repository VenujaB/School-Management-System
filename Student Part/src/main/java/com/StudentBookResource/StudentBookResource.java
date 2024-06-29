package com.StudentBookResource; // Package Student Book Resource

public class StudentBookResource { //  Student Book Resource Class

	// Private Attribute using private encapsulate private data
	
	private int id;
	private String ResourceID;
	private String StuName;
	private String StuEmail;
	private String StuMobile;
	private String ResourceType;
	private String BookDate;
	private String BookTime;
	
	public StudentBookResource() {
		
		// Default Constructor
		id = 0;
		ResourceID = null;
		StuName = null;
		StuEmail = null;
		StuMobile = null;
		ResourceType = null;
		BookDate = null;
		BookTime = null;
		
		
	}
	
	public StudentBookResource(int id, String ResourceID, String StuName, String StuEmail, String StuMobile, String ResourceType, String BookDate, String BookTime) {
		
		// Overload Constructor
		
		this.id = id;
		this.ResourceID = ResourceID;
		this.StuName = StuName;
		this.StuEmail = StuEmail;
		this.StuMobile =StuMobile;
		this.ResourceType = ResourceType;
		this.BookDate = BookDate;
		this.BookTime = BookTime;
	}

	public int getId() { // get method for id
		return id;  // return id
	}

	public void setId(int id) { // Set method for id
		this.id = id;
	}

	public String getResourceID() {  // get method for Resource ID
		return ResourceID; // return Resource ID
	}

	public void setResourceID(String ResourceID) { // Set method for ResourceID
		this.ResourceID = ResourceID;
	}

	public String getStuName() {  // get method for Student Name
		return StuName; // return Student Name
	}

	public void setStuName(String StuName) { // Set method for Student Name
		this.StuName = StuName;
	}

	public String getStuEmail() { // get method for Student Email
		return StuEmail; // return Student Email
	}

	public void setStuEmail(String StuEmail) {  // Set method for Student  Email
		this.StuEmail = StuEmail;
	}

	public String getStuMobile() {  // get method for Student Mobile
		return StuMobile; // return Student Mobile
	}

	public void setStuMobile(String StuMobile) { // Set method for Student Mobile
		this.StuMobile = StuMobile;
	}

	public String getResourceType() {  // get method for Resource Type
		return ResourceType; // return Resource Type
	}

	public void setResourceType(String ResourceType) {  // Set method for Resource Type
		this.ResourceType = ResourceType;
	}

	public String getBookDate() {   // get method for BookDate
		return BookDate;  // return BookDate
	}

	public void setBookDate(String BookDate) { // Set method for BookDate
		this.BookDate = BookDate;
	}

	public String getBookTime() { // get method for BookTime
		return BookTime;  // return BookTime
	}

	public void setBookTime(String BookTime) {  // Set method for BookTime
		this.BookTime = BookTime;
	}
	
	
	
	
	
}
