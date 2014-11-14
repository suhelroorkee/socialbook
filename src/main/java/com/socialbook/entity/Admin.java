package com.socialbook.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="Admin")
	public class Admin {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private String id;
		private String username;
		private String password;
		private String gender;
		private String email;
		private Date createdate ;
		private String status;
		private String country;
		private String city;
		private String userid;

		public String getId() {
			return id;
		}
		public void setId(String userid) {
			this.id = userid;
		}
		
		public Date getCreatedate() {
			return createdate;
		}
		public void setCreatedate(Date createdate) {
			this.createdate = createdate;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getImagename() {
			return imagename;
		}
		public void setImagename(String imagename) {
			this.imagename = imagename;
		}
		private String imagename;
		public String getUsername() {
			return username; 
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}

