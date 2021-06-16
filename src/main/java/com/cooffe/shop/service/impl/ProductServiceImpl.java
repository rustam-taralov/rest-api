package com.cooffe.shop.service.impl;

import com.cooffe.shop.dao.ConsumerDao;
import com.cooffe.shop.dao.ProductDao;
import com.cooffe.shop.dto.ConsumerDto;
import com.cooffe.shop.dto.ProductDto;
import com.cooffe.shop.model.Consumer;
import com.cooffe.shop.model.Product;
import com.cooffe.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public void createProduct(ProductDto product) {
        log.info("Product is accepted {}", product);

        if(product!=null){
            productDao.createProduct(modelMapper.map(product, Product.class));
            log.info("{} was saved", product);
        }
    }

    @Override
    @Transactional
    public void updateProduct(ProductDto product) {
        log.info("Product is accepted {}", product);

        if(product!=null){
            productDao.createProduct(modelMapper.map(product, Product.class));
            log.info("{} was saved", product);
        }
    }

    @Override
    @Transactional
    public void deleteProduct(Long id) {
        if(id!=null&& id!=0){
            productDao.deleteProduct(id);
            log.info("{} was deleted", productDao.getProductById(id));
        }
    }

    @Override
    public List<ProductDto> getAllProduct() {

        List<ProductDto> products= productDao.getAllProduct().stream().
                map((m)->modelMapper.map(m,ProductDto.class)).collect(Collectors.toList());
        return products;

    }

    @Override
    public ProductDto getAllById(Long id) {

        if(id!=null&& id!=0) {
            Optional<Product> product = productDao.getProductById(id);
            if(product.isPresent()){
                return modelMapper.map(product.get(),ProductDto.class);
            }
        }
        return null;

    }
}
