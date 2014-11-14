package com.socialbook.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class GroupChat {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String userId;
	private String createdates;
	private String status;
	private String message;
	private String groupid;
	private String id;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserid() {
		return userId;
	}
	public void setUserid(String userid) {
		this.userId = userid;
	}
	public String getCreatedates() {
		return createdates;
	}
	public void setCreatedates(String createdates) {
		this.createdates = createdates;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
}
