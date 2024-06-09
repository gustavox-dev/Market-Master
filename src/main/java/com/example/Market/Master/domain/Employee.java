package com.example.Market.Master.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

// Funcionário
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    // id, nome, cargo, salário, data de contratação
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String cargo;

    private Double salary;

    private LocalDateTime contractDate;
}
