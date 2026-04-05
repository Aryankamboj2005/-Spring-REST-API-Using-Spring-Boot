package com.Aryan.SimpleWebApp.service;

import com.Aryan.SimpleWebApp.Model.product;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
// make the object of the class so that we can uuse it at any other place
public class productService {

    List<product> products = Arrays.asList(
            new product(100, "laptop", 101),
            new product(50, "mouse", 102),
            new product(150, "camera", 103)
    );

    public List<product> getProduct() {
        return products;
    }
}
