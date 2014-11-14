package com.socialbook.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="userrating")
public class UserRating {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ratingID;
	
	@Column(nullable=false)
	private int ratedUserID;
	
	@Column(nullable=false)
	private int ratedByUserID;

	@Column(nullable=false)
	private int ratingValue;		// 1-10

	@Column(nullable=false, length=255)
	private String comment;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date ratingDate;

	public int getRatingID() {
		return ratingID;
	}

	public int getRatedUserID() {
		return ratedUserID;
	}

	public int getRatedByUserID() {
		return ratedByUserID;
	}

	public int getRatingValue() {
		return ratingValue;
	}

	public String getComment() {
		return comment;
	}

	public Date getRatingDate() {
		return ratingDate;
	}

	public void setRatingID(int ratingID) {
		this.ratingID = ratingID;
	}

	public void setRatedUserID(int ratedUserID) {
		this.ratedUserID = ratedUserID;
	}

	public void setRatedByUserID(int ratedByUserID) {
		this.ratedByUserID = ratedByUserID;
	}

	public void setRatingValue(int ratingValue) {
		this.ratingValue = ratingValue;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setRatingDate(Date ratingDate) {
		this.ratingDate = ratingDate;
	}
}
