package com.bookinventory.service;

import com.bookinventory.entity.Inventory;



public interface InventoryService {
	public Inventory addInventory(Inventory inventory);
   public Inventory getInventoryByID(Long inventoryId);
    public boolean updateInventory(Long inventoryId, Boolean purchasedStatus);

}
