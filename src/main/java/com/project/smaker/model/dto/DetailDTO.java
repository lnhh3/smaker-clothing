package com.project.smaker.model.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetailDTO {
    private int detailID;

    private String detail;

    private int quantity;

    private float price;

    private OrderDTO orderDTO;
}
