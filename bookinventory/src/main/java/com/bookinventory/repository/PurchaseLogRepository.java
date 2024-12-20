package com.bookinventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookinventory.entity.PurchaseLog;

import jakarta.transaction.Transactional;

@Repository
	public interface PurchaseLogRepository extends JpaRepository<PurchaseLog, Integer> {
	
	@Query("select p from PurchaseLog p where p.user.userID=?1")
	List<PurchaseLog> findByUser(int userId);  
	

	@Transactional
	@Modifying
	@Query("update PurchaseLog p set p.inventory.inventoryId=?1 where p.user.userID=?2")
	public int updateInventoryIdByUserId(int inventory, int userID) ;
}
