package com.cooffe.shop.dto;

import com.cooffe.shop.model.Order;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class ProductDto {

    private Long id;

    private String productName;

    private double price;

    private List<Order> orders;
}
