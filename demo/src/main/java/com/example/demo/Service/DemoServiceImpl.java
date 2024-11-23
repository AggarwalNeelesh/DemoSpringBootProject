package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.Product;

@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public Product getProductDetails(String key) {
        Product product = new Product();
        return product;
    }

    @Override
    public String updateProductDetails(Product product, String key) {
        return "The product has been updated";
    }

    @Override
    public String saveProductDetails(Product product) {
        return "The product has been saved";
    }

    @Override
    public String deleteProductDetails(String key) {
        return "The product has been deleted";
    }
    
}
