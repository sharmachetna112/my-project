package com.bookinventory.entity;
 
import com.fasterxml.jackson.annotation.JsonBackReference;
 
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
 
@Entity

@Table(name = "bookauthor")

public class BookAuthor {
 
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private int authorID;  // Primary key for BookAuthor
 
    @ManyToOne

    @JoinColumn(name = "ISBN", referencedColumnName = "ISBN", insertable = false, updatable = false)

    private Book book;  // Many-to-One relationship with Book
 
    @ManyToOne

    @JsonBackReference

    @JoinColumn(name = "authorID", referencedColumnName = "authorID", insertable = false, updatable = false)

    private Author author; // Many-to-One relationship with Author
 
    // Getters and Setters

    public int getAuthorID() {

        return authorID;

    }
 
    public void setAuthorID(int authorID) {

        this.authorID = authorID;

    }
 
    public Book getBook() {

        return book;

    }
 
    public void setBook(Book book) {

        this.book = book;

    }
 
    public Author getAuthor() {

        return author;

    }
 
    public void setAuthor(Author author) {

        this.author = author;

    }

}

 