 package com.example.demo.entity.page;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person implements Serializable {
     
    private static final long serialVersionUID = 6605010951064802762L;


    @Id
     @GeneratedValue
     @Column(name="ID")
     private Long id;
     
     
     private String name;
     
     


    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
    
     
     
     
}
