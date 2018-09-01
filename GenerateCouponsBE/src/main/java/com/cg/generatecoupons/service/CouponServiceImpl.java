package com.cg.generatecoupons.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.generatecoupons.beans.Coupons;
import com.cg.generatecoupons.repo.ICouponRepo;

@Service
public class CouponServiceImpl implements ICouponService{
	@Autowired
	private ICouponRepo repo;

	@Override
	public Coupons getCoupon(String customer_email) {
		System.out.println(repo.getCoupon(customer_email));
		return repo.getCoupon(customer_email);
		
		
	}

	@Override
	public List<Coupons> showAll() {
		List<Coupons> list = new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list;
	}

}
