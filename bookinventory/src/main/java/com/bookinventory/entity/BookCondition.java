package com.bookinventory.entity;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "bookcondition")
public class BookCondition {
	@Id
	@Column(name = "ranks", nullable = false)
	private int ranks; // INT(11)
	@Column(name = "description", length = 50)
	private String description; // VARCHAR(50)
	@Column(name = "full_description", length = 255)
	private String fullDescription; // VARCHAR(255)
	@Column(name = "price")
	private double price; // DECIMAL(12,2)
	 @OneToMany(mappedBy = "bookCondition")
	    private Set<Inventory> inventories;
	
	
	public int getRanks() {
		return ranks;
	}
	public void setRanks(int ranks) {
		this.ranks = ranks;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFullDescription() {
		return fullDescription;
	}
	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Set<Inventory> getInventories() {
		return inventories;
	}
	public void setInventories(Set<Inventory> inventories) {
		this.inventories = inventories;
	}
	
	
}
 