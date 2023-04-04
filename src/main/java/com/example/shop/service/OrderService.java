package com.example.shop.service;

import com.example.shop.model.Order;
import com.example.shop.repository.ClientRepo;
import com.example.shop.repository.OrderRepo;
import com.example.shop.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    @Autowired
    ClientRepo clientRepo;
    @Autowired
    ProductRepo productRepo;
    public ArrayList<Order> getOrders() {
        return (ArrayList<Order>) orderRepo.findAll();
    }


}
