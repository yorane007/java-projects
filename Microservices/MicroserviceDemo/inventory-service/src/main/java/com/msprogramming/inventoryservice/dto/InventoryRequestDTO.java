package com.msprogramming.inventoryservice.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryRequestDTO {
    private String skuCode;
    private Long quantity;

}
