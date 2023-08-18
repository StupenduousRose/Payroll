package com.interswitch.legitProducts.service.impl;

import com.interswitch.legitProducts.model.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Service
public class ProductService {
    private static Map<Long, Product> productRepo = new HashMap<>();

    static {
        Product bag = new Product();
        bag.setId(1L);
        bag.setName("Bag");
        productRepo.put(bag.getId(), bag);
        Product fish = new Product();
        fish.setId(2L);
        fish.setName("Fish");
        productRepo.put(fish.getId(), fish);
    }

    public void addProduct(Product product){
        productRepo.put(product.getId(), product);
    }

    public void deleteProduct(Long id, Product product){
        if (productRepo.containsKey(id)){
            productRepo.remove(id);
        }
    }

    public void updateProduct(Long id, Product product){
        if (productRepo.containsKey(id)){
            productRepo.remove(id);
            productRepo.put(product.getId(), product);
        }
    }

    public Product getProduct(Long id){
        return productRepo.get(id);
    }

    public Collection<Product> getProducts(){
        return productRepo.values();
    }
}
