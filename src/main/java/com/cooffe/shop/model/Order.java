package com.cooffe.shop.model;

import com.cooffe.shop.enums.OrderStatues;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String createdDate;

    private String orderFinishDate;

    @Enumerated(value = EnumType.STRING)
    private OrderStatues orderStatus;

    @ManyToOne
    private Consumer customer;

    @ManyToOne
    private Product product;
}
