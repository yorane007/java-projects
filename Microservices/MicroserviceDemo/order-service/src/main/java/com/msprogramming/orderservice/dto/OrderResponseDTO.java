package com.msprogramming.orderservice.dto;

import com.msprogramming.orderservice.model.OrderLineItem;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseDTO {
    private Long id;
    private String  ordernumber;
    private List<OrderLineItem> orderLineItems;

}
