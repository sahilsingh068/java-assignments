package com.rp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookjpa")
public class Book {
	@Id
	@Column(name="bid",length=10)
	private int bookId;
	@Column(name="bname",length=10)
	private String bookName;
	@Column(name="authname",length=10)
	private String authName;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName, String authName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authName = authName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authName=" + authName + "]";
	}
	

}
