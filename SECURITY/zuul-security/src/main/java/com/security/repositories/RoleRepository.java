package com.security.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.security.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
    //To find a role by it's name
    Role findByRole(String role);
}