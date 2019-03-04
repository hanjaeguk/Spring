package com.java.service;

import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.springframework.web.servlet.ModelAndView;

import com.java.dao.HelloDao;


public class HelloServiceImpl implements HelloService{
	
	private HelloDao helloDao;

	public HelloServiceImpl() {}	
	
	public HelloServiceImpl(HelloDao helloDao) {
		this.helloDao = helloDao;
	}

	@Override
	public void getValue(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		int su = Integer.parseInt(request.getParameter("su"));
		int value = Integer.parseInt(request.getParameter("value"));
		int hap = su+value;
		
		mav.addObject("hap", hap);
		mav.setViewName("/WEB-INF/view/hello.jsp");
	
	}

	@Override
	public void appValue(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String str = request.getParameter("str");
		
		mav.addObject("str",str);
		mav.setViewName("/WEB-INF/view/apple.jsp");
		
	}
	
	

}
