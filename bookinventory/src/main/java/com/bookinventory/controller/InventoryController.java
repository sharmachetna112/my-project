package com.bookinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookinventory.entity.Inventory;
import com.bookinventory.service.InventoryService;
@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("/api")
public class InventoryController {
	@Autowired
    private InventoryService inventoryService;

	// POST: Add new Inventory
    @PostMapping("/inventory/post")//http://localhost:6060/api/inventory/post
    public ResponseEntity<Object> addInventory(@RequestBody Inventory inventory) {
    	Inventory addedInventory = inventoryService.addInventory(inventory);
        if (addedInventory != null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body("{\"code\":\"POSTSUCCESS\", \"message\":\"Inventory added successfully\"}");
    }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("{\"code\":\"ADDFAILS\", \"message\":\"Inventory already exists\"}");
    }

    // GET: Get Inventory by ID
    @GetMapping("/purchased/{inventoryId}")//http://localhost:6060/api/update/purchased/1
    public ResponseEntity<Object> getInventoryById(@PathVariable Long inventoryId) {
        Inventory inventory = inventoryService.getInventoryByID(inventoryId);
        if (inventory != null) {
            return ResponseEntity.ok(inventory);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("{\"code\":\"NOTFOUND\", \"message\":\"Inventory not found\"}");
    }
    

  //PUT: Update Purchased Status by ID**********
    @PutMapping("/{inventoryId}")
    public ResponseEntity<Object> updatePurchasedStatus(@PathVariable Long inventoryId, @RequestBody boolean purchased) {
        boolean isUpdated = inventoryService.updateInventory(inventoryId, purchased);
        if (isUpdated) {
            return ResponseEntity.ok("{\"code\":\"UPDATESUCCESS\", \"message\":\"Inventory status updated successfully\"}");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("{\"code\":\"UPDATEFAIL\", \"message\":\"Failed to update inventory status\"}");
    }
}

