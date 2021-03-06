 package com.example.demo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.otm.ClassRoom;
import com.example.demo.entity.otm.Student;
import com.example.demo.entity.page.Person;



public interface ClassRoomDao extends JpaRepository<ClassRoom, Long> {
    

}
