package com.workintech.ecommerce.converter;

import com.workintech.ecommerce.dto.ProductResponse;
import com.workintech.ecommerce.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class DtoConverter {
    public static List<ProductResponse> convertToProductResponseList(List<Product> products) {
        List<ProductResponse> responses = new ArrayList<>();

        products.forEach(product -> {
            responses.add(new ProductResponse(product.getId(), product.getProductName(),
                    product.getProductDescription(), product.getPrice(), product.getStock(), product.getRating(), product.getSellCount()
            ));
        });


        return responses;
    }
}
