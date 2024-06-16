package com.example.Market.Master.controller;

import com.example.Market.Master.domain.Product;
import com.example.Market.Master.dto.ProductDTO;
import com.example.Market.Master.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService service;

    @PostMapping
    public Product createProduct(@RequestBody ProductDTO product){
        LOG.info("::: Create product ::: ");
        return service.createProduct(product);
    }

    @GetMapping
    public List<Product> findAll(){
        LOG.info("::: List all categories ::: ");
        return service.findAll();
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> findAllByCategoryById(@PathVariable("categoryId") Integer categoryId){
        return service.findAllByCategoryById(categoryId);
    }
}
