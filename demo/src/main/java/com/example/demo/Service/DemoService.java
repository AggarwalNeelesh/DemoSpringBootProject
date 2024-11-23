package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.Product;

public interface DemoService {
    Product getProductDetails(String key);
    String updateProductDetails(Product productUpdate, String key);
    String saveProductDetails(Product product);
    String deleteProductDetails(String key);
}
