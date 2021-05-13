package com.purvesh.internapp.repository;

import com.purvesh.internapp.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRespository extends MongoRepository <Product,String> {
}
