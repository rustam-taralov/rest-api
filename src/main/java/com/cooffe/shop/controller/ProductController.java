package com.cooffe.shop.controller;

import com.cooffe.shop.dto.ConsumerDto;
import com.cooffe.shop.dto.ProductDto;
import com.cooffe.shop.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @GetMapping("/get")
    public ResponseEntity<List<?>> getAllProduct(){
        return ResponseEntity.ok(productService.getAllProduct());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getProductById(@PathVariable("id") Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok(productService.getAllById(id));
    }

    @PostMapping("/set")
    public void saveProduct(@RequestBody ProductDto product){
        productService.createProduct(product);
    }

    @PutMapping("/set/{id}")
    public void setProduct(@RequestBody ProductDto product,
                            @PathVariable("id") Long id){
        productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }
}
