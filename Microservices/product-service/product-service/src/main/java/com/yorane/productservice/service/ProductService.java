package com.yorane.productservice.service;

import com.yorane.productservice.dto.ProductDTO;
import com.yorane.productservice.model.Product;
import com.yorane.productservice.repository.ProductRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository repo;
    public void createProduct(ProductDTO productDTO){
        ModelMapper mapper =  new ModelMapper();
        Product product = mapper.map(productDTO,Product.class);
        repo.save(product);
    }

    public List<ProductDTO> getAllProducts(){
        ModelMapper mapper = new ModelMapper();
        List<Product> productList = repo.findAll();
        return productList.stream().map(p -> mapper.map(p,ProductDTO.class) ).toList();
    }

}
