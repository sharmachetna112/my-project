package com.bookinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookinventory.entity.Inventory;

@Repository
	public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	    
	   
	    }

