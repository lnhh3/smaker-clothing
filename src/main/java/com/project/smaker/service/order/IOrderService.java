package com.project.smaker.service.order;

import com.project.smaker.model.dto.OrderDTO;
import com.project.smaker.model.entity.OrderEntity;

import java.util.List;

public interface IOrderService {
    List<OrderDTO> getOrders();
    OrderDTO getOrder(int orderId);
    OrderEntity postOrder(OrderDTO orderDTO);
    OrderEntity putOrder(int orderId, OrderDTO orderDTO);
    void deleteOrder(int orderId);
}
