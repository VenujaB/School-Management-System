package com.Notice;

public class Notice {
	
	private int id;
	private String content;
	
	public Notice() {};
	
	public Notice(int id , String cont) {
		
		this.id=id;
		this.content=cont;
		
	}
	
	public int getID() {
		
		
		return id;
		
	}
	
	public String getContent() {
		
		
		return content;
		
	}

}
