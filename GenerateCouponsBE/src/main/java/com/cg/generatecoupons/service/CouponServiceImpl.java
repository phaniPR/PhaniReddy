package com.cg.generatecoupons.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.generatecoupons.beans.Coupons;
import com.cg.generatecoupons.repo.ICouponRepo;

@Service
public class CouponServiceImpl implements ICouponService{
	@Autowired
	private ICouponRepo repo;

	@Override
	public Optional<Coupons> getCoupon(int id) {
		return repo.findById(id);
		
	}

	@Override
	public List<Coupons> showAll() {
		List<Coupons> list = new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list;
	}

}
