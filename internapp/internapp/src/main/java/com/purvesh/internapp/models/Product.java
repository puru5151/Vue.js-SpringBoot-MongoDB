package com.purvesh.internapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Product {
    @Id
    private String id;
    @Field
    private String productname;
    @Field
    private String productdescription;
    @Field
    private String producttype;
    @Field
    private String productgender;
    @Field
    private String productsize;

    public Product() {
    }

    public Product(String productname,String productdescription,String producttype,String productgender, String productsize){
        this.productname = productname;
        this.productdescription = productdescription;
        this.producttype = producttype;
        this.productgender = productgender;
        this.productsize = productsize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getProductgender() {
        return productgender;
    }

    public void setProductgender(String productgender) {
        this.productgender = productgender;
    }

    public String getProductsize() {
        return productsize;
    }

    public void setProductsize(String productsize) {
        this.productsize = productsize;
    }


    @Override
    public String toString() {
        return String.format("Product[id= %s, productname ='%s', productdescription ='%s' ,producttype='%s',productgender='%s',productsize ='%s']",id,productname,productdescription,productgender,producttype,productsize);
    }
}
