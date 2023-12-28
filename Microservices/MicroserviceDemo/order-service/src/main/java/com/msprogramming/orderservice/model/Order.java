package com.msprogramming.orderservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  ordernumber;
    @OneToMany(targetEntity = OrderLineItem.class,cascade = CascadeType.ALL,mappedBy = "order")
    private List<OrderLineItem> orderLineItems;

}
