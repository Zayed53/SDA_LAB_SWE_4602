package com.example.Customer_microservice.repository;

import com.example.Customer_microservice.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findCustomerById(String userId);
}
