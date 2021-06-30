package com.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<String> getProducts() {
        final List<String> products = new ArrayList<>();
        products.add("Mobile");
        products.add("Furniture");
        products.add("Computer");
        products.add("TV");

        return products;

    }


}
