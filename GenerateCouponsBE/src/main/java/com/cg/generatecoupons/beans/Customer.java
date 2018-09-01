package com.cg.generatecoupons.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
		@Id
		@Column(name="customer_email")
		private String cusmail;
		@Column(name="customer_prodcount")
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
