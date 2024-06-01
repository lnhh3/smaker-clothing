package com.project.smaker.repository.image;

import com.project.smaker.model.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IImageJpaRepo extends JpaRepository<ImageEntity, Integer> {
}
