package com.munninlabs.springboot_jpa.resources;

import com.munninlabs.springboot_jpa.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "test", "test@gmail.com", "99999999", "123456");
        return ResponseEntity.ok().body(u);
    }
}
