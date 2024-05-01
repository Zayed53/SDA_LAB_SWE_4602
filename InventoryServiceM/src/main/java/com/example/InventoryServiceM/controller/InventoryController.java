package com.example.InventoryServiceM.controller;

import com.example.InventoryServiceM.Constants;
import com.example.InventoryServiceM.entity.Order;
import com.example.InventoryServiceM.entity.OrderStatus;
import com.example.InventoryServiceM.entity.Product;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class InventoryController {
    @RabbitListener(queues = Constants.QUEUE )
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message Received from queue: " +orderStatus );
        if(checkItem(orderStatus)){
            System.out.println("Order can be placed, Product is available");
        }else{
            System.out.println("Order can't be placed, Product is not available");
        }
    }

    public boolean checkItem(OrderStatus orderStatus){
        int quantity=orderStatus.getOrder().getQty();
        String productid=orderStatus.getOrder().getProductId();

        for(Product product:Constants.productList){
            if(Objects.equals(product.Id, productid)){
                if(product.quantity>=quantity){
                    return true;
                }
            }
        }
        return false;

    }


}
