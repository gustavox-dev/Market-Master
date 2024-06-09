package com.example.Market.Master.service;

import com.example.Market.Master.domain.Category;
import com.example.Market.Master.dto.CategoryDTO;
import com.example.Market.Master.handler.ItemNotFoundException;
import com.example.Market.Master.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public CategoryDTO createCategory(CategoryDTO category){
        Category newCategory = Category.builder()
                .name(category.name())
                .description(category.description())
                .build();

        repo.save(newCategory);
        return new CategoryDTO(category.name(), category.description());
    }

    public List<Category> findAll(){
        return repo.findAll();
    }

    public Category findById(Integer id){
        return repo.findById(id).orElseThrow(() -> new ItemNotFoundException("Product not found"));
    }
}
