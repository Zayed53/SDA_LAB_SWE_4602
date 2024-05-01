package com.example.OrderServiceM.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class OrderStatus {
    private Order order;
    private String status;
    private String message;

//    public OrderStatus(Order order, String process, String s) {
//        this.order=order;
//        this.status=process;
//        this.message=s;
//    }
}