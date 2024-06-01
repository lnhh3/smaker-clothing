package com.project.smaker.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name = "CATEGORY")
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORYID")
    private int categoryID;

    @Column(name = "CATEGORYNAME")
    private String categoryName;

    @OneToMany(mappedBy = "categoryEntity",
                cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<ProductEntity> productEntityList;
}
