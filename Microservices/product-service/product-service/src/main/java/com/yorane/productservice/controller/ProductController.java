package com.yorane.productservice.controller;

import com.yorane.productservice.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.yorane.productservice.service.ProductService;

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
