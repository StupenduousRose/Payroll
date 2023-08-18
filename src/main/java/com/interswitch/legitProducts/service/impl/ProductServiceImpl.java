package com.interswitch.legitProducts.service.impl;

import com.interswitch.legitProducts.model.Product;
import com.interswitch.legitProducts.repository.ProductRepository;
import com.interswitch.legitProducts.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public String createProduct(Product product) {
        final Optional<Product> existingProduct = productRepository.findById(product.getId());
        if(existingProduct.isPresent()){
            throw new RuntimeException("Product already exist.");
        }
        final Product savedProduct = productRepository.save(product);
        return "Product with id "+savedProduct.getId()+" successfully created.";
    }

    @Override
    public Optional<Product> findProduct(String id) {
        return Optional.empty();
    }

    @Override
    public Collection<Product> findAllProducts() {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Product update(String id) {
        return null;
    }
}
