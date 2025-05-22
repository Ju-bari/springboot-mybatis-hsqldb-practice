package com.aidd.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aidd.demo.domain.Book;
import com.aidd.demo.dto.BookDetailResponse;

@Mapper
public interface BookMapper {
	
	public List<BookDetailResponse> findAll();
	
	public Book findById(String bookId);
	
	public void save(Book book);
	
	public void update(Book book);
	
	public void delete(String bookId);

}