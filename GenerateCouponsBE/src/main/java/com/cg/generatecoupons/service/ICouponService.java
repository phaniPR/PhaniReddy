package com.cg.generatecoupons.service;

import java.util.List;

import com.cg.generatecoupons.beans.Coupons;

public interface ICouponService {


	List<Coupons> showAll();

	Coupons getCoupon(String customer_email);

}
