package com.example.shop.controller;

import com.example.shop.dto.ProductDTO;
import com.example.shop.model.Product;
import com.example.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    ArrayList<Product> getProducts() {
        return productService.getProducts();
    }
    @PostMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    void addProduct(@RequestBody ProductDTO productDTO){
        productService.addProduct(productDTO);
    }
}
