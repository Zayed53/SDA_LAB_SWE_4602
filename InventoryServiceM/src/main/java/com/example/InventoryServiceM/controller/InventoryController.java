package com.example.InventoryServiceM.controller;

import com.example.InventoryServiceM.Constants;
import com.example.InventoryServiceM.entity.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryController {
    @RabbitListener(queues = Constants.QUEUE )
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message Received from queue: " +orderStatus );
    }
}
