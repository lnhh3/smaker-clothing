package com.project.smaker.repository.order;

import com.project.smaker.model.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderJpaRepo extends JpaRepository<OrderEntity, Integer> {
}
