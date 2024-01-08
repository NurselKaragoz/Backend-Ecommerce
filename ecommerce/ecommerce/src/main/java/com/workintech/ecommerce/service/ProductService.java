package com.workintech.ecommerce.service;

import com.workintech.ecommerce.dto.ProductResponse;
import com.workintech.ecommerce.entity.Product;

import java.util.List;


public interface ProductService {
    Product save(Product product);
    List<ProductResponse> findAll();}
