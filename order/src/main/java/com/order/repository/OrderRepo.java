package com.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.order.model.OrderDetails;

public interface OrderRepo extends MongoRepository<OrderDetails, String> {

}
