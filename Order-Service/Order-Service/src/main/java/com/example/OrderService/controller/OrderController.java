package com.example.OrderService.controller;

import com.example.OrderService.entity.Order;
import com.example.OrderService.service.OrderService;
import com.example.OrderService.valueObject.ResponseValueObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/")
    public Order saveOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @GetMapping("/{id}")
    public ResponseValueObject findOrderById(@PathVariable String id){
        return orderService.getUserWithDepartment(id);
    }
}
