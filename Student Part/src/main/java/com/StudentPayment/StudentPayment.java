package com.StudentPayment;

public class StudentPayment {

	private int PayID;
	private String PayHName;
	private String PayCNumber;
	private String PayDate;
	private String PayCvv;
	private String PayAmount;
	
	
	public StudentPayment() {
		
		PayID =0;
		PayHName = null;
		PayCNumber = null;
		PayDate = null;
		PayCvv = null;
		PayAmount = null;
	}
	
	public StudentPayment(int PayID, String PayHName, String PayCNumber, String PayDate, String PayCvv, String PayAmount) {
		
		this.PayID = PayID;
		this.PayHName = PayHName;
		this.PayCNumber = PayCNumber;
		this.PayCvv = PayCvv;
		this.PayDate = PayDate;
		this.PayAmount = PayAmount;
	}

	public int getPayID() {
		return PayID;
	}

	public void setPayID(int payID) {
		PayID = payID;
	}

	public String getPayHName() {
		return PayHName;
	}

	public void setPayHName(String payHName) {
		PayHName = payHName;
	}

	public String getPayCNumber() {
		return PayCNumber;
	}

	public void setPayCNumber(String payCNumber) {
		PayCNumber = payCNumber;
	}

	public String getPayDate() {
		return PayDate;
	}

	public void setPayDate(String payDate) {
		PayDate = payDate;
	}

	public String getPayCvv() {
		return PayCvv;
	}

	public void setPayCvv(String payCvv) {
		PayCvv = payCvv;
	}

	public String getPayAmount() {
		return PayAmount;
	}

	public void setPayAmount(String payAmount) {
		PayAmount = payAmount;
	}
	
}
