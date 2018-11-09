 package com.example.demo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.otm.ClassRoom;
import com.example.demo.entity.otm.Student;
import com.example.demo.service.ClassRoomToStudentOneToMany;
import com.example.demo.service.PersonService;

import com.example.demo.service.impl.ClassRoomToStudentOneToManyImpl;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest extends HebernateDemoApplicationTests {

    
     //private TestServiceImpl testServiceImpl=new TestServiceImpl();
    @Autowired(required=true)
    private PersonService personService;
    
   
    @Autowired
    private ClassRoomToStudentOneToMany classRoomToStudentOneToMany;
    

     public void testCall() {
         personService.funTest();
     }
     
     @Test
     public void testOneToMany() {
         classRoomToStudentOneToMany.funTest();

         

     }
}
