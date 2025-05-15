package com.munninlabs.springboot_jpa.services;

import com.munninlabs.springboot_jpa.entities.Category;
import com.munninlabs.springboot_jpa.entities.User;
import com.munninlabs.springboot_jpa.repositories.CategoryRepository;
import com.munninlabs.springboot_jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

}
