package com.project.smaker.repository.detail;

import com.project.smaker.model.entity.DetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetailJpaRepo extends JpaRepository<DetailEntity, Integer> {
}
