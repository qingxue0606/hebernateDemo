 package com.example.demo;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;

/**
 * @author xiang
 * @date 2018/12/05
 */
public class HQLTest extends HebernateDemoApplicationTests{

    @Autowired
    private UserRepository userRepository;

    
    @Test
    public void test() {
        List<User> users=userRepository.hqlfind();
        System.out.println(users);
    }
    
}
