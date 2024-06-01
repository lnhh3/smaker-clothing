package com.project.smaker.model.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDTO {
    private int orderID;

    private String userName;

    private String phoneNumber;

    private String note;

    private String paymentMethod;

    private LocalDateTime transactionDate;

    private String address;

    private String email;

    private String deliveryLocation;

    private List<DetailDTO> detailDTOS;
}
