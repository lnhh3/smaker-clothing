package com.project.smaker.model.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoryDTO {
    private int categoryID;

    private String categoryName;

    private List<ProductDTO> productDTOS = new ArrayList<>();
}
