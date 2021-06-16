package com.cooffe.shop.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


@Data
@Builder
public class OrderDto {

    private Long id;

    private String createdDate;

    private String orderFinishDate;

    private String orderStatus;

    private Long customerId;

    private Long productId;
}
