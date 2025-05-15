package com.munninlabs.springboot_jpa.repositories;

import com.munninlabs.springboot_jpa.entities.Category;
import com.munninlabs.springboot_jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Custom query methods can be defined here if needed
    // For example, findByEmail(String email);


}

