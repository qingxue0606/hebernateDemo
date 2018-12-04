 package com.example.demo.dao;


 import org.springframework.data.domain.Page;
 import org.springframework.data.domain.Pageable;
 import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.User;

 public interface UserPagingAndSortingRepository extends PagingAndSortingRepository<User,Long> {
     Page<User> findByName(String name, Pageable pageable) throws Exception;
 }
