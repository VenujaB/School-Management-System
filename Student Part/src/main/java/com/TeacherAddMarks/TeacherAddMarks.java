package com.TeacherAddMarks;

public class TeacherAddMarks {
	
	private int ID;
	private String StudentID;
	private String StudentName;
	private String ModuleID;
	private String ModuleName;
	private String Marks;
	
	TeacherAddMarks() {
		
		ID = 0;
		StudentID = null;
		StudentName = null;
		ModuleID = null;
		ModuleName = null;
		Marks = null;
	}
	
	TeacherAddMarks(int ID, String StudentID, String StudentName, String ModuleID, String ModuleName,String Marks) {
		
		this.ID = ID;
		this.StudentID = StudentID;
		this.StudentName = StudentName;
		this.ModuleID = ModuleID;
		this.ModuleName = ModuleName;
		this.Marks = Marks;
	}

	
	public int getID() {
		return ID;
	}

	public void setId(int ID) {
		this.ID = ID;
	}

	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String StudentID) {
		this.StudentID = StudentID;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String StudentName) {
		this.StudentName = StudentName;
	}

	public String getModuleID() {
		return ModuleID;
	}

	public void setModuleID(String ModuleID) {
		this.ModuleID = ModuleID;
	}

	public String getModuleName() {
		return ModuleName;
	}

	public void setModuleName(String ModuleName) {
		this.ModuleName = ModuleName;
	}

	public String getMarks() {
		return Marks;
	}

	public void setMarks(String Marks) {
		this.Marks = Marks;
	}
	
}
