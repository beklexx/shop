package com.example.shop.controller;

import com.example.shop.dto.ProductCategoryDTO;
import com.example.shop.model.ProductCategory;
import com.example.shop.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class ProductCategoryController {
    @Autowired
    private ProductCategoryService productCategoryService;
    @GetMapping("/productCategories")
    ArrayList<ProductCategory> getProductCategories() {
        return productCategoryService.getProductCategories();
    }
    @PostMapping(value = "/productCategories", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    void addProductCategory(@RequestBody ProductCategoryDTO productCategoryDTO){
        productCategoryService.addProductCategory(productCategoryDTO);
    }
}
