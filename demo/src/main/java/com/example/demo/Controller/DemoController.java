package com.example.demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.Product;
import com.example.demo.Service.DemoService;

@RestController
@RequestMapping(value = "/product")
public class DemoController {

    @Autowired(required = true)
    private DemoService demoService;

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/get/{key}")
    public Product getProduct(@PathVariable("key") String key){
        LOGGER.info("Request Received to get product details : {}", key);
        return demoService.getProductDetails(key);
    }

    @PutMapping("/update/{key}")
    public String updateProduct(@PathVariable("key") String key, @RequestBody Product product){
        LOGGER.info("Request Received to update product details : {} Product : {}", key, product);
        return demoService.updateProductDetails(product, key);
    }

    @PostMapping("/save")
    public String saveProduct(@RequestBody Product product){
        LOGGER.info("Request Received to save product details : {}", product);
        return demoService.saveProductDetails(product);
    }

    @DeleteMapping("/delete/{key}")
    public String deleteProduct(@PathVariable("key") String key){
        LOGGER.info("Request Received to delete product details : {}", key);
        return demoService.deleteProductDetails(key);
    }
}
