package com.example.Market.Master.repository;

import com.example.Market.Master.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrepository extends JpaRepository<Product, Integer> {
}
