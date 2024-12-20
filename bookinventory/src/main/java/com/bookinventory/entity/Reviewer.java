package com.bookinventory.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity

@Table(name = "reviewer")

public class Reviewer {

 @Id

 @GeneratedValue(strategy = GenerationType.IDENTITY)

 @Column(name = "ReviewerID")

 private int reviewerId;

 @Column(name = "name", length = 20)

 private String name;

 @Column(name = "EmployedBy", length = 30)

 private String employedBy;

 @OneToMany(mappedBy = "reviewer")

 private List<BookReview> bookReviews;

public int getReviewerId() {
	return reviewerId;
}

public void setReviewerId(int reviewerId) {
	this.reviewerId = reviewerId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmployedBy() {
	return employedBy;
}

public void setEmployedBy(String employedBy) {
	this.employedBy = employedBy;
}

public List<BookReview> getBookReviews() {
	return bookReviews;
}

public void setBookReviews(List<BookReview> bookReviews) {
	this.bookReviews = bookReviews;
}
 
}

 



