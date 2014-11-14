package com.socialbook.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String name;
	private String id;                             
	private String category;
	private String subcategory;
	private String auther;
	private String publication;
	private String releasedate;
	private String language;
	private String price;
	private String createdate;
	private String status;
	private String readres;
	
	

	public String getReadres() {
		return readres;
	}
	public void setReadres(String readres) {
		this.readres = readres;
	}
	public String getBookId() {
		return id;
	}
	public void setBookId(String bookId) {
		this.id = bookId;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
