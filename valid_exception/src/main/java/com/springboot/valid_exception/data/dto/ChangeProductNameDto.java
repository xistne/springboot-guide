package com.springboot.valid_exception.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ChangeProductNameDto {
    private Long number;
    private String name;
}
