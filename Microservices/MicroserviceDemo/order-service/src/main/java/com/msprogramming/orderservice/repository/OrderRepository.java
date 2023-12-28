package com.msprogramming.orderservice.repository;

import com.msprogramming.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findByOrdernumber(String Ordernumber);
}
