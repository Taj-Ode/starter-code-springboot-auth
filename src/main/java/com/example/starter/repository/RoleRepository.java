package com.example.starter.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.starter.models.ERole;
import com.example.starter.models.Role;

public interface RoleRepository extends MongoRepository{
    Optional <Role> findByName(ERole name);
}
