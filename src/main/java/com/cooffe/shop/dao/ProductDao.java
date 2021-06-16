package com.cooffe.shop.dao;

import com.cooffe.shop.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {
    void createProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Long id);

    List<Product> getAllProduct();

    Optional<Product> getProductById(Long id);
}
