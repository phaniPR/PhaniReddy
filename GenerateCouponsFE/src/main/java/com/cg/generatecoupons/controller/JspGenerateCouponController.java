package com.cg.generatecoupons.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.generatecoupons.beans.Coupons;

@Controller
public class JspGenerateCouponController {

	@RequestMapping("/invite/{customer_email}")
	public ModelAndView getCustomer(@PathVariable String customer_email) {
		RestTemplate rt = new RestTemplate();
		/*Coupons p = rt.getForObject("http://localhost:5445/getcoupon?customer_email=" + customer_email, Coupons.class);*/
		Coupons p=rt.getForObject("http://localhost:5445/getcoupon?email=" +customer_email, Coupons.class);
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", p);
		System.out.println(p);
		mv.setViewName("Invite");
		return mv;
	}

	@RequestMapping("/showall")
	public ModelAndView showAll() {
		RestTemplate rt = new RestTemplate();
		ArrayList p = rt.getForObject("http://localhost:5445/showall", ArrayList.class);
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", p);
		mv.setViewName("AllProducts");
		return mv;
	}
	@RequestMapping("/Success")
	public String showSuccess() {
		return "Success";

	}
	
	@RequestMapping("/invite/")
	public String showInvite() {
		return "Invite";
	}
}
