package com.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.java.service.HelloService;

public class HelloController extends MultiActionController{
	
	private HelloService helloService;

	public HelloController() {}
	
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}
	
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Hello Function");
		
		//Service --> Dao --> DTO,MyBatis
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		
		helloService.getValue(mav);
		
		return mav;
	}
	
	public ModelAndView apple(HttpServletRequest request, HttpServletResponse response) {
		logger.info("Apple Function");

		//Service --> Dao --> DTO,MyBatis
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		helloService.appValue(mav);
		
		return mav;
		
	}

	

}
