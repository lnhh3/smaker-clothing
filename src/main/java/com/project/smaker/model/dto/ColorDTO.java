package com.project.smaker.model.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ColorDTO {
    private int colorID;

    private String colorName;

    private StockDTO stockDTO;
}
