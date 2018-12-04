 package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entity.NameOnly;
import com.example.demo.entity.User;

public interface UserService {
     void addNewUser();
     Iterable<User> getAllUsers();
     Page<User> getAllUserByPage();
     List<NameOnly> findByName(String name);
     List<User> findAll();
}
