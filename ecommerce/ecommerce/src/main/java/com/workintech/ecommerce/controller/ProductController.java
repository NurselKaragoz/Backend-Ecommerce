package com.workintech.ecommerce.controller;

import com.workintech.ecommerce.dto.ProductResponse;
import com.workintech.ecommerce.entity.Product;
import com.workintech.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {

        this.productService = productService;
    }

    @PostMapping("/")
    public Product save(@RequestBody Product product) {
        Product savedProduct = productService.save(product);
        return savedProduct;
    }

    @GetMapping("/")
    public List<ProductResponse> findAll() {
        return productService.findAll();
    }

}
