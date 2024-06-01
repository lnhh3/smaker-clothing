package com.project.smaker.model.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.print.attribute.standard.MediaSize;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "COLOR")
public class ColorEntity {
    @Id
    @GeneratedValue
    @Column(name = "COLORID")
    private int colorId;

    @Column(name = "COLORNAME")
    private String colorName;

    @ManyToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "STOCKID")
    @ToString.Exclude
    private StockEntity stockEntity;
}
