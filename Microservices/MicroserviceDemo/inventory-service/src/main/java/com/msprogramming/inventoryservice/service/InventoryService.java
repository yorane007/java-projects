package com.msprogramming.inventoryservice.service;

import com.msprogramming.inventoryservice.dto.InventoryRequestDTO;
import com.msprogramming.inventoryservice.dto.InventoryResponseDTO;
import com.msprogramming.inventoryservice.model.Inventory;
import com.msprogramming.inventoryservice.repository.InventoryRepository;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Setter
@Getter
@Service
public class InventoryService {
    @Autowired
    private InventoryRepository repo;
    public List<InventoryResponseDTO> getAllInventory(){
        ModelMapper mapper = new ModelMapper();
        List<Inventory> inventories = repo.findAll();
        return inventories.stream().map( i -> mapper.map(i,InventoryResponseDTO.class)).toList();
    }
    public InventoryResponseDTO getInventory(String skuCode){
        ModelMapper mapper = new ModelMapper();
        Optional<Inventory> inventory = repo.findBySkuCode(skuCode);
        return inventory.map(value -> mapper.map(value, InventoryResponseDTO.class)).orElse(null);
    }
    public boolean isInStock(String skuCode){
        return repo.findBySkuCode(skuCode).isPresent();

    }
    public void addInventory(InventoryRequestDTO requestDTO){
        ModelMapper mapper = new ModelMapper();
        Inventory inventory = mapper.map(requestDTO,Inventory.class);
        repo.save(inventory);
    }

}
