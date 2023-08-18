package com.interswitch.legitProducts.service;

import com.interswitch.legitProducts.model.Product;

import java.util.Collection;
import java.util.Optional;

public interface IProductService {
    String createProduct(Product product);
    Optional<Product> findProduct(String id);
    Collection<Product> findAllProducts();
    void delete(String id);
    Product update(String id);

}
