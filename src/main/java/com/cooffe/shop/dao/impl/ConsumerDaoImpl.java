package com.cooffe.shop.dao.impl;

import com.cooffe.shop.dao.ConsumerDao;
import com.cooffe.shop.model.Consumer;
import com.cooffe.shop.repository.ConsumerCrudRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConsumerDaoImpl implements ConsumerDao {

    private final ConsumerCrudRepository consumerCrudRepository;

    @Override
    public void createCustomer(Consumer consumer) {
        consumerCrudRepository.save(consumer);
    }

    @Override
    public void updateCustomer(Consumer consumer) {
        consumerCrudRepository.save(consumer);
    }

    @Override
    public void deleteCustomer(Long id) {
        consumerCrudRepository.deleteById(id);
    }

    @Override
    public List<Consumer> getAllCustomer() {
        return consumerCrudRepository.findAll();
    }

    @Override
    public Optional<Consumer> getConsumerById(Long id) {
        return consumerCrudRepository.findById(id);
    }
}
