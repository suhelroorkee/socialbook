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
@Table(name="favouritelistbook")
public class FavouriteListBook {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int favouriteListBookID;
	
	@Column(nullable=false)
	private int favouriteListID;
	
	@Column(nullable=false)
	private int bookID;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date addedDate;

	@Column(nullable=false, length=6)
	private String status;
	
	public int getFavouriteListBookID() {
		return favouriteListBookID;
	}

	public int getFavouriteListID() {
		return favouriteListID;
	}

	public int getBookID() {
		return bookID;
	}

	public void setFavouriteListBookID(int favouriteListBookID) {
		this.favouriteListBookID = favouriteListBookID;
	}

	public void setFavouriteListID(int favouriteListID) {
		this.favouriteListID = favouriteListID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
