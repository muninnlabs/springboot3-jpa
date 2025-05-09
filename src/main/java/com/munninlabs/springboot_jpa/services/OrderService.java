package com.munninlabs.springboot_jpa.services;

import com.munninlabs.springboot_jpa.entities.Order;
import com.munninlabs.springboot_jpa.entities.User;
import com.munninlabs.springboot_jpa.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

}
