package com.aidd.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.aidd.demo.dto.BookDetailResponse;
import com.aidd.demo.service.BookService;

@RestController()
@RequestMapping("/api")
public class BookRestController {
	
	private BookService bookService;
	
	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/books")
	public ResponseEntity<?> getAllBooks() {
		List<BookDetailResponse> BookDetailResponseList = bookService.getAllBooks();
		return ResponseEntity.ok(BookDetailResponseList);
	}

}
