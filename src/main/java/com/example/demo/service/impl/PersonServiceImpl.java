 package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.entity.page.Person;
import com.example.demo.service.PersonService;

/*
 * 通过pageable来查询对象
 * 通过page来封装对查询出来的对象，
 * 
 */
@Service
public class PersonServiceImpl implements PersonService {
    
    @Autowired
    private PersonDao personDao;
    
    @Override
    public void funTest() {
        
        Person person=new Person();
        person.setName("s");
        personDao.save(person);
        Pageable pageable=new PageRequest(1, 5, Sort.Direction.ASC,"id");
        Page<Person> page= personDao.findByName("s", pageable);
        System.out.println("getTotalElements  "+page.getTotalElements());
        System.out.println("getPageSize  "+page.getSize());
        System.out.println("content: "+page.getContent());
        
    }

}
