package com.siddhant.iauro.ProductManagement.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.siddhant.iauro.ProductManagement.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer>{

	Optional<User> findByUsername(String username);



}
