package com.project.smaker.repository.category;

import com.project.smaker.model.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryJpaRepo extends JpaRepository<CategoryEntity, Integer> {
}
