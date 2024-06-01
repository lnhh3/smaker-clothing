package com.project.smaker.repository.category;

import com.project.smaker.model.entity.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepo implements ICategoryRepo{
    @Autowired
    private ICategoryJpaRepo categoryJpaRepo;

    @Override
    public List<CategoryEntity> getCategories() {
        return categoryJpaRepo.findAll();
    }

    @Override
    public CategoryEntity getCategory(int categoryID) {
        return categoryJpaRepo.findById(categoryID).get();
    }

    @Override
    public CategoryEntity postCategory(CategoryEntity categoryEntity) {
        return categoryJpaRepo.save(categoryEntity);
    }

    @Override
    public CategoryEntity putCategory(CategoryEntity categoryEntity) {
        return categoryJpaRepo.saveAndFlush(categoryEntity);
    }

    @Override
    public void deleteCategory(int categoryID) {
        categoryJpaRepo.deleteById(categoryID);
    }
}
