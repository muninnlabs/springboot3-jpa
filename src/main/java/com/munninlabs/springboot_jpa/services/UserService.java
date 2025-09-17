package com.munninlabs.springboot_jpa.services;

import com.munninlabs.springboot_jpa.entities.User;
import com.munninlabs.springboot_jpa.repositories.UserRepository;
import com.munninlabs.springboot_jpa.services.exceptions.DatabaseException;
import com.munninlabs.springboot_jpa.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(UserService.class);


    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }
        try {
            userRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            log.error("Database integrity violation", e);
            throw new DatabaseException(e.getMessage());
        }
    }

    public User updateUser(Long Id, User user) {
        try {
            User entity = userRepository.getReferenceById(Id);
            updateData(entity, user);
            return userRepository.save(entity);
        } catch ( EntityNotFoundException e ) {
            throw new ResourceNotFoundException(Id);
        }
    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }

}
