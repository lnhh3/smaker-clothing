package com.project.smaker.repository.image;

import com.project.smaker.model.entity.ImageEntity;

import java.util.List;

public interface IImageRepo {
    List<ImageEntity> getImages();
    ImageEntity getImage(int imageID);
    ImageEntity putImage(ImageEntity imageEntity);
    ImageEntity postImage(ImageEntity imageEntity);
    void deleteImage(int imageID);
}
