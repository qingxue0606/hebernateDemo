 package com.example.demo.entity.otm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
 public class Student {
    @Id
    @GeneratedValue(generator="sid")
    @GenericGenerator(name="sid", strategy = "assigned")
    @Column(length = 6)
    private String sid;         // 学号
     private String sname;
     
     public Student(String sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public Student() {
        // TODO Auto-generated constructor stub
    }
     
    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
     
     
     

}
