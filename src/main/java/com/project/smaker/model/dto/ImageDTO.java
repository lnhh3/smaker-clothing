package com.project.smaker.model.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ImageDTO {
    private int imageID;

    private String imageName;

    private String imageUrl;

    private int productID;

    private ProductDTO productDTO;
}
