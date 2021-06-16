package com.cooffe.shop.controller;

import com.cooffe.shop.dto.ConsumerDto;
import com.cooffe.shop.dto.OrderDto;
import com.cooffe.shop.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    @GetMapping("/get")
    public ResponseEntity<List<?>> getAllOrders(){
        return ResponseEntity.ok(orderService.getAllOrder());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getOrderById(@PathVariable("id") Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok(orderService.getAllById(id));
    }

    @PostMapping("/set")
    public void saveOrder(@RequestBody OrderDto order){
        orderService.createOrder(order);
    }

    @PutMapping("/set/{id}")
    public void setOrder(@RequestBody OrderDto order,
                            @PathVariable("id") Long id){
        orderService.updateOrder(order);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable("id") Long id){
        orderService.deleteOrder(id);
    }
}
