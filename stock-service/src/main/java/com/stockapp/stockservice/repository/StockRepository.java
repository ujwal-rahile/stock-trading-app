package com.stockapp.stockservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stockapp.stockservice.model.Stock;

@Repository
public interface StockRepository extends MongoRepository<Stock, String> {

}
