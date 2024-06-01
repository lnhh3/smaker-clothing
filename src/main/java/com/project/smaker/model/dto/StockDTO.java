package com.project.smaker.model.dto;

import com.project.smaker.model.entity.ColorEntity;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StockDTO {
    private int stockID;

    private String size;

    private int amount;

    private List<ColorDTO> colorDTOS;

    private ProductDTO productDTO;
}
