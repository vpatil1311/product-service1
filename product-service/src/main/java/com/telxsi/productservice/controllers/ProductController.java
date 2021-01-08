package com.telxsi.productservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telxsi.productservice.model.Product;
import com.telxsi.productservice.services.ProductsService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductsService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
	return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping
    @RequestMapping("/{productId}")
    public ResponseEntity<Product> findByProductId(@PathVariable String productId) {
	try {
	    return new ResponseEntity<>(productService.findByProductId(productId), HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
    }

}
