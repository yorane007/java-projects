package com.msprogramming.orderservice.dto;

import com.msprogramming.orderservice.model.OrderLineItem;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDTO {
    private List<OrderLineItem> orderLineItems;
}
