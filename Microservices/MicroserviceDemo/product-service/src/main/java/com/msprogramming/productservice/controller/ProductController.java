package com.msprogramming.productservice.controller;

import com.msprogramming.productservice.dto.ProductDTO;
import com.msprogramming.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductDTO productDTO){

        productService.createProduct(productDTO);

    }
    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<ProductDTO> getAllProduct(){
        return productService.getAllProducts();
    }
}
