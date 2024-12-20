package com.bookinventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bookreview")
public class BookReview {
	
	@Id
	@Column(name="reviewerId", nullable=false)
	private int reviewerId;
	
	@ManyToOne
	@JoinColumn(name = "isbn", referencedColumnName = "isbn", nullable=false)
    private Book book;
	
	@Column(name="rating", nullable=false)
	private int rating;
	
	@Column(name="comment")
	private String comment;
	
	@ManyToOne
	private Reviewer reviewer;

	public int getReviewerId() {
		return reviewerId;
	}

	public void setReviewerId(int reviewerId) {
		this.reviewerId = reviewerId;
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}	
	
}
 