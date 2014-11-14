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
@Table(name="suggestion")
public class Suggestion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int suggestionID;
	
	@Column(nullable=false)
	private int suggestedID;					// bookid, authorid, clubid
	
	@Column(nullable=false, length=128)
	private String suggestionType;				// book, author, club etc.
	
	@Column(nullable=false)
	private int suggestionFromUserID;

	@Column(nullable=false)
	private int suggestionToPersonOrClub;			// userID / clubID

	@Column(nullable=true, length=255)
	private String comment;
	
	@Column(nullable=false, length=10)
	private String status;				// book, author, club etc.
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false, length=255)
	private Date suggestionDate;

	public int getSuggestionID() {
		return suggestionID;
	}

	public int getSuggestedID() {
		return suggestedID;
	}

	public String getSuggestionType() {
		return suggestionType;
	}

	public int getSuggestionFromUserID() {
		return suggestionFromUserID;
	}

	public int getSuggestionToPersonOrClub() {
		return suggestionToPersonOrClub;
	}

	public String getComment() {
		return comment;
	}

	public Date getSuggestionDate() {
		return suggestionDate;
	}

	public void setSuggestionID(int suggestionID) {
		this.suggestionID = suggestionID;
	}

	public void setSuggestedID(int suggestedID) {
		this.suggestedID = suggestedID;
	}

	public void setSuggestionType(String suggestionType) {
		this.suggestionType = suggestionType;
	}

	public void setSuggestionFromUserID(int suggestionFromUserID) {
		this.suggestionFromUserID = suggestionFromUserID;
	}

	public void setSuggestionToPersonOrClub(int suggestionToPersonOrClub) {
		this.suggestionToPersonOrClub = suggestionToPersonOrClub;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setSuggestionDate(Date suggestionDate) {
		this.suggestionDate = suggestionDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
