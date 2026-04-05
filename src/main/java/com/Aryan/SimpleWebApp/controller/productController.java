package com.Aryan.SimpleWebApp.controller;

import com.Aryan.SimpleWebApp.model.Product;
import com.Aryan.SimpleWebApp.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class productController {

    @Autowired
    productService service;

    @RequestMapping("/products")
    public List<Product> getProduct() {
        return service.getProduct();
    }

    @RequestMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") int id) {
         return service.getProductById(id);
    }
}
