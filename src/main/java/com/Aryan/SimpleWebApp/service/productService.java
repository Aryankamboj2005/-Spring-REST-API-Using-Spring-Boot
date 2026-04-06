package com.Aryan.SimpleWebApp.service;

import com.Aryan.SimpleWebApp.model.Product;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class productService {

    List<Product> products = Arrays.asList(
            new Product(101, "laptop", 100),
            new Product(102, "mouse", 50),
            new Product(103, "camera", 150));

    public List<Product> getProduct() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProductId() == prodId) // this will search the product by id
                .findFirst() // Return the first occurrence
                .orElse(new Product(0, "No Item Found", 0)); // if no item is found 
    }
}
