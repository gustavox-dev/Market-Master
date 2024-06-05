package com.example.Market.Master.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    // id, produto, quantidade, preço unitário, subtotal
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String product;

    private Integer quantity;

    private Double unityPrice;

    private Double subTotal;
}
