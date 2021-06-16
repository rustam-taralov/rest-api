package com.cooffe.shop.service;

import com.cooffe.shop.dto.ProductDto;
import com.cooffe.shop.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    void createProduct(ProductDto product);

    void updateProduct(ProductDto product);

    void deleteProduct(Long id);

    List<ProductDto> getAllProduct();

    ProductDto getAllById(Long id);

}
