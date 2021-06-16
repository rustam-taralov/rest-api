package com.cooffe.shop.dto;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Builder
public class ConsumerDto implements Serializable {


    private Long id;

    private String name;

    private String surName;

    private String userName;

    private String password;

    private double balance;

    private String addressName;

    private Long orderId;

}
