package com.interswitch.legitProducts.controller;

import com.interswitch.legitProducts.model.Product;
import com.interswitch.legitProducts.service.impl.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/prod")
public class ProdController {
    private final ProductService productService;

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProducts(){
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @RequestMapping(value = "/products/{id}")
    public ResponseEntity<Object> getProducts(@PathVariable("id") Long id){
        return new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Product product){
        productService.addProduct(product);
        return new ResponseEntity<>("Product created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") Long id, @RequestBody Product product){
        productService.updateProduct(id, product);
        return new ResponseEntity<>("Product updated successfully", HttpStatus.OK);
    }
}
