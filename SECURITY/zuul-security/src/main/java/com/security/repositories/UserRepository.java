package com.security.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.security.models.Role;
import com.security.models.User;

import java.util.List;
import java.util.Set;

public interface UserRepository extends MongoRepository<User, String> {
    //To find a User with his/her email
    User findByEmail(String email);
    //To find user using his/her role
    List<User> findByRolesIn(Set<Role> roles);

}