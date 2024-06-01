package com.project.smaker.model.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDTO {
    private int productID;

    private String productName;

    private float price;

    private String description;

    private int categoryID;

    private CategoryDTO categoryDTO;

    private List<StockDTO> stockDTOS;

    private List<ImageDTO> imageDTOS;
}
