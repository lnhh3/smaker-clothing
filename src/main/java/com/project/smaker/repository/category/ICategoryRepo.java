package com.project.smaker.repository.category;

import com.project.smaker.model.entity.CategoryEntity;

import java.util.List;

public interface ICategoryRepo {
    List<CategoryEntity> getCategories();
    CategoryEntity getCategory(int categoryID);
    CategoryEntity putCategory(CategoryEntity categoryEntity);
    CategoryEntity postCategory(CategoryEntity categoryEntity);
    void deleteCategory(int categoryID);
}
