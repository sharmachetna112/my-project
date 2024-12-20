package com.bookinventory.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "permrole")
public class PermRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RoleNumber")
	private int roleNumber;

	@Column(name = "PermRole", length = 30)
	private String permRole;
	
	 @OneToMany(mappedBy = "roleNumber")
	    private Set<User> users;

	public int getRoleNumber() {
		return roleNumber;
	}

	public void setRoleNumber(int roleNumber) {
		this.roleNumber = roleNumber;
	}

	public String getPermRole() {
		return permRole;
	}

	public void setPermRole(String permRole) {
		this.permRole = permRole;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	
}
