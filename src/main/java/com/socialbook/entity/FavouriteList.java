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
@Table(name="favouritelist")
public class FavouriteList {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int favouriteListID;
	
	@Column(nullable=false)
	private int userID;			// who created the list
	
	@Column(nullable=false, length=128)
	private String listName;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date creationDate;
	
	@Column(nullable=false, length=10)
	private String status;

	public int getFavouriteListID() {
		return favouriteListID;
	}

	public int getUserID() {
		return userID;
	}

	public String getListName() {
		return listName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setFavouriteListID(int favouriteListID) {
		this.favouriteListID = favouriteListID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
