 package com.example.demo.entity.otm;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
     private int cid;
     private String cname;
     
     
     
     /*@OneToMany(cascade= {CascadeType.MERGE},fetch=FetchType.EAGER)
     @JoinColumn(name="cid")*/
     
     
     /*@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
     @JoinTable(name = "ClassRoom_Student",joinColumns = {@JoinColumn(name = "ClassRoom_ID", referencedColumnName = "cid")},
     inverseJoinColumns = {@JoinColumn(name = "Student_ID", referencedColumnName ="sid")})*/
     /*private Set<Student> students;*/
     
     
     /*@ManyToOne(cascade=CascadeType.MERGE ,fetch=FetchType.EAGER)
     //@ManyToOne(fetch=FetchType.LAZY)
     @JoinColumn(name="sid",referencedColumnName="sid")*/
     
     
     @OneToOne(cascade=CascadeType.MERGE)
     @JoinColumn(name="sid",unique=true)
     
     private Student student;
     
     
     
     

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }



     
     
     
}
