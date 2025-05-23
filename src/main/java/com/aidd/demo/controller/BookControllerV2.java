package com.aidd.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.aidd.demo.domain.Book;
import com.aidd.demo.dto.BookCreateRequest;
import com.aidd.demo.dto.BookDetailResponse;
import com.aidd.demo.dto.BookUpdateRequest;
import com.aidd.demo.service.BookService;
import com.aidd.demo.service.BookServiceV2;

@RestController()
@RequestMapping("/api/v2/books")
public class BookControllerV2 {
	
	private BookServiceV2 bookService;
	
	public BookControllerV2(BookServiceV2 bookService) {
		this.bookService = bookService;
	}
	
	
	@GetMapping("/")
	public ResponseEntity<?> getAllBooks() {
		List<BookDetailResponse> BookDetailResponseList = bookService.getAllBooks();
		
		return ResponseEntity.ok(BookDetailResponseList);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> viewBook(@PathVariable("id") String id) {
		BookDetailResponse bookDetailResponse = bookService.getBookById(id);
		
		return ResponseEntity.ok(bookDetailResponse);
	}
	
	@PostMapping("/")
	public ResponseEntity<?> addBook(@RequestBody BookCreateRequest bookCreateRequest) {
		bookService.saveBook(bookCreateRequest);
		
		return ResponseEntity.ok().build();
	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<?> updateBook(@PathVariable("id") String id, @RequestBody BookUpdateRequest bookUpdateRequest) {
		bookService.updateBook(bookUpdateRequest);
		
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteBook(@PathVariable("id") String id) {
		bookService.deleteBook(id);
		
		return ResponseEntity.ok().build();
	}
	
}
