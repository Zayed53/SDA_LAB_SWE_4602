package com.example.InventoryServiceM;

import com.example.InventoryServiceM.entity.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {
    public static final String QUEUE = "rabbit_queue";
    public static final String EXCHANGE = "rabbit_exchange";
    public static final String ROUTING_KEY = "rabbit_routingKey";

    public static List<Product> productList=new ArrayList<>(List.of(new Product("1", "Burger", 3), new Product("2", "Pizza", 2), new Product("3", "Chicken Fry", 0)));

}