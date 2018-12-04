 package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.NameOnly;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

public class UserServiceTest extends HebernateDemoApplicationTests {
    @Autowired
     private UserService userService;
    
    @Test
    public void testAddNewUser() {
        userService.addNewUser();
        //System.out.println(userService.getAllUserByPage());
        //System.out.println(userService.findByName(""));
    }
    /**
     * 通过nameONly接口定义的返回字段
     */
    @Test
    public void testFindByName() {
        List<NameOnly> list= userService.findByName("1");
        for (NameOnly nameOnly : list) {
            
            
            System.out.println(nameOnly.getName());
        }
        

    }
    
    @Test
    public void testFindAll() {
        List<User> users=userService.findAll();
        System.out.println(users);
        
        

    }
    

}
