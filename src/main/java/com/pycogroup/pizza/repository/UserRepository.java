package com.pycogroup.pizza.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pycogroup.pizza.model.User;

public interface UserRepository extends MongoRepository<User , String>{

  Optional<User> findByUsername(String phoneNumber);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
