package com.project.smaker.repository.product;

import com.project.smaker.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductJpaRepo extends JpaRepository<ProductEntity, Integer> {
}
