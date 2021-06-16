package com.cooffe.shop.dao.impl;

import com.cooffe.shop.dao.OrderDao;
import com.cooffe.shop.model.Order;
import com.cooffe.shop.repository.OrderCrudRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderDaoImpl implements OrderDao {

    private final OrderCrudRepository orderCrudRepository;

    @Override
    public void createProduct(Order orderedProducts) {
        orderCrudRepository.save(orderedProducts);
    }

    @Override
    public void updateOrder(Order orderedProducts) {
        orderCrudRepository.save(orderedProducts);
    }

    @Override
    public void deleteOrder(Long id) {
        orderCrudRepository.deleteById(id);
    }

    @Override
    public List<Order> getAllOrder() {
        return orderCrudRepository.findAll();
    }

    @Override
    public Optional<Order> getAllById(Long id) {
        return orderCrudRepository.findById(id);
    }
}
