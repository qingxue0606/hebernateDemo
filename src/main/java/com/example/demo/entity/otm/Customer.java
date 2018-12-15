 package com.example.demo.entity.otm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author xiang
 * @date 2018/12/15
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
     private Integer id;
    private String name;
    private  String address;
    private String remark;
    
    public Customer() {
    }
    public Customer(int id, String name, String address, String remark) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.remark = remark;
    }
    
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", remark=" + remark + "]";
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    

}
