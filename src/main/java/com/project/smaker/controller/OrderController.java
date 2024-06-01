package com.project.smaker.controller;

import com.project.smaker.model.dto.OrderDTO;
import com.project.smaker.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderDTO>> getOrders() {
        return new ResponseEntity(orderService.getOrders(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> getOrder(@PathVariable("id") int orderId) {
        return new ResponseEntity(orderService.getOrder(orderId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<OrderDTO> postOrder(@RequestBody OrderDTO orderDTO) {
        return new ResponseEntity(orderService.postOrder(orderDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderDTO> putOrder(@PathVariable("id") int orderId, OrderDTO orderDTO) {
        return new ResponseEntity(orderService.putOrder(orderId, orderDTO), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<OrderDTO> deleteOrder(@PathVariable("id") int orderId) {
        orderService.deleteOrder(orderId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
