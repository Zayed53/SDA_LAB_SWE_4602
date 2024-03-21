package com.example.Customer_microservice.service;


import com.example.Customer_microservice.entity.Customer;
import com.example.Customer_microservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }


    public Customer findEmployeeById(String userId) {
        return customerRepository.findCustomerById(userId);
    }
}
