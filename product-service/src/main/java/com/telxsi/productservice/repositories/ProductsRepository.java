package com.telxsi.productservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.telxsi.productservice.model.Product;

@Repository
public interface ProductsRepository extends MongoRepository<Product, String> {
    
}
