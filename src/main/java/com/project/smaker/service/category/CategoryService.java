package com.project.smaker.service.category;

import com.project.smaker.model.dto.CategoryDTO;
import com.project.smaker.model.entity.CategoryEntity;
import com.project.smaker.repository.category.CategoryRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private CategoryRepo categoryRepo;
    private final ModelMapper mapper = new ModelMapper();

    @Override
    public List<CategoryDTO> getCategories() {
        List<CategoryEntity> categoriesEntity = categoryRepo.getCategories();
        List<CategoryDTO> categoriesDTO = new ArrayList<>();
        categoriesEntity.forEach(categoryEntity -> {
            CategoryDTO categoryDTO = mapper.map(categoryEntity, CategoryDTO.class);
            categoriesDTO.add(categoryDTO);
        });
        return categoriesDTO;
    }

    @Override
    public CategoryDTO getCategory(int categoryID) {
        CategoryEntity categoryEntity = categoryRepo.getCategory(categoryID);
        CategoryDTO categoryDTO = mapper.map(categoryEntity, CategoryDTO.class);
        return categoryDTO;
    }

    @Override
    public CategoryEntity postCategory(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = mapper.map(categoryDTO, CategoryEntity.class);
        return categoryRepo.postCategory(categoryEntity);
    }

    @Override
    public CategoryEntity putCategory(int categoryID, CategoryDTO categoryDTO) {
        categoryDTO.setCategoryID(categoryID);
        CategoryEntity categoryEntity = mapper.map(categoryDTO, CategoryEntity.class);
        return categoryRepo.putCategory(categoryEntity);
    }

    @Override
    public void deleteCategory(int categoryID) {
        categoryRepo.deleteCategory(categoryID);
    }
}
