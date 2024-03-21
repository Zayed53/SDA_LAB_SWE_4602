package com.example.ProductService.service;

import com.example.ProductService.entity.Product;
import com.example.ProductService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){ return productRepository.save(product);}

    public Product findProductById(String productId){ return productRepository.findProductById(productId);}
}
