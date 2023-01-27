package com.careerdevs.productservice.repository;

import com.careerdevs.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository <Product,String> {
}
