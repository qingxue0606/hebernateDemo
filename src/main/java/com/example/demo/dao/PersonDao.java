 package com.example.demo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.page.Person;



public interface PersonDao extends JpaRepository<Person, Long> {
    Page<Person> findByName(String name, Pageable pageable);

}
