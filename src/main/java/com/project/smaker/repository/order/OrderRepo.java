package com.project.smaker.repository.order;

import com.project.smaker.model.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepo implements IOrderRepo{
    @Autowired
    IOrderJpaRepo jpaRepo;

    @Override
    public List<OrderEntity> getOrders() {
        return jpaRepo.findAll();
    }

    @Override
    public OrderEntity getOrder(int orderId) {
        return jpaRepo.findById(orderId).get();
    }

    @Override
    public OrderEntity postOrder(OrderEntity orderEntity) {
        return jpaRepo.save(orderEntity);
    }

    @Override
    public OrderEntity putOrder(OrderEntity orderEntity) {
        return jpaRepo.saveAndFlush(orderEntity);
    }

    @Override
    public void deleteOrder(int orderId) {
        jpaRepo.deleteById(orderId);
    }
}
