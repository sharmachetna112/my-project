package com.bookinventory.entity;
 
import java.util.List;
 
import com.fasterxml.jackson.annotation.JsonIgnore;

import com.fasterxml.jackson.annotation.JsonManagedReference;
 
import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.FetchType;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
 
@Entity

public class Author {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private int authorID;
 
    @Column(name = "LastName")

    private String lastName;
 
    @Column(name = "FirstName")

    private String firstName;
 
   // private String photo;
 
     //Relationship with BookAuthor (One Author can write many Books)

    @OneToMany(mappedBy = "author" ,fetch = FetchType.LAZY)

    @JsonManagedReference 

    @JsonIgnore

    private List<BookAuthor> bookAuthors;
 
    // Getters and Setters

    public int getAuthorID() {

        return authorID;

    }
 
    public void setAuthorID(int authorID) {

        this.authorID = authorID;

    }
 
    public String getLastName() {

        return lastName;

    }
 
    public void setLastName(String lastName) {

        this.lastName = lastName;

    }
 
    public String getFirstName() {

        return firstName;

    }
 
    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }
 
//    public String getPhoto() {
//
//        return photo;
//
//    }
//// 
//    public void setPhoto(String photo) {
//
//        this.photo = photo;

    
 
    public List<BookAuthor> getBookAuthors() {

        return bookAuthors;

    }
 
    public void setBookAuthors(List<BookAuthor> bookAuthors) {

        this.bookAuthors = bookAuthors;

    }

}
 
 