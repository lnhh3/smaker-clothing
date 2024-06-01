package com.project.smaker.service.category;

import com.project.smaker.model.dto.CategoryDTO;
import com.project.smaker.model.entity.CategoryEntity;

import java.util.List;

public interface ICategoryService {
    List<CategoryDTO> getCategories();
    CategoryDTO getCategory(int categoryID);
    CategoryEntity postCategory(CategoryDTO categoryDTO);
    CategoryEntity putCategory(int categoryID, CategoryDTO categoryDTO);
    void deleteCategory(int categoryID);
}
