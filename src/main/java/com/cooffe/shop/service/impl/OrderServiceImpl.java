package com.cooffe.shop.service.impl;

import com.cooffe.shop.dao.OrderDao;
import com.cooffe.shop.dto.OrderDto;
import com.cooffe.shop.enums.OrderStatues;
import com.cooffe.shop.model.Order;
import com.cooffe.shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.cooffe.shop.enums.OrderStatues.IN_PROCESS;

@Service
@Log4j2
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderDao orderDao;
    private final ModelMapper modelMapper;

    @Override
    @Transactional
    public void createOrder(OrderDto order) {
        log.info("Order is accepted {}", order);

        if(order!=null){
            Order orderC=modelMapper.map(order, Order.class);
            Order.builder().orderStatus(IN_PROCESS);
            orderDao.createProduct(orderC);
            log.info("{} was saved", order);
        }
    }

    @Override
    @Transactional
    public void updateOrder(OrderDto order) {
        log.info("Order is accepted {}", order);

        if(order!=null){
            Order orderC=modelMapper.map(order, Order.class);
            Order.builder().orderStatus(IN_PROCESS);
            orderDao.createProduct(orderC);
            log.info("{} was saved", order);
        }
    }

    @Override
    @Transactional
    public void deleteOrder(Long id) {
        if(id!=null&& id!=0){
            orderDao.deleteOrder(id);
            log.info("{} was deleted", orderDao.getAllById(id));
        }
    }

    @Override
    public List<OrderDto> getAllOrder() {

        List<OrderDto> products= orderDao.getAllOrder().stream().
                map((m)->modelMapper.map(m,OrderDto.class)).collect(Collectors.toList());
        return products;

    }

    @Override
    public OrderDto getAllById(Long id) {
        if(id!=0&&id!=null) {
            Optional<Order> order = orderDao.getAllById(id);
            if(order.isPresent()){
                return modelMapper.map(order.get(),OrderDto.class);
            }
        }
        return null;
    }

}
