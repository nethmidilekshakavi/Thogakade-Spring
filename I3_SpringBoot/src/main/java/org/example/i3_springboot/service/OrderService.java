package org.example.i3_springboot.service;

import org.example.i3_springboot.Dto.OrderDto;

import java.util.List;

public interface OrderService {

    void addOrder(OrderDto orderDto);

    void updateOrder(Long id , OrderDto orderDto);

    void deleteOrder(Long id);

    List<OrderDto>getAll();

}
