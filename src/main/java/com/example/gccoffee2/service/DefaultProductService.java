package com.example.gccoffee2.service;

import com.example.gccoffee2.model.Category;
import com.example.gccoffee2.model.Product;
import com.example.gccoffee2.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class DefaultProductService implements ProductService {

    private final ProductRepository productRepository;

    public DefaultProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProductsByCategory(Category category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(String productName, Category category, long price) {
        var product = new Product(UUID.randomUUID(), productName, category, price); // product 를 만들고 UUID 는 여기서 생성하게 해줌
        return productRepository.insert(product); // productRepository 에서 Insert 한 결과가 반환되도록
    }

    @Override
    public Product createProduct(String productName, Category category, long price, String description) {
        var product = new Product(UUID.randomUUID(), productName, category, price, description, LocalDateTime.now(), LocalDateTime.now()); // description 까지 받으니까 전체를 다 넣어줘서 insert 에서 반환되게
        return productRepository.insert(product);
    }
}
