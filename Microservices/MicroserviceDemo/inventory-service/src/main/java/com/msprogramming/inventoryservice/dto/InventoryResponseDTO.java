package com.msprogramming.inventoryservice.dto;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponseDTO {
    private Long id;
    private String skuCode;
    private Long quantity;

}
