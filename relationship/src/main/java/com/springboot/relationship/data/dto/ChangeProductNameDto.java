package com.springboot.relationship.data.dto;

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
