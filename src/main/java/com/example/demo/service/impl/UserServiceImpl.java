 package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserPagingAndSortingRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.entity.NameOnly;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserPagingAndSortingRepository userPagingAndSortingRepository;

    @Override
    public void addNewUser() {
       User user=new User();
       user.setName("xiang");
       user.setEmail("7705564@qq.com");
       userRepository.save(user);
 
    }

    @Override
    public Iterable<User> getAllUsers() {
        // TODO Auto-generated method stub
         return null;
    }

    @Override
    public Page<User> getAllUserByPage() {
        // TODO Auto-generated method stub
         return userPagingAndSortingRepository.findAll(new PageRequest(1, 20, new Sort(new Sort.Order(Sort.Direction.ASC,"name"))));
    }

    @Override
    public List<NameOnly> findByName(String name) {
        // TODO Auto-generated method stub
        name="xiang";
         return userRepository.findByName(name);
    }

    /** (non-Javadoc)
     * @see com.example.demo.service.UserService#findAll()
     */
    @Override
    public List<User> findAll() {
        User user=new User();
        user.setName("xia");
        ExampleMatcher matcher=ExampleMatcher.matching()
            .withMatcher("name", GenericPropertyMatchers.startsWith());
            //.withIgnorePaths("email");
        Example<User> example=Example.of(user, matcher);
        List<User> ls=userRepository.findAll(example);
        

         return ls;
    }

}
