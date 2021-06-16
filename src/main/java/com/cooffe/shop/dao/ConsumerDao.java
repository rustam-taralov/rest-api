package com.cooffe.shop.dao;

import com.cooffe.shop.model.Consumer;

import java.util.List;
import java.util.Optional;

public interface ConsumerDao {

    void createCustomer(Consumer customer);

    void updateCustomer(Consumer customer);

    void deleteCustomer(Long id);

    List<Consumer> getAllCustomer();

    Optional<Consumer> getConsumerById(Long id);
}
