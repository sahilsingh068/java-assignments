package com.rp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rp.dao.BookDao;
import com.rp.entity.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService{
	@Autowired
	BookDao dao;

	@Override
	public Book addBook(Book book) {
		return dao.addBook(book);
	}

	@Override
	public Book updateBook(Book book) {
		
		return dao.updateBook(book);
	}

	@Override
	public String deleteBook(int bookId) {
		
		return dao.deleteBook(bookId);
	}

	@Override
	public Book getBook(int bookId) {
		
		return dao.getBook(bookId);
	}

	@Override
	public List<Book> getAllBook() {
		
		return dao.getAllBook();
	}

}
