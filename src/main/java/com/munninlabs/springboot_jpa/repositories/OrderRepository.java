package com.munninlabs.springboot_jpa.repositories;

import com.munninlabs.springboot_jpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Custom query methods can be defined here if needed
    // For example, findByEmail(String email);


}

