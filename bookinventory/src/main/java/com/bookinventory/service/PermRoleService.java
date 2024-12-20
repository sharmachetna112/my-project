package com.bookinventory.service;

import com.bookinventory.entity.PermRole;

public interface PermRoleService {
	
	PermRole addPermRole(PermRole permRole);

    PermRole getPermRoleByRoleNumber(Integer roleNumber);

    PermRole updatePermRole(Integer roleNumber, PermRole permRole);

}
