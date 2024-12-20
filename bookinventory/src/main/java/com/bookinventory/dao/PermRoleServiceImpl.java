package com.bookinventory.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookinventory.entity.PermRole;
import com.bookinventory.exception.RoleNumberNotFoundException;
import com.bookinventory.repository.PermRoleRepository;
import com.bookinventory.service.PermRoleService;

@Service
	public class PermRoleServiceImpl implements PermRoleService {

	    @Autowired
	    private PermRoleRepository permRoleRepository;

	    @Override
	    public PermRole addPermRole(PermRole permRole) {
	        return permRoleRepository.save(permRole);
	    }

	    @Override
	    public PermRole getPermRoleByRoleNumber(Integer roleNumber) {
	        return permRoleRepository.findById(roleNumber).orElseThrow(() -> new RoleNumberNotFoundException("Role number " + roleNumber + " not found"));
	    }

	    @Override
	    public PermRole updatePermRole(Integer roleNumber, PermRole permRole) {
//	    	PermRole p=permRoleRepository.getById(roleNumber);
//	        p.setPermRole(permRole.getPermRole()); // Set role number explicitly
//	        return permRoleRepository.save(p);
	    	Optional<PermRole> optionalPermRole = permRoleRepository.findById(roleNumber);
	        if (optionalPermRole.isPresent()) {
	            PermRole existingPermRole = optionalPermRole.get();
	            existingPermRole.setPermRole(permRole.getPermRole()); // Update the permissions
	            return permRoleRepository.save(existingPermRole);
	        } else {
	            throw new RoleNumberNotFoundException("Role number " + roleNumber + " not found");
	        }
	    }

}


