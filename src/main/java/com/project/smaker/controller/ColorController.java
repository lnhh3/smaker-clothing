package com.project.smaker.controller;

import com.project.smaker.service.color.ColorService;
import com.project.smaker.model.dto.ColorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/color")
public class ColorController {
    @Autowired
    private ColorService colorService;

    @GetMapping
    public ResponseEntity<List<ColorDTO>> getColors() {
        return new ResponseEntity(colorService.getColors(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ColorDTO> getColor(@PathVariable("id") int colorID) {
        return new ResponseEntity(colorService.getColor(colorID), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ColorDTO> postColor(@RequestBody ColorDTO colorDTO) {
        return new ResponseEntity(colorService.postColor(colorDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ColorDTO> putColor(@PathVariable("id") int colorID, @RequestBody ColorDTO colorDTO) {
        colorService.putColor(colorID, colorDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ColorDTO> deleteColor(@PathVariable("id") int colorID) {
        colorService.deleteColor(colorID);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
