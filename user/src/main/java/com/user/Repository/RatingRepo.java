package com.user.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user.model.Ratings;

public interface RatingRepo extends MongoRepository<Ratings, Integer> {

}
