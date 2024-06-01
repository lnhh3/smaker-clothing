package com.project.smaker.service.image;

import com.project.smaker.model.dto.ImageDTO;
import com.project.smaker.model.entity.ImageEntity;

import java.util.List;

public interface IImageService {
    List<ImageDTO> getImages();
    ImageDTO getImage(int imageID);
    ImageEntity postImage(ImageDTO imageDTO);
    ImageEntity putImage(int imageID, ImageDTO imageDTO);
    void deleteImage(int imageID);
}
