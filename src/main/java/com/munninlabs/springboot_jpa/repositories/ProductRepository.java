package com.munninlabs.springboot_jpa.repositories;

import com.munninlabs.springboot_jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
