package com.project.smaker.controller;

import com.project.smaker.service.image.ImageService;
import com.project.smaker.model.dto.ImageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping
    public ResponseEntity<List<ImageDTO>> getImages() {
        return new ResponseEntity(imageService.getImages(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ImageDTO> getImage(@PathVariable("id") int imageID) {
        return new ResponseEntity(imageService.getImage(imageID), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ImageDTO> postImage(@RequestBody ImageDTO imageDTO) {
        return new ResponseEntity(imageService.postImage(imageDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ImageDTO> putImage(@PathVariable("id") int imageID, @RequestBody ImageDTO imageDTO) {
        imageService.putImage(imageID, imageDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ImageDTO> deleteImage(@PathVariable("id") int imageID) {
        imageService.deleteImage(imageID);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
