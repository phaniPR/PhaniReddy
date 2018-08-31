package com.cg.generatecoupons.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.generatecoupons.beans.Coupons;
import com.cg.generatecoupons.service.ICouponService;

@RestController
public class CouponController {

	@Autowired
	private ICouponService service;
	
	@RequestMapping("/getcoupon")
	public Optional<Coupons> getCoupon(@RequestParam int id) {
	return 	service.getCoupon(id);
	}
	
	@RequestMapping("/showall")
	public List<Coupons> showAll() {
		return service.showAll();
	}
}
