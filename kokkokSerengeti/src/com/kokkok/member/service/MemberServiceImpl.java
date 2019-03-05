package com.kokkok.member.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;


import com.java.guestAop.GuestAspect;
import com.kokkok.member.dao.MemberDao;
import com.kokkok.member.dto.MemberDto;

@Component
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	@Override
	public void myInfo(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		mav.setViewName("/member/myMenu/myInfo/view");		
	}

	@Override
	public void myWriteSchedule(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		mav.setViewName("/member/myMenu/myWrite/list");		
	}

	@Override
	public void myWishSchedule(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		mav.setViewName("/member/myMenu/myWish/myschedulelist");		
	}

	@Override
	public void myWishreview(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		mav.setViewName("/member/myMenu/myWish/myreviewlist");		
	}

	@Override
	public void mvRegister(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		mav.setViewName("/member/join/register");		
	}

	@Override
	public void registerOk(ModelAndView mav) {
		
		Map<String, Object> map = mav.getModelMap();
		MemberDto memberDto=(MemberDto) map.get("memberDto");
		memberDto.setJoinDate(new Date());
		GuestAspect.logger.info(GuestAspect.logMsg + memberDto.toString());

		int check=memberDao.memberInsert(memberDto);
		GuestAspect.logger.info(GuestAspect.logMsg + check);

		mav.addObject("check",check);		
		mav.setViewName("/member/join/registerok");		
	}

	@Override
	public void idCheck(ModelAndView mav) {
		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		mav.setViewName("/member/join/idcheck");	
	}

	@Override
	public void login(ModelAndView mav) {

		Map<String, Object> map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");	
		String id = request.getParameter("loginid");
		String pass = request.getParameter("loginpass");
		
		
		int check =memberDao.login(id,pass);
		
		GuestAspect.logger.info(GuestAspect.logMsg + check);
		
		mav.addObject("check", check);

		mav.setViewName("member/login/");

	}




}
