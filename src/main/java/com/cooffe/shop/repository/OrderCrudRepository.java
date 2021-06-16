package com.cooffe.shop.repository;

import com.cooffe.shop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderCrudRepository extends JpaRepository<Order, Long> {
}
