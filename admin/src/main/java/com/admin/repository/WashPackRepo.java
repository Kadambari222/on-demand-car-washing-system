package com.admin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.admin.model.WashPacks;

public interface WashPackRepo extends MongoRepository<WashPacks, String> {
}
