package com.example.demo.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.example.demo.entity.NameOnly;
import com.example.demo.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
	/**
	 * 根据名称进行查询用户列表
	 * @param name
	 * @return
	 */
	List<NameOnly> findByName(String name);
	/**
	 * 根据用户的邮箱和名称查询
	 *
	 * @param email
	 * @param name
	 * @return
	 */
	//Page<User> findByEmailAndName(String email,String name);
}
