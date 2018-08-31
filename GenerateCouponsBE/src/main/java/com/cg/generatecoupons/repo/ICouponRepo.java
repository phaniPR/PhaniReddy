package com.cg.generatecoupons.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.generatecoupons.beans.Coupons;

@Repository
public interface ICouponRepo extends CrudRepository<Coupons,Integer>{

}
