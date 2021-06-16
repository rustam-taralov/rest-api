package com.cooffe.shop.service.impl;

import com.cooffe.shop.dao.ConsumerDao;
import com.cooffe.shop.dto.ConsumerDto;
import com.cooffe.shop.model.Consumer;
import com.cooffe.shop.service.ConsumerService;
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
public class ConsumerServiceImpl implements ConsumerService {

    private final ConsumerDao consumerDao;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public void createConsumer(ConsumerDto consumer) {
        log.info("Consumer is accepted {}", consumer);

        if(consumer!=null){
            consumerDao.createCustomer(modelMapper.map(consumer,Consumer.class));
            log.info("{} was saved", consumer);
        }
    }

    @Override
    @Transactional
    public void updateConsumer(ConsumerDto consumer) {
        log.info("Consumer is accepted {}", consumer);

        if(consumer!=null){
            consumerDao.createCustomer(modelMapper.map(consumer,Consumer.class));
            log.info("{} was updated", consumer);
        }
    }

    @Override
    @Transactional
    public void deleteConsumer(Long id) {
        if(id!=null&& id!=0){
            consumerDao.deleteCustomer(id);
            log.info("{} was deleted", consumerDao.getConsumerById(id));
        }
    }

    @Override
    public List<ConsumerDto> getAllConsumer() {
        List<ConsumerDto> consumers= consumerDao.getAllCustomer().stream().
                map((m)->modelMapper.map(m,ConsumerDto.class)).collect(Collectors.toList());
        return consumers;
    }

    @Override
    public ConsumerDto getAllById(Long id) {

        if(id!=0&&id!=null) {
            Optional<Consumer> consumer = consumerDao.getConsumerById(id);
            if(consumer.isPresent()){
                return modelMapper.map(consumer.get(),ConsumerDto.class);
            }
        }
        return null;
    }
}
