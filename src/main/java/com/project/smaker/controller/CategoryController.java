package com.project.smaker.controller;

import com.project.smaker.model.dto.CategoryDTO;
import com.project.smaker.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getCategories() {
        return new ResponseEntity(categoryService.getCategories(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> getCategories(@PathVariable("id") int categoryID) {
        return new ResponseEntity(categoryService.getCategory(categoryID), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> postCategory(@RequestBody CategoryDTO categoryDTO) {
        return new ResponseEntity(categoryService.postCategory(categoryDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryDTO> putCategory(@PathVariable("id") int categoryID, @RequestBody CategoryDTO categoryDTO) {
        categoryService.putCategory(categoryID, categoryDTO);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CategoryDTO> deleteCategory(@PathVariable("id") int categoryID) {
        categoryService.deleteCategory(categoryID);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
