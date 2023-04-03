package com.example.shop.service;

import com.example.shop.dto.ProductDTO;
import com.example.shop.model.Product;
import com.example.shop.model.ProductCategory;
import com.example.shop.repository.ProductCategoryRepo;
import com.example.shop.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    ProductCategoryRepo productCategoryRepo;
    public ArrayList<Product> getProducts(){
        return (ArrayList<Product>) productRepo.findAll();
    }
    public void addProduct(ProductDTO productDTO){
        Product product = new Product();
        Optional<ProductCategory> productCategory =  productCategoryRepo.findById(productDTO.getProductCategoryId());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setProductCategory(productCategory.get());
        productRepo.save(product);
    }
}
