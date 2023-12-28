package com.yorane.productservice.repository;

import com.yorane.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductRepository extends JpaRepository<Product, Long> {

}
