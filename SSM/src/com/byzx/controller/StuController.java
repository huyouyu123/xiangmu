package com.byzx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.byzx.service.IStuService;
import com.byzx.vo.Book;

@Controller
public class StuController {
	
	@Autowired
	public IStuService  stuservice;
	
	@RequestMapping("/Allbooks")
	public ModelAndView getAllBooks(HttpServletRequest  request,HttpServletResponse  reponse){
		
		List<Book> books=stuservice.getAllBooks();
		ModelAndView  model=new ModelAndView();
		model.addObject("listbook", books);
		model.setViewName("list");
		return model;
		
		
		
		
		
	}
	
	

}
