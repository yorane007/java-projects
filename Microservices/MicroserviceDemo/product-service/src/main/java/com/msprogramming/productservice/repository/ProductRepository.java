package com.msprogramming.productservice.repository;

import com.msprogramming.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductRepository extends JpaRepository<Product, Long> {

}
