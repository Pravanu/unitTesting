package com.LibMS.LibraryDemo.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Book_Details")
public class Book_Data {
	
	@Id
	private String BookCode;
	private String BookName;
	private String AuthorName;
	
	@OneToOne(cascade=CascadeType.ALL)
	private PersonalData personal_data;

	public Book_Data() {
		
	}

	public Book_Data(String bookCode, String bookName, String authorName, PersonalData personal_data) {
		super();
		BookCode = bookCode;
		BookName = bookName;
		AuthorName = authorName;
		this.personal_data = personal_data;
	}

	public String getBookCode() {
		return BookCode;
	}

	public void setBookCode(String bookCode) {
		BookCode = bookCode;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public PersonalData getPersonal_data() {
		return personal_data;
	}

	public void setPersonal_data(PersonalData personal_data) {
		this.personal_data = personal_data;
	}
	
	
	
	
}
