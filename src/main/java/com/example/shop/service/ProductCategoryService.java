package com.example.shop.service;

import com.example.shop.dto.ProductCategoryDTO;
import com.example.shop.dto.ProductDTO;
import com.example.shop.model.Product;
import com.example.shop.model.ProductCategory;
import com.example.shop.repository.ProductCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductCategoryService {
    @Autowired
    ProductCategoryRepo productCategoryRepo;
    @Autowired
    public ArrayList<ProductCategory> getProductCategories(){
        return (ArrayList<ProductCategory>) productCategoryRepo.findAll();
    }
    public void addProductCategory(ProductCategoryDTO productCategoryDTO){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setName(productCategoryDTO.getName());
        productCategoryRepo.save(productCategory);
    }
}
