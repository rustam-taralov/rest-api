package com.cooffe.shop.controller;

import com.cooffe.shop.dto.ConsumerDto;
import com.cooffe.shop.service.ConsumerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private ConsumerService consumerService;

    @GetMapping("/get")
    public ResponseEntity<List<?>> getAllConsumes(){
        return ResponseEntity.ok(consumerService.getAllConsumer());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getConsumerById(@PathVariable("id") Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok(consumerService.getAllById(id));
    }

    @PostMapping("/set")
    public void saveConsumer(@RequestBody ConsumerDto consumer){
        consumerService.createConsumer(consumer);
    }

    @PutMapping("/set/{id}")
    public void setConsumer(@RequestBody ConsumerDto consumer,
                            @PathVariable("id") Long id){
        consumerService.updateConsumer(consumer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteConsumer(@PathVariable("id") Long id){
        consumerService.deleteConsumer(id);
    }
}
