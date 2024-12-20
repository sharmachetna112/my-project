package com.bookinventory.entity;
 
 
 
 
 
import jakarta.persistence.*;
 
@Entity
@Table(name = "publisher")
public class Publisher {
 
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "PublisherID")
//    private Integer publisherID;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PublisherID")
	private Integer publisherID;
 
 
    @Column(name = "publisher_name", length = 50)
    private String publisherName;
 
    
    @Column(name = "City", length = 30)
    private String publisherCity;
    
 
    @ManyToOne
   @JoinColumn(name = "StateCode")
   private State state;
 
    // Constructors
    public Publisher() {
    }
 
    public Publisher(Integer publisherID, String publisherName, String publisherCity, State state) {
        this.publisherID = publisherID;
        this.publisherName = publisherName;
        this.publisherCity = publisherCity;
       
         this.state = state;
    }
 
    // Getters and Setters
    public Integer getPublisherID() {
        return publisherID;
    }
 
    public void setPublisherID(Integer publisherID) {
        this.publisherID = publisherID;
    }
 
    public String getPublisherName() {
        return publisherName;
    }
 
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
 
    public String getPublisherCity() {
        return publisherCity;
    }
 
    public void setPublisherCity(String publisherCity) {
        this.publisherCity = publisherCity;
    }
 
   
}
 
 
 