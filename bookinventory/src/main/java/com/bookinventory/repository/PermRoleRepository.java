package com.bookinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookinventory.entity.PermRole;

@Repository
	public interface PermRoleRepository extends JpaRepository<PermRole, Integer>{

}
