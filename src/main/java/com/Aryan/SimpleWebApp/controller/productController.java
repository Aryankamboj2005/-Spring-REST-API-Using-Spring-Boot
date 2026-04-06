package com.Aryan.SimpleWebApp.controller;

import com.Aryan.SimpleWebApp.model.Product;
import com.Aryan.SimpleWebApp.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {

    @Autowired
    productService service;

    @GetMapping("/products")
    public List<Product> getProduct() {
        return service.getProduct();
    }

    @PostMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return service.getProductById(id);
    }

    // adding data to the server
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
       // @RequestBody annotation tells Spring:
       // "Hey Spring, look inside the BODY of this HTTP Request, find the JSON there, and convert
        // it into this Product object for me."
        service.addProduct(product);
        
       return service.getProductById(product.getProductId()); // this will return the
                 // object we have created
    }

}
