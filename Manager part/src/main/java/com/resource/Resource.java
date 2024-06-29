package com.resource;

public class Resource {
	
	private int id;
	private String name;
	private String type;
	private String price;
	private String rNO;
	private String Seat_capacity;
	private String details;
	
	
	public Resource() {
		
		
	};
	
	public Resource(int id, String rname,String rtype , String price, String NO  , String capacity , String details) {
		
		this.id = id;
		this.name = rname;
		this.type=rtype;
		this.price = price;
		this.rNO = NO;
		
		this.Seat_capacity=capacity;
		this.details = details;
		
	}

	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getPrice() {
		return price;
	}

	public String getrNO() {
		return rNO;
	}
	
   
	
	public String getCapacity() {
		return Seat_capacity;
	}


	public String getDetails() {
		return details;
	}

	
	
	
	
	
	public void setID(int id) {
	    this.id=id;
	}

	public void setNname(String rname) {
		this.name = rname;
	}

	public void setType(String type) {
		this.type=type;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setrNO(String NO) {
		this.rNO = NO;
	}

	public void setSeatCapacity(String capacity) {
		this.Seat_capacity = capacity;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	
	
	
	
	
	
	

}
