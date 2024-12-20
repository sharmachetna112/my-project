package com.bookinventory.dao;

import com.bookinventory.entity.Inventory;
import com.bookinventory.exception.IdNotFoundException;
import com.bookinventory.repository.InventoryRepository;
import com.bookinventory.service.InventoryService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
	public class InventoryServiceImpl implements InventoryService {

	    @Autowired
	    private InventoryRepository inventoryRepository;


		  @Override
		    public Inventory addInventory(Inventory inventory) {
		        return inventoryRepository.save(inventory);
		    }


		@Override
		public Inventory getInventoryByID(Long inventoryId){
			// TODO Auto-generated method stub
			Optional<Inventory> optionalInventory = inventoryRepository.findById(inventoryId);
			
			if(optionalInventory.isPresent())
			{
	        return optionalInventory.get();
			}
			else {
				throw new IdNotFoundException("Inventory with ID " + inventoryId + " not found.");
			}
		}


		@Override
		public boolean updateInventory(Long inventoryId, Boolean purchasedStatus) {
			// TODO Auto-generated method stub
			 Optional<Inventory> optionalInventory = inventoryRepository.findById(inventoryId);
		        if (optionalInventory.isPresent()) {
		            Inventory inventory = optionalInventory.get();
		            inventory.setPurchased(purchasedStatus);
		            inventoryRepository.save(inventory);  // Save the updated inventory
		            return true;
		        }
		        else {
		        	throw new IdNotFoundException("Inventory with ID " + inventoryId + " not found.");
		        }
		    
		}
			
		
		  }
	    


	    