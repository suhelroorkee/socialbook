package com.socialbook.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Group {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String name;
	private String groupId;
	private String userId;
	private String description;
	private String status;
	private String createdate;
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGroupname() {
		return name;
	}
	public void setGroupname(String groupname) {
		this.name = groupname;
	}
	public String getGroupid() {
		return groupId;
	}
	public void setGroupid(String groupid) {
		this.groupId = groupid;
	}
	public String getUserid() {
		return userId;
	}
	public void setUserid(String userid) {
		this.userId = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
