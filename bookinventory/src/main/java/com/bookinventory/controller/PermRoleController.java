package com.bookinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bookinventory.entity.PermRole;
import com.bookinventory.service.PermRoleService;

@RestController
@RequestMapping("/api")
public class PermRoleController {
	@Autowired
    private PermRoleService permRoleService;
 
    @PostMapping("/post")//http://localhost:6060/api/post
    public ResponseEntity<Object> addPermRole(@RequestBody PermRole permRole) {
    	 PermRole addedPermRole = permRoleService.addPermRole(permRole);
         if (addedPermRole != null) {
             return ResponseEntity.status(HttpStatus.OK)
                     .body("{\"code\":\"POSTSUCCESS\", \"message\":\"Perm Role added successfully\"}");
         } else {
             return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                     .body("{\"code\":\"ADDFAILS\", \"message\":\"Perm Role already exists\"}");
         }
     }

    @GetMapping("/permrole/{rolenumber}") 
    public ResponseEntity<Object> getPermRoleByRoleNumber(@PathVariable Integer rolenumber) {
        PermRole permRole = permRoleService.getPermRoleByRoleNumber(rolenumber);
        if (permRole != null) {
            return ResponseEntity.ok(permRole);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"code\":\"NOTFOUND\", \"message\":\"Perm Role not found\"}");
        }
    }

    @PutMapping("/update/permrole/{rolenumber}")//http://localhost:6060/api/permrole/1
    public ResponseEntity<Object> updatePermRole(@PathVariable Integer rolenumber, @RequestBody PermRole permRole) {
        PermRole updatedPermRole = permRoleService.updatePermRole(rolenumber, permRole);
        if (updatedPermRole != null) {
            return ResponseEntity.ok("{\"code\":\"UPDATESUCCESS\", \"message\":\"Perm Role updated successfully\"}");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"code\":\"UPDATEFAIL\", \"message\":\"Failed to update Perm Role\"}");
        }
    }
}
