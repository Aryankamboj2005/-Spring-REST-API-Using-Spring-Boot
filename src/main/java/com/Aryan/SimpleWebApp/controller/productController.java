package com.Aryan.SimpleWebApp.controller;

import com.Aryan.SimpleWebApp.Model.product;
import com.Aryan.SimpleWebApp.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class productController {

//    @Autowired
//    productService service;
//
//    @GetMapping("/products")
//    public List<product> getProducts() {
//        return service.getProduct();
//    }
    @Autowired
    productService service;

    @RequestMapping("/products")
    public List<product> getProduct() {
        return service.getProduct();
    }
}
