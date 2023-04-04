package com.example.shop.dto;

import com.example.shop.model.Client;
import com.example.shop.model.Product;

public class OrderDTO {
    Client client;
    Product product;
    Float qty;
    Float salePrice;

    public OrderDTO() {
    }

    public OrderDTO(Client client, Product product, Float qty, Float salePrice) {
        this.client = client;
        this.product = product;
        this.qty = qty;
        this.salePrice = salePrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Float getQty() {
        return qty;
    }

    public void setQty(Float qty) {
        this.qty = qty;
    }

    public Float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Float salePrice) {
        this.salePrice = salePrice;
    }
}
