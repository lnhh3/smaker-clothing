package com.project.smaker.repository.image;

import com.project.smaker.model.entity.ImageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImageRepo implements IImageRepo {
    @Autowired
    private IImageJpaRepo jpaRepo;
    @Override
    public List<ImageEntity> getImages() {
        return jpaRepo.findAll();
    }

    @Override
    public ImageEntity getImage(int imageID) {
        return jpaRepo.findById(imageID).get();
    }

    @Override
    public ImageEntity postImage(ImageEntity imageEntity) {
        return jpaRepo.save(imageEntity);
    }

    @Override
    public ImageEntity putImage(ImageEntity imageEntity) {
        return jpaRepo.saveAndFlush(imageEntity);
    }

    @Override
    public void deleteImage(int imageID) {
        jpaRepo.deleteById(imageID);
    }
}
