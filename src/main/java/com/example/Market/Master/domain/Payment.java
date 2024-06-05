package com.example.Market.Master.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    // id, pedido, valor pago, método de pagamento, data do pagamento
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Double paymentValue;

    private LocalDateTime paymentDate;
}
