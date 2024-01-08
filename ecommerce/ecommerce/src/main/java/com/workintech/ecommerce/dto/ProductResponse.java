package com.workintech.ecommerce.dto;

public record ProductResponse(Long id,String name,String description,Double price,Integer stock, Integer rating, Integer sellCount) {
}
