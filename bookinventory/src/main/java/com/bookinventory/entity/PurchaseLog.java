package com.bookinventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "purchaselog")
public class PurchaseLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;// primary key for the table

	@ManyToOne
	@JoinColumn(name = "userId", nullable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "inventoryId", nullable = false)
	private Inventory inventory;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}
//         @Id
//		@GeneratedValue(strategy=GenerationType.IDENTITY)
//		private int id;
//		
//		private String response;
//		
//		@ManyToOne
//	    @JoinColumn(name = "userId", nullable = false)
//	    private User user;
//
//	    
//	    @ManyToOne
//	    @JoinColumn(name = "inventoryId", nullable = false)
//	    private Inventory inventory;
//
//
//		public int getId() {
//			return id;
//		}
//
//
//		public void setId(int id) {
//			this.id = id;
//		}
//
//
//		public String getResponse() {
//			return response;
//		}
//
//
//		public void setResponse(String response) {
//			this.response = response;
//		}
//
//
//		public User getUser() {
//			return user;
//		}
//
//
//		public void setUser(User user) {
//			this.user = user;
//		}
//
//
//		public Inventory getInventory() {
//			return inventory;
//		}
//
//
//		public void setInventory(Inventory inventory) {
//			this.inventory = inventory;
//		}
//			
//	    
//	    
//
//
//			
//
//	}
//
//
