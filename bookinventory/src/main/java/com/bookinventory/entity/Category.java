package com.bookinventory.entity;
 
import jakarta.persistence.*;
 
@Entity
@Table(name = "category")
public class Category {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CatID", nullable = false)
    private Long id;  // Using Long instead of int if your database column is BIGINT or INT.
 
    @Column(name = "CatDescription", length = 100, nullable = false)
    private String description;
 
    // Default Constructor
    public Category() {
    }
 
    // Parameterized Constructor
    public Category(String description) {
        this.description = description;
    }
 
    // Getters and Setters
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    // toString Method for Debugging
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
 
 