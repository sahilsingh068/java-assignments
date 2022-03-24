package com.rp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp.entity.Book;
import com.rp.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService service;
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book bk) {
		return service.addBook(bk);
	}

}
