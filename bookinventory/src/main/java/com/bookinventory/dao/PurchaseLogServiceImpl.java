package com.bookinventory.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookinventory.entity.PurchaseLog;
import com.bookinventory.repository.PurchaseLogRepository;
import com.bookinventory.service.PurchaseLogService;

@Service
	public class PurchaseLogServiceImpl implements PurchaseLogService {

	    @Autowired
	    private PurchaseLogRepository purchaseLogRepository;

	    @Override
	    public PurchaseLog addPurchaseLog(PurchaseLog purchaseLog) {
	        return purchaseLogRepository.save(purchaseLog);
	    }

	   
	    @Override
	    public String updateInventoryIdByUserId(Integer userId, Integer inventoryId) {
	    	int status= purchaseLogRepository.updateInventoryIdByUserId(inventoryId, userId);
	    	if(status>1) {
	    		return "updated sucessfully";
	    	}
	    	else
	    		return "Not updated";
	    }


		@Override
		public PurchaseLog getPurchaseLogsByUserId(Integer userId) {
			// TODO Auto-generated method stub
			Optional<PurchaseLog> purchaseLog = purchaseLogRepository.findById(userId);
	        if(purchaseLog.isPresent()) {
	        	return purchaseLog.get();	  
	    
	    }
			return null;

		}
}
	  


