package com.project.smaker.service.image;

import com.project.smaker.model.dto.ImageDTO;
import com.project.smaker.model.entity.ImageEntity;
import com.project.smaker.repository.image.ImageRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageService implements IImageService{
    @Autowired
    private ImageRepo imageRepo;
    public final ModelMapper mapper = new ModelMapper();

    @Override
    public List<ImageDTO> getImages() {
        List<ImageEntity> imagesEntity = imageRepo.getImages();
        List<ImageDTO> imagesDTO = new ArrayList<>();
        imagesEntity.forEach(imageEntity -> {
            ImageDTO imageDTO = mapper.map(imageEntity, ImageDTO.class);
            imagesDTO.add(imageDTO);
        });
        return imagesDTO;
    }

    @Override
    public ImageDTO getImage(int imageID) {
        var imageEntity = imageRepo.getImage(imageID);
        ImageDTO imageDTO = mapper.map(imageEntity, ImageDTO.class);
        return imageDTO;
    }


    @Override
    public ImageEntity postImage(ImageDTO imageDTO) {
        ImageEntity imageEntity = mapper.map(imageDTO, ImageEntity.class);
        return imageRepo.postImage(imageEntity);
    }

    @Override
    public ImageEntity putImage(int imageID, ImageDTO imageDTO) {
        imageDTO.setImageID(imageID);
        ImageEntity imageEntity = mapper.map(imageDTO, ImageEntity.class);
        return imageRepo.putImage(imageEntity);
    }

    @Override
    public void deleteImage(int imageID) {
        imageRepo.deleteImage(imageID);
    }
}
