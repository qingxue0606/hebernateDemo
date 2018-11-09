 package com.example.demo.service.impl;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ClassRoomDao;
import com.example.demo.dao.StudentDao;
import com.example.demo.entity.otm.ClassRoom;
import com.example.demo.entity.otm.Student;
import com.example.demo.service.ClassRoomToStudentOneToMany;

@Service
public class ClassRoomToStudentOneToManyImpl implements ClassRoomToStudentOneToMany {
    @Autowired
     private StudentDao studentDao;
    @Autowired
     private ClassRoomDao classRoomDao;
    @Override
    public void funTest() {
/*        // manytomany and onetomany
        List<String> name = new LinkedList<>();
        name.add("a");
        name.add("b");
        name.add("c");
        name.add("d");
        name.add("e");
        name.add("f");
        name.add("g");
        name.add("h");
        name.add("i");
        name.add("p");
        Set<Student> s1 = new HashSet<>();
        for (int i = 0; i < name.size(); i++) {
            Student studenet = new Student( "S0000" + i,name.get(i));
            s1.add(studenet);
            
        }
        //studentDao.save(s1);
        studentDao.save(s1);
        ClassRoom c1 = new ClassRoom();
        c1.setCname("class1");
        c1.setStudents(s1);
        classRoomDao.save(c1);*/
        
        
        //many to one
        Student student=new  Student( "S0000e","xiang");
        ClassRoom classRoom=new ClassRoom();
        //ClassRoom classRoom2=new ClassRoom();
        classRoom.setCname("class1");
        classRoom.setStudent(student);
        //classRoom2.setCname("class2");
        //classRoom2.setStudent(student);
        studentDao.save(student);
        classRoomDao.save(classRoom);
        //classRoomDao.save(classRoom2);
        
        
        
        
        
        
    }
     
     
     
}
