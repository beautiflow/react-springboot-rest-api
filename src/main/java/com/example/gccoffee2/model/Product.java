package com.example.gccoffee2.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Product {
    private final UUID productId;   // 고유의 ID 있어야 함. 한번 만들면 변경이 불가하게 해야하기 때문에 final 로 만듦.
    private String productName;  // 이름은 변경할 수 있기 때문에 String.
    private Category category;
    private long price;  // 가격 정보를 받아야하기 때문에. 소수점 신경쓰지않게 하려고 long 을 사용.
    private String description;  // 상품에 대한 description 을 전달받도록
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Product(UUID productId, String productName, Category category, long price) {  // 초기에 product 를 생성하기 위한 필수적 정보들
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Product(UUID productId, String productName, Category category, long price, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    // 전체적인 getter 는 생성해줘야 함
    public UUID getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Category getCategory() {
        return category;
    }

    public long getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    // setter 는 바꿀 수 있는 것들만 생성
    public void setProductName(String productName) {
        this.productName = productName;
        this.updatedAt = LocalDateTime.now();
    }

    public void setCategory(Category category) {
        this.category = category;
        this.updatedAt = LocalDateTime.now();
    }

    public void setPrice(long price) {
        this.price = price;
        this.updatedAt = LocalDateTime.now();
    }

    public void setDescription(String description) {
        this.description = description;
        this.updatedAt = LocalDateTime.now();
    }
}
