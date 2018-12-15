 package com.example.demo.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.HebernateDemoApplicationTests;

/**
 * @author xiang
 * @date 2018/12/15
 */
public class CustomerServiceTest  extends HebernateDemoApplicationTests{
    @Autowired
     private CustomerService customerService;
    
    @Test
    public void testFindAll() {
        customerService.findAll();
    }

}
