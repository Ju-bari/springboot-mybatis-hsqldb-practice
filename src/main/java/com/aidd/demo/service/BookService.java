package com.aidd.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aidd.demo.domain.Book;
import com.aidd.demo.dto.BookDetailResponse;
import com.aidd.demo.mapper.BookMapper;

@Service
public class BookService {
	
	private final BookMapper bookMapper;
	
	public BookService(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}
	
	public List<Book> getAllBooks() {
		return bookMapper.findAll();
	}
	
	public List<BookDetailResponse> getAllBooksForapi() {
		return bookMapper.findAllForApi();
	}
	
	public Book getBookById(String bookId) {
		return bookMapper.findById(bookId);
	}
	
	public void saveBook(Book book) {
		bookMapper.save(book);
	}
	
	public void updateBook(Book book) {
		bookMapper.update(book);
	}
	
	public void deleteBook(String bookId) {
		bookMapper.delete(bookId);
	}

}
