package com.bookinventory.entity;
 
import java.util.List;
 
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "book")
public class Book {
	
	@Id
    private String isbn; // Primary key
 
    private String title;
 
    private String description;
 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;
 
    private String edition;
 
 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publisherId")
    private Publisher publisher;
 
       @OneToMany(mappedBy = "book")
       private List<BookAuthor> bookAuthors;
 
      @OneToMany(mappedBy = "book")
      private List<BookReview> bookReviews;
 
        @OneToMany(mappedBy = "book")
      private List<Inventory> inventory;
 
   
    
    public String getIsbn() {
		return isbn;
	}
 
	public String getTitle() {
		return title;
	}
 
	public String getDescription() {
		return description;
	}
 
	public String getEdition() {
		return edition;
	}
 
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}
 
	public void setDescription(String description) {
		this.description = description;
	}
 
	public void setEdition(String edition) {
		this.edition = edition;
	}
 
	public Category getCategory() {
		return category;
	}
 
	public List<BookAuthor> getBookAuthors() {
		return bookAuthors;
	}
 
	public void setCategory(Category category) {
		this.category = category;
	}
 
	public void setBookAuthors(List<BookAuthor> bookAuthors) {
		this.bookAuthors = bookAuthors;
	}
 
	public Publisher getPublisher() {
		return publisher;
	}
 
	
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
 
	public List<BookReview> getBookReviews() {
		return bookReviews;
	}
 
	public void setBookReviews(List<BookReview> bookReviews) {
		this.bookReviews = bookReviews;
	}
 
	public List<Inventory> getInventory() {
		return inventory;
	}
 
	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}
 
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", description=" + description + ", category=" + category
				+ ", edition=" + edition + ", publisher=" + publisher + ", bookAuthors=" + bookAuthors
				+ ", bookReviews=" + bookReviews + ", inventory=" + inventory + "]";
	}
	
	
	
}
 