package com.cg.generatecoupons.beans;

import java.time.LocalDate;




public class Coupons {

	private int coupon_id;

	private String customer_email;

	private LocalDate validity;
	
	public Coupons() {
		
	}


	@Override
	public String toString() {
		return "Coupons [coupon_id=" + coupon_id + ", customer_email=" + customer_email + ", date=" + validity + "]";
	}


	public Coupons(int coupon_id, String customer_email, LocalDate validity) {
		super();
		this.coupon_id = coupon_id;
		this.customer_email = customer_email;
		this.validity = validity;
	}

	public int getcoupon_id() {
		return coupon_id;
	}

	public void setcoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
	}

	public String getEmail() {
		return customer_email;
	}

	public void setEmail(String email) {
		this.customer_email = email;
	}

	public LocalDate getDate() {
		return validity;
	}

	public void setDate(LocalDate validity) {
		this.validity = validity;
	}
}
