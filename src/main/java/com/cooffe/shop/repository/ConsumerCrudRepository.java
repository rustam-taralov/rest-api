package com.cooffe.shop.repository;

import com.cooffe.shop.model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerCrudRepository extends JpaRepository<Consumer, Long> {
}
