package com.kokkok.member.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;


import com.kokkok.member.dao.MemberDao;
import com.kokkok.member.dto.MemberDto;

@Component
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberdao;
	
	@Override
	public void myInfo(ModelAndView mav) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void myWriteSchedule(ModelAndView mav) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void myWishSchedule(ModelAndView mav) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void myWishreview(ModelAndView mav) {
		// TODO Auto-generated method stub
		
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
		MemberDto memberDto=(MemberDto) map.get("guestDto");
		int check=memberdao.register(memberDto);
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
	public void register(ModelAndView mav) {
		// TODO Auto-generated method stub
		
	}


}
