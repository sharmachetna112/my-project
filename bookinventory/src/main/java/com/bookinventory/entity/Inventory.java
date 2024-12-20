package com.bookinventory.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "InventoryID")
    private long inventoryId;
 
  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISBN",referencedColumnName = "isbn", nullable = false)
    @JsonBackReference 
    private Book book;
 
    @ManyToOne(fetch = FetchType.LAZY) // Ensure lazy loading for bookCondition
    @JoinColumn(name = "Ranks")
    @JsonIgnore
    private BookCondition bookCondition;

    @Column(name = "Purchased")
    private Boolean purchased;
    
    @OneToMany(mappedBy = "inventory") 
    @JsonIgnore// Maps to the 'inventory' field in PurchaseLog
    private List<PurchaseLog> purchaseLogs;

	public long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public BookCondition getBookCondition() {
		return bookCondition;
	}

	public void setBookCondition(BookCondition bookCondition) {
		this.bookCondition = bookCondition;
	}

	public Boolean getPurchased() {
		return purchased;
	}

	public void setPurchased(Boolean purchased) {
		this.purchased = purchased;
	}

	public List<PurchaseLog> getPurchaseLogs() {
		return purchaseLogs;
	}

	public void setPurchaseLogs(List<PurchaseLog> purchaseLogs) {
		this.purchaseLogs = purchaseLogs;
	}

	

	
}