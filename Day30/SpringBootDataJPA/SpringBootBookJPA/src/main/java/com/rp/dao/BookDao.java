package com.rp.dao;

import java.util.List;

import com.rp.entity.Book;

public interface BookDao {
	Book addBook(Book book);
	Book updateBook(Book book);
	String deleteBook(int bookId);
	Book getBook(int bookId);
	//List<Book> getAllBook(Book book);
	List<Book> getAllBook();

}
