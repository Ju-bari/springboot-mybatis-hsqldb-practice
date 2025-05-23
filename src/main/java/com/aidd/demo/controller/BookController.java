package com.aidd.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.aidd.demo.domain.Book;
import com.aidd.demo.dto.BookDetailResponse;
import com.aidd.demo.service.BookService;

@Controller
public class BookController {

	private BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/listBook")
	public String viewBookList(Model model) {
		List<Book> books = bookService.getAllBooks();
		model.addAttribute("allBooks", books);
		
		return "listBook";
	}
	
	@GetMapping("/viewBook/{id}")
	public String viewBook(@PathVariable("id") String id, Model model) {
		Book book = bookService.getBookById(id);
		model.addAttribute("book", book);
		
		return "viewBook";
	}
	
	@GetMapping("/addViewBook")
	public String addViewBook() {
		return "addViewBook";
	}
	
	@PostMapping("/addBook")
	public String addBook(@ModelAttribute Book book) {
		bookService.saveBook(book);
		
		return "redirect:/listBook";
	}
	
	@GetMapping("/updateViewBook/{id}")
	public String updateViewBook(@PathVariable("id") String id, Model model) {
		Book book = bookService.getBookById(id);
		model.addAttribute("book", book);
		
		return "updateViewBook";
	}
	
	@PostMapping("/updateBook/{id}")
	public String updateBook(@PathVariable("id") String id, @ModelAttribute Book book) {
		bookService.updateBook(book);
		
		return "redirect:/listBook";
	}
	
	@GetMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") String id) {
		bookService.deleteBook(id);
		
		return "redirect:/listBook";
	}
	
}
