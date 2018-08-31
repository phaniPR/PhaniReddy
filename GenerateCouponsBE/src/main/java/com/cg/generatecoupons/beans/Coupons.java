package com.cg.generatecoupons.beans;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Coupon")
public class Coupons {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="coupon_id")
	private int cid;
	@OneToOne
	@JoinColumn(name="customer_email")
	//@Column(name="customer_email")
	private Customer email;
	@Column(name="validity")
	private LocalDate date;
	
	public Coupons() {
		
	}
	@Override
	public String toString() {
		return email.toString();
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
