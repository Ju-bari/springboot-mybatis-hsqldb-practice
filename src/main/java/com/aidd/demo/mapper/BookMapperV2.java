package com.aidd.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.aidd.demo.domain.Book;
import com.aidd.demo.dto.BookCreateRequest;
import com.aidd.demo.dto.BookDetailResponse;
import com.aidd.demo.dto.BookUpdateRequest;

@Mapper
public interface BookMapperV2 {
	
	public List<BookDetailResponse> findAll();
	
	public Optional<BookDetailResponse> findById(String bookId);
	
	public void save(BookCreateRequest bookCreateRequest);
	
	public void update(BookUpdateRequest bookUpdateRequest);
	
	public void delete(String bookId);

}