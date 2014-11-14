package com.socialbook.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="suggestionreplycomment")
public class SuggestionReplyComment {			// other users can leave reply on suggested books

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int suggestionReplyCommentID;
	
	@Column(nullable=false)
	private int suggestionID;					// the original suggestion id

	@Column(nullable=false)
	private int replyByUserID;
	
	@Column(nullable=false, length=255)
	private String comment;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false, length=255)
	private Date replyDate;

	public int getSuggestionReplyCommentID() {
		return suggestionReplyCommentID;
	}

	public int getSuggestionID() {
		return suggestionID;
	}

	public int getReplyByUserID() {
		return replyByUserID;
	}

	public String getComment() {
		return comment;
	}

	public Date getReplyDate() {
		return replyDate;
	}

	public void setSuggestionReplyCommentID(int suggestionReplyCommentID) {
		this.suggestionReplyCommentID = suggestionReplyCommentID;
	}

	public void setSuggestionID(int suggestionID) {
		this.suggestionID = suggestionID;
	}

	public void setReplyByUserID(int replyByUserID) {
		this.replyByUserID = replyByUserID;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}
	
}
