package com.cooffe.shop.dao;

import com.cooffe.shop.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderDao {

    void createProduct(Order orderedProducts);

    void updateOrder(Order orderedProducts);

    void deleteOrder(Long id);

    List<Order> getAllOrder();

    Optional<Order> getAllById(Long id);
}
