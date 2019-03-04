package com.java.service;


import org.springframework.web.servlet.ModelAndView;

public interface HelloService {
	public void getValue(ModelAndView mav);
	
	public void appValue(ModelAndView mav);
}
