package com.project.smaker.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCT")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCTID")
    private
    int productID;

    @Column(name = "PRODUCTNAME")
    private
    String productName;

    @Column(name = "PRICE")
    private
    float price;

    @Column(name = "DESCRIPTION")
    private
    String description;

    @ManyToOne(fetch = FetchType.EAGER,
                cascade = CascadeType.ALL)
    @JoinColumn(name = "CATEGORYID")
    @ToString.Exclude
    private CategoryEntity categoryEntity;

    @OneToMany(mappedBy = "productEntity",
                cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<StockEntity> stockEntities;

    @OneToMany(mappedBy = "productEntity",
                cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<ImageEntity> imageEntities;
}
