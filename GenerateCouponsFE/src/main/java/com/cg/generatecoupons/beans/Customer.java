package com.cg.generatecoupons.beans;

public class Customer {
	
	private String cusmail;

	private int count;
	public Customer() {

	}
	public Customer(String cusmail, int count) {
		super();
		this.cusmail = cusmail;
		this.count = count;
	}
	public String getCusmail() {
		return cusmail;
	}
	public void setCusmail(String cusmail) {
		this.cusmail = cusmail;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return cusmail;
	}
}
