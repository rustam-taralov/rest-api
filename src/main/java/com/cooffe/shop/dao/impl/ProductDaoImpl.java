package com.cooffe.shop.dao.impl;

import com.cooffe.shop.dao.ProductDao;
import com.cooffe.shop.model.Product;
import com.cooffe.shop.repository.ProductCrudRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductDaoImpl implements ProductDao {

    private final ProductCrudRepository productCrudRepository;

    @Override
    public void createProduct(Product product) {
        productCrudRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        productCrudRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productCrudRepository.deleteById(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return productCrudRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productCrudRepository.findById(id);
    }
}
