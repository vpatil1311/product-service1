package com.telxsi.productservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telxsi.productservice.model.Product;
import com.telxsi.productservice.repositories.ProductsRepository;

@Service
public class ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    public List<Product> getAllProducts() {
	return productsRepository.findAll();
    }

    public Product findByProductId(String productId) throws Exception {
	Optional<Product> productById = productsRepository.findById(productId);
	if(productById.isPresent()) {
	    return productById.get();
	}else {
	    throw new Exception("Unexpected scenario !! ");
	}
    }
}
