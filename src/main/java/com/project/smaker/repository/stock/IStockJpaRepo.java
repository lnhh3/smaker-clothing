package com.project.smaker.repository.stock;

import com.project.smaker.model.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStockJpaRepo extends JpaRepository<StockEntity, Integer> {
}
