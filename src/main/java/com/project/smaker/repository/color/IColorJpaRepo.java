package com.project.smaker.repository.color;

import com.project.smaker.model.entity.ColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IColorJpaRepo extends JpaRepository<ColorEntity, Integer> {}
