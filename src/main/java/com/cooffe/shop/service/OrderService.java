package com.cooffe.shop.service;

import com.cooffe.shop.dto.OrderDto;

import java.util.List;

public interface OrderService {

    void createOrder(OrderDto orderedProducts);

    void updateOrder(OrderDto orderedProducts);

    void deleteOrder(Long id);

    List<OrderDto> getAllOrder();

    OrderDto getAllById(Long id);

}
