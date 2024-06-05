package com.example.Market.Master.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    // id, cliente, data do pedido, lista de itens do pedido, status do pedido
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String cliente;
    private LocalDateTime orderDate;
    private List<String> pedidos;
    private boolean orderStatus;
}
