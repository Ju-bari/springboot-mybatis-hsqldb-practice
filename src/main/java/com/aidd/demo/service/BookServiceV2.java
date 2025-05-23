package com.aidd.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aidd.demo.domain.Book;
import com.aidd.demo.dto.BookCreateRequest;
import com.aidd.demo.dto.BookDetailResponse;
import com.aidd.demo.dto.BookUpdateRequest;
import com.aidd.demo.exception.EntityNotFoundException;
import com.aidd.demo.mapper.BookMapper;
import com.aidd.demo.mapper.BookMapperV2;

@Service
public class BookServiceV2 {
	
	private final BookMapperV2 bookMapper;
	
	public BookServiceV2(BookMapperV2 bookMapper) {
		this.bookMapper = bookMapper;
	}
	
	public List<BookDetailResponse> getAllBooks() {
		return bookMapper.findAll();
	}
	
	public BookDetailResponse getBookById(String bookId) {
		return bookMapper.findById(bookId)
				.orElseThrow(() -> new EntityNotFoundException("해당 아이디에 해당하는 엔티티가 없습니다: " + bookId));
	}
	
	public void saveBook(BookCreateRequest bookCreateRequest) {
		bookMapper.save(bookCreateRequest);
	}
	
	public void updateBook(BookUpdateRequest bookUpdateRequest) {
		bookMapper.update(bookUpdateRequest);
	}
	
	public void deleteBook(String bookId) {
		bookMapper.delete(bookId);
	}

}
