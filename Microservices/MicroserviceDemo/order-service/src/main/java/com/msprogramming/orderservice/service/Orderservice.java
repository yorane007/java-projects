package com.msprogramming.orderservice.service;

import com.msprogramming.orderservice.dto.OrderDTO;
import com.msprogramming.orderservice.dto.OrderResponseDTO;
import com.msprogramming.orderservice.model.Order;
import com.msprogramming.orderservice.model.OrderLineItem;
import com.msprogramming.orderservice.repository.OrderRepository;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;

@Service
@NoArgsConstructor
public class Orderservice {

    @Autowired
    private OrderRepository repo;
    public String placeOrder(OrderDTO orderDTO){
        Order order = new Order();
        order.setOrdernumber(UUID.randomUUID().toString());
        List<OrderLineItem> orderLineItems = orderDTO.getOrderLineItems().stream().map(o -> maptoOrder(o,order)).toList();
        order.setOrderLineItems(orderLineItems);
        //order.setOrderLineItems(orderDTO.getOrderLineItems());
        repo.save(order);
        return order.getOrdernumber();
    }
    public List<OrderResponseDTO> getAllOrders(){
        ModelMapper mapper = new ModelMapper();
        List<Order> orderList = repo.findAll();
        orderList.stream().filter( i -> i.getId() == 20).sorted(Comparator.comparing( ));
        return orderList.stream().map(p -> mapper.map(p, OrderResponseDTO.class) ).toList();
    }
    public List<OrderResponseDTO> getOrderByOrderNumber(String ordernumber){
        ModelMapper mapper = new ModelMapper();
        List<Order> orderList = repo.findByOrdernumber(ordernumber);
        return orderList.stream().map(p -> mapper.map(p, OrderResponseDTO.class) ).toList();
    }

     public OrderLineItem maptoOrder(OrderLineItem item,Order order){
        OrderLineItem orderLineItem = new OrderLineItem();
        orderLineItem.setOrder(order);
        orderLineItem.setPrice(item.getPrice());
        orderLineItem.setSkucode(item.getSkucode());
        orderLineItem.setQuantity(item.getQuantity());
        return orderLineItem;
     }

}
