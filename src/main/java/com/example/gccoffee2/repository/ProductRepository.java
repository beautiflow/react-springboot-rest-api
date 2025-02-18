package com.example.gccoffee2.repository;

import com.example.gccoffee2.model.Category;
import com.example.gccoffee2.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {

    List<Product> findAll();

    Product insert(Product product);

    Product update(Product product);

    Optional<Product> findById(UUID ProductId);

    Optional<Product> findByName(String productName);

    List<Product> findByCategory(Category category);

    void deleteAll();

}
