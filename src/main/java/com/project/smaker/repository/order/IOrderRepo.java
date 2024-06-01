package com.project.smaker.repository.order;

import com.project.smaker.model.entity.OrderEntity;

import java.util.List;

public interface IOrderRepo {
    List<OrderEntity> getOrders();
    OrderEntity getOrder(int orderId);
    OrderEntity postOrder(OrderEntity orderEntity);
    OrderEntity putOrder(OrderEntity orderEntity);
    void deleteOrder(int orderId);
}
