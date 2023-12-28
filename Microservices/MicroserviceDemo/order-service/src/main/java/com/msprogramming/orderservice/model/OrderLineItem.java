package com.msprogramming.orderservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "orderlineitem")
public class OrderLineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    String skucode;
    double price;
    Integer quantity;
    @ManyToOne(targetEntity = Order.class)
    @JoinColumn(name = "ordernumber")
    @JsonIgnore
    private Order order;

}
