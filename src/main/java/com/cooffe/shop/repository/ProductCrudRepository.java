package com.cooffe.shop.repository;

import com.cooffe.shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCrudRepository extends JpaRepository<Product, Long> {
}
