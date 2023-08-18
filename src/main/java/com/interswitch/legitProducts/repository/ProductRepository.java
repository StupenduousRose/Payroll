package com.interswitch.legitProducts.repository;

import com.interswitch.legitProducts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
