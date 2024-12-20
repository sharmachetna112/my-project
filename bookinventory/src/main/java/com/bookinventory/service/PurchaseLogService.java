package com.bookinventory.service;

import java.util.List;

import com.bookinventory.entity.PurchaseLog;

public interface PurchaseLogService {

	public PurchaseLog addPurchaseLog(PurchaseLog purchaseLog);
	   public PurchaseLog getPurchaseLogsByUserId(Integer userId);
	   public String updateInventoryIdByUserId(Integer userId, Integer inventoryId);
}
