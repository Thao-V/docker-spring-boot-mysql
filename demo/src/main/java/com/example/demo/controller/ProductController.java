package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    public ProductController(){

    }
    @GetMapping(value="")
    public List<Product> getProducts(){
        return List.of(
                new Product(1001L, "iPhone 10XS", 1000.00, 100, LocalDate.of(2019, 1, 15)),
                new Product(1001L, "iPhone 12XS", 1000.00, 100, LocalDate.of(2022, 1, 15)),
                new Product(1001L, "iPhone 13XS", 1000.00, 100, LocalDate.of(2023, 1, 15)),
                new Product(1001L, "iPhone 14XS", 1000.00, 100, LocalDate.of(2024, 1, 15))
        );
    }

}
