package com.cg.generatecoupons.beans;

import java.time.LocalDate;


public class Coupons {


	

	@Override
	public String toString() {
		return email.toString();
	}

	private int cid;

	//@Column(name="customer_email")
	private Customer email;

	private LocalDate date;
	
	public Coupons() {
		
	}

	public Coupons(int cid, Customer email, LocalDate date) {
		super();
		this.cid = cid;
		this.email = email;
		this.date = date;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public Customer getEmail() {
		return email;
	}

	public void setEmail(Customer email) {
		this.email = email;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
