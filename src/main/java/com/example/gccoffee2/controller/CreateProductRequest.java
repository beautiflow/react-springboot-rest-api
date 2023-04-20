package com.example.gccoffee2.controller;

import com.example.gccoffee2.model.Category;

public record CreateProductRequest (String productName, Category category, long price, String description){
}
