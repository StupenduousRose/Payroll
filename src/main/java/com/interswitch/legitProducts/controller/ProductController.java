package com.interswitch.legitProducts.controller;

import com.interswitch.legitProducts.model.Product;
import com.interswitch.legitProducts.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proddb")
public class ProductController {
    @Autowired
    IProductService productService;
    @RequestMapping(value = "/products")
    public ResponseEntity<Object> createProduct(@RequestBody Product product){
        productService.createProduct(product);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }
}
