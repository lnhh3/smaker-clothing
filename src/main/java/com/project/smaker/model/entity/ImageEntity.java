package com.project.smaker.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "IMAGE")
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IMAGEID")
    private
    int imageID;

    @Column(name = "IMAGENAME")
    private
    String imageName;

    @Column(name = "URL")
    private String imageUrl;

    @ManyToOne(fetch = FetchType.EAGER,
                cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCTID")
    @ToString.Exclude
    private ProductEntity productEntity;
}
