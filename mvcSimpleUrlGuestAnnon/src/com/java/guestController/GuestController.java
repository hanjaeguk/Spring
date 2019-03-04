package com.java.guestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.java.guestDto.GuestDto;
import com.java.guestService.GuestService;


@Controller
public class GuestController {
	@Autowired
	private GuestService guestService;
	
	public void test(HttpServletRequest request, HttpServletResponse response) {
		
	}
	
	
	
	@RequestMapping(value="/guest/write.do",method=RequestMethod.GET)
	public ModelAndView write(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		guestService.guestWrite(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/guest/writeOk.do",method=RequestMethod.POST)
	public ModelAndView writeOk(HttpServletRequest request, HttpServletResponse response, GuestDto guestDto) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("guestDto",guestDto);
		guestService.guestWriteOk(mav);
		return mav;
	}
	
	@RequestMapping(value="/guest/delete.do",method=RequestMethod.GET)
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		guestService.guestDelete(mav);
		return mav;
	}
	
	@RequestMapping(value="/guest/update.do",method=RequestMethod.GET)
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		guestService.guestUpdate(mav);
		return mav;
	}
	
	@RequestMapping(value="/guest/updateOk.do",method=RequestMethod.POST)
	public ModelAndView updateOk(HttpServletRequest request, HttpServletResponse response,GuestDto guestDto) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("guestDto",guestDto);
		guestService.guestUpdateOk(mav);	
		
		return mav;
		
	}
	
}
