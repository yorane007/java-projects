package com.msprogramming.orderservice.controller;

import com.msprogramming.orderservice.dto.OrderDTO;
import com.msprogramming.orderservice.dto.OrderResponseDTO;
import com.msprogramming.orderservice.service.Orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private Orderservice service;
    @GetMapping("/welcome")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String orderWelcome(){

        return "Welcome to Order Microservice";
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrder(@RequestBody OrderDTO orderDTO){

        String orderNumber = service.placeOrder(orderDTO);
        return "Order successfully created with order numer = "+ orderNumber;

    }
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<OrderResponseDTO> GetAllOrders() throws Exception {
        List<OrderResponseDTO> dto = service.getAllOrders();
        if( dto.isEmpty())
            throw new Exception("No order");
        return dto;

    }
    @GetMapping("")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<OrderResponseDTO> GetOrder(@RequestParam(name = "ordernumber")String ordernumber) throws Exception {
        List<OrderResponseDTO> dto = service.getOrderByOrderNumber(ordernumber);
        if( dto.isEmpty())
            throw new Exception("No order");
        return dto;

    }
}
