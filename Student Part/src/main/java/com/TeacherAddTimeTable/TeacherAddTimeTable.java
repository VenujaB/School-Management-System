package com.TeacherAddTimeTable;

public class TeacherAddTimeTable {

	private int id;
	private String ModuleID;
	private String Grade;
	private String Time;
	private String Date;
	
	public TeacherAddTimeTable() {
		
		id =0;
		ModuleID = "null";
		Grade = "null";
		Time = "null";
		Date = "null";
	}
	
	public TeacherAddTimeTable(int id, String ModuleID, String Grade, String Time, String Date) {
		
		this.id =id;
		this.ModuleID = ModuleID;
		this.Grade = Grade;
		this.Time = Time;
		this.Date = Date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModuleID() {
		return ModuleID;
	}

	public void setModuleID(String ModuleID) {
		
		this.ModuleID = ModuleID;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String Grade) {
		this.Grade = Grade;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String Time) {
		this.Time = Time;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	
	
}
