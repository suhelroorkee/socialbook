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
@Table(name="bookmark")
public class Bookmark {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookmarkID;
	
	@Column(nullable=false)		
	private int bookID;

	@Column(nullable=false)		
	private int userID;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)		
	private Date bookmarkDate;
	
	@Column(nullable=false, length=10)		
	private String status;

	public int getBookmarkID() {
		return bookmarkID;
	}
	public int getBookID() {
		return bookID;
	}
	public int getUserID() {
		return userID;
	}
	public Date getBookmarkDate() {
		return bookmarkDate;
	}
	public void setBookmarkID(int bookmarkID) {
		this.bookmarkID = bookmarkID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public void setBookmarkDate(Date bookmarkDate) {
		this.bookmarkDate = bookmarkDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
