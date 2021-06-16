package com.cooffe.shop.model;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Builder
public class Consumer implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    private Long id;

    private String name;

    private String surName;

    private String userName;

    @NotNull
    private String password;

    private double balance;

    private String addressName;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<Order> orders;

}
