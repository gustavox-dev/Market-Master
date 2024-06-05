package com.example.Market.Master.service;

import com.example.Market.Master.domain.Product;
import com.example.Market.Master.dto.ProductDTO;
import com.example.Market.Master.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private Productrepository repo;

    @Autowired
    private CategoryService categoryService;

    public Product createProduct(ProductDTO productDTO){
        Product product = Product.builder()
                .name(productDTO.name())
                .description(productDTO.description())
                .price(productDTO.price())
                .quantityInStock(productDTO.quantityInStock())
                .category(categoryService.findById(productDTO.categoryId()))
                .build();

        repo.save(product);

        return product;
    }

    public List<Product> findAll(){
        return repo.findAll();
    }

    public List<Product> findAllByCategoryById(Integer id){
        return repo.findAllByCategoryId(id);
    }
}
