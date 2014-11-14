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
@Table(name="author")
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorID;
	
	@Column(nullable=false, length=50)
	private String firstName;

	@Column(nullable=true, length=32)
	private String middleName;

	@Column(nullable=false, length=50)
	private String lastName;
	
	@Column(nullable=false, length=6)
	private String gender;

	@Temporal(TemporalType.DATE)
	@Column(nullable=true)	
	private Date dateOfBirth;

	public int getAuthorID() {
		return authorID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
