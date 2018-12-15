 package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.otm.Customer;



/**
 * @author xiang
 * @date 2018/12/15
 */
public interface CustomerDao extends JpaRepository<Customer, Long> {

}
