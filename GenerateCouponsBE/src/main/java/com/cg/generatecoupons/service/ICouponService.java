package com.cg.generatecoupons.service;

import java.util.List;
import java.util.Optional;

import com.cg.generatecoupons.beans.Coupons;

public interface ICouponService {

	Optional<Coupons> getCoupon(int id);

	List<Coupons> showAll();

}
