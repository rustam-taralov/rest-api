package com.cooffe.shop.service;

import com.cooffe.shop.dto.ConsumerDto;
import com.cooffe.shop.model.Consumer;

import java.util.List;
import java.util.Optional;

public interface ConsumerService {

    void createConsumer(ConsumerDto customer);

    void updateConsumer(ConsumerDto customer);

    void deleteConsumer(Long id);

    List<ConsumerDto> getAllConsumer();

    ConsumerDto getAllById(Long id);

}
