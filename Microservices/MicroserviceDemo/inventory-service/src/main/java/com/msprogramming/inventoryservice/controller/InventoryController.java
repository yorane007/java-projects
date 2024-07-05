package com.msprogramming.inventoryservice.controller;

import com.msprogramming.inventoryservice.dto.InventoryRequestDTO;
import com.msprogramming.inventoryservice.dto.InventoryResponseDTO;
import com.msprogramming.inventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    InventoryService service;

    @GetMapping("/{skuCode}/stock")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInSock(@PathVariable String skuCode){
        return service.isInStock(skuCode);
    }
    @GetMapping("/{skuCode}")
    @ResponseStatus(HttpStatus.OK)
    public InventoryResponseDTO getInventory(@PathVariable String skuCode){
        InventoryResponseDTO responseDto = service.getInventory(skuCode);
        if(  responseDto == null){
            responseDto = new InventoryResponseDTO(0L,skuCode,0L);
        }
        return responseDto;
    }
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void addInventory(@RequestBody InventoryRequestDTO requestDTO){
        service.addInventory(requestDTO);
    }
}
