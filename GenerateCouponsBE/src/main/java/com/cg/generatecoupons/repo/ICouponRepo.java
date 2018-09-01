package com.cg.generatecoupons.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.generatecoupons.beans.Coupons;

@Repository
public interface ICouponRepo extends JpaRepository<Coupons, Integer>, CrudRepository<Coupons, Integer> {

	@Query(value = "Select c from Coupons c where c.customer_email=:customer_email")
	Coupons getCoupon(@Param(value = "customer_email") String customer_email);

}
