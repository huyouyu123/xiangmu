package com.byzx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.StuMapper;
import com.byzx.vo.Book;

@Service
public class StuServicelmpl  implements IStuService {
	@Autowired
	public StuMapper  mapper;

	@Override
	public List<Book> getAllBooks() {
		return mapper.getAll();
	}

	
	
	

}
