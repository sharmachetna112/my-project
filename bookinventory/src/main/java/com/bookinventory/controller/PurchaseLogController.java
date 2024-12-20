package com.bookinventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookinventory.entity.PurchaseLog;
import com.bookinventory.service.PurchaseLogService;

@RestController
	@RequestMapping("/api/purchaselog")
	public class PurchaseLogController {

	    @Autowired
	    private PurchaseLogService purchaseLogService;

	    // POST: Add a new PurchaseLog
	    @PostMapping("/post")
	   
	    public PurchaseLog addPurchaseLog(@RequestBody PurchaseLog purchaseLog) {
	        return purchaseLogService.addPurchaseLog(purchaseLog);
	    }

	    // GET: Get PurchaseLog by userId
	    @GetMapping("/{userId}")
	    public PurchaseLog getPurchaseLogsByUserId(@PathVariable Integer userId) {
	        return purchaseLogService.getPurchaseLogsByUserId(userId);
	    }

	    // PUT: Update Inventory ID of PurchaseLog by userId
	    @PutMapping("/update/inventoryid/{userId}")
	    public String updateInventoryIdByUserId(@PathVariable Integer userId, @RequestParam("p") Integer newInventoryId) {
	        return purchaseLogService.updateInventoryIdByUserId(userId, newInventoryId);
	    }
	}


