package com.example.Market.Master.controller;

import com.example.Market.Master.domain.Category;
import com.example.Market.Master.dto.CategoryDTO;
import com.example.Market.Master.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private static final Logger LOG = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private CategoryService service;

    @PostMapping
    public CategoryDTO createCategory(@RequestBody CategoryDTO category){
        LOG.info("::: Create category ::: ");
        return service.createCategory(category);
    }

    @GetMapping
    public List<Category> findAll(){
        LOG.info("::: List all categories ::: ");
        return service.findAll();
    }
}
