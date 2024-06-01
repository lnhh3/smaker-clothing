package com.project.smaker.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USERORDER")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDERID")
    private int orderId;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "PHONENUMBER")
    private String phoneNumber;

    @Column(name = "NOTE")
    private String note;

    @Column(name = "PAYMENTMETHOD")
    private String paymentMethod;

    @Column(name = "TRANSACTIONDATE")
    private LocalDateTime transactionDate;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DELIVERYLOCATION")
    private String deliveryLocation;

    @OneToMany(mappedBy = "orderEntity",
                cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<DetailEntity> detailEntities;
}
