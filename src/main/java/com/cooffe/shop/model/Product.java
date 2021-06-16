package com.cooffe.shop.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Builder
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    private Long id;

    private String productName;

    private double price;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    private List<Order> orders;
}
