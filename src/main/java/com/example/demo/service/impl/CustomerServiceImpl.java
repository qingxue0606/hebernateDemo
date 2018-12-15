 package com.example.demo.service.impl;

import java.util.List;

import org.apache.catalina.realm.GenericPrincipal;
import org.hibernate.cache.spi.GeneralDataRegion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.otm.Customer;
import com.example.demo.service.CustomerService;

/**
 * @author xiang
 * @date 2018/12/15
 */
@Service
public class CustomerServiceImpl  implements CustomerService{
    @Autowired
    private CustomerDao customerDao;
    /** (non-Javadoc)
     * @see com.example.demo.service.CustomerService#findAll()
     */
    /**
     * 这个可以用于多条件的查询
     * (non-Javadoc)
     * @see com.example.demo.service.CustomerService#findAll()
     */
    @Override
    public void findAll() {
        Customer customer=new Customer();
        customer.setName("Jack");
        customer.setAddress("shanghai");
        ExampleMatcher matcher=ExampleMatcher.matching() 
            .withMatcher("name", GenericPropertyMatchers.startsWith()) //开始匹配
            .withMatcher("address", GenericPropertyMatchers.contains())   //包含匹配
            .withIgnorePaths("remark");   //可忽略
        Example<Customer> ex=Example.of(customer,matcher);
        Pageable pageable=new PageRequest(0, 3);
        Page<Customer> ls=customerDao.findAll(ex,pageable);
        
        System.out.println(ls.getContent());
    }

}
