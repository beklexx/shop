package com.example.shop.service;

import com.example.shop.dto.ProductCategoryDTO;
import com.example.shop.model.ProductCategory;
import com.example.shop.repository.ProductCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductCategoryService {
    @Autowired
    ProductCategoryRepo productCategoryRepo;
    public ArrayList<ProductCategory> getProductCategories(){
        return (ArrayList<ProductCategory>) productCategoryRepo.findAll();
    }
}
