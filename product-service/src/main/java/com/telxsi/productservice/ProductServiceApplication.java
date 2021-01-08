package com.telxsi.productservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.telxsi.productservice.model.Product;
import com.telxsi.productservice.repositories.ProductsRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

    @Autowired
    ProductsRepository productsRepository;

    public static void main(String[] args) {
	SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
	productsRepository.deleteAll();

	productsRepository.saveAll(Arrays
		.asList(new Product[] { new Product("1", "Pen", "Its a set of pens", Double.valueOf(10)),
			new Product("2", "Pant", "Its a fabric", Double.valueOf(200.0)),
			new Product("3", "TV", "brand new 2020 model", Double.valueOf(25000.0)),
			new Product("4", "Carrom board", "20 inch wide board", Double.valueOf(1200.0)),
			new Product("5", "Bycycle", "Its a used cycle", Double.valueOf(3500.0)),
			new Product("Headset", "JBL from Herman", Double.valueOf(2800.0)) }));
    }

}
