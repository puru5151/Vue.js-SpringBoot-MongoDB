package com.purvesh.internapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document
public class Customer {
    @Id
    private String id;
    @Field
    private String Firstname;
    @Field
    private String Lastname;
    @Field
    private String gender;
    @Field
    private String type;
    @Field
    private String size;

    public Customer(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("Customer[id= %s, firstname ='%s', lastname='%s',gender='%s',type ='%s',size='%s']",id,Firstname,Lastname,gender,type,size);
    }
}
