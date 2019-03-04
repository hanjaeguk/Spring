package com.java.guestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.java.guestDto.GuestDto;
import com.java.guestService.GuestService;

public class GuestController extends MultiActionController {
	private GuestService guestService;

	public GuestController() {}

	public GuestController(GuestService guestService) {
		this.guestService = guestService;
	}
	
	public void test(HttpServletRequest request, HttpServletResponse response) {
		logger.info("test function----------------------");
	}
	
	public ModelAndView write(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		guestService.guestWrite(mav);
		
		return mav;
	}
	
	public ModelAndView writeOk(HttpServletRequest request, HttpServletResponse response,
			GuestDto guestDto) {
		
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("guestDto",guestDto);
		guestService.guestWriteOk(mav);
		
		return mav;
		
	}
	
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		guestService.guestDelete(mav);
		return mav;
	}
	
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		guestService.guestUpdate(mav);
		return mav;
	}
	
	public ModelAndView updateOk(HttpServletRequest request, HttpServletResponse response,
			GuestDto guestDto) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("guestDto",guestDto);
		guestService.guestUpdateOk(mav);
		return mav;

	}

}










