package com.munninlabs.springboot_jpa.services;

import com.munninlabs.springboot_jpa.entities.Product;
import com.munninlabs.springboot_jpa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository userRepository;

    public List<Product> findAll() {
        return userRepository.findAll();
    }

    public Product findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}
