package com.project.smaker.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ORDERDETAIL")
public class DetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DETAILID")
    int detailId;

    @Column(name = "DETAIL")
    String detail;

    @Column(name = "QUANTITY")
    int quantity;

    @Column(name = "PRICE")
    float price;

    @ManyToOne(fetch = FetchType.EAGER,
                cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDERID")
    @ToString.Exclude
    private OrderEntity orderEntity;
}
