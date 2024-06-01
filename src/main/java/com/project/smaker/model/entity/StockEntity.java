package com.project.smaker.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "STOCK")
public class StockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STOCKID")
    private int stockId;

    @Column(name = "SIZE")
    private String size;

    @Column(name = "AMOUNT")
    private int amount;

    @OneToMany(mappedBy = "stockEntity",
                cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<ColorEntity> colorEntities;

    @ManyToOne(fetch = FetchType.EAGER,
                cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCTID")
    @ToString.Exclude
    private ProductEntity productEntity;
}
