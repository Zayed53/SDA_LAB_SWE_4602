package com.example.Customer_microservice.controller;

import com.example.Customer_microservice.entity.Customer;
import com.example.Customer_microservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping("/")
    public Customer saveEmployee(@RequestBody Customer employee){
        return customerService.saveCustomer(employee);
    }
    @GetMapping("/{id}")
    public Customer findEmployeeById(@PathVariable("id") String employeeId){
        return customerService.findEmployeeById(employeeId);
    }
}
