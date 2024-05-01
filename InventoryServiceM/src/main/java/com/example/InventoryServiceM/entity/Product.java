package com.example.InventoryServiceM.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    public String Id;
    public String name;
    public int quantity;

//    public Product(String ID, String name, int qnt){
//        this.Id=ID;
//        this.name=name;
//        this.quantity=qnt;
//    }
}


