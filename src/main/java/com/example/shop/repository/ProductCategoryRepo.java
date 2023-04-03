package com.example.shop.repository;

import com.example.shop.model.ProductCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepo extends CrudRepository<ProductCategory, Long> {
}
