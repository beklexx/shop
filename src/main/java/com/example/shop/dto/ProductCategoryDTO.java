package com.example.shop.dto;

public class ProductCategoryDTO {
    private String name;

    public ProductCategoryDTO() {
    }

    public ProductCategoryDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
