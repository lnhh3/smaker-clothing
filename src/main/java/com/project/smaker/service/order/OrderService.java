package com.project.smaker.service.order;

import com.project.smaker.model.dto.OrderDTO;
import com.project.smaker.model.entity.OrderEntity;
import com.project.smaker.repository.order.OrderRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService implements IOrderService{
    @Autowired
    private OrderRepo orderRepo;
    private final ModelMapper mapper = new ModelMapper();

    @Override
    public List<OrderDTO> getOrders() {
        List<OrderEntity> orderEntities = orderRepo.getOrders();
        List<OrderDTO> ordersDTO = new ArrayList<>();
        orderEntities.forEach(orderEntity -> {
            OrderDTO orderDTO = mapper.map(orderEntity, OrderDTO.class);
            ordersDTO.add(orderDTO);
        });
        return ordersDTO;
    }

    @Override
    public OrderDTO getOrder(int orderId) {
        OrderEntity orderEntity = orderRepo.getOrder(orderId);
        OrderDTO orderDTO = mapper.map(orderEntity, OrderDTO.class);
        return orderDTO;
    }

    @Override
    public OrderEntity postOrder(OrderDTO orderDTO) {
        OrderEntity orderEntity = mapper.map(orderDTO, OrderEntity.class);
        return orderRepo.postOrder(orderEntity);
    }

    @Override
    public OrderEntity putOrder(int orderId, OrderDTO orderDTO) {
        orderDTO.setOrderID(orderId);
        OrderEntity orderEntity = mapper.map(orderDTO, OrderEntity.class);
        return orderRepo.putOrder(orderEntity);
    }

    @Override
    public void deleteOrder(int orderId) {
        orderRepo.deleteOrder(orderId);
    }
}
