package com.purvesh.internapp.repository;

import com.purvesh.internapp.models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository <Customer, String>{
}
