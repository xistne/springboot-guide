package com.springboot.valid_exception.data.dto;

import com.springboot.valid_exception.data.entity.Product;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDto {
    private Long number;
    private String name;
    private int price;
    private int stock;

    public static ProductResponseDto toDto(Product product) {
        return new ProductResponseDto(
                product.getNumber(),
                product.getName(),
                product.getPrice(),
                product.getStock()
        );
    }
}