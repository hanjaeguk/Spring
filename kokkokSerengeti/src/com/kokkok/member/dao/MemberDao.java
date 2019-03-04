package com.kokkok.member.dao;

import java.util.List;
import java.util.Map;

import com.kokkok.member.dto.MemberDto;

public interface MemberDao {
	int idCheck(String id);
	
	int register(MemberDto memberDto);
	
	MemberDto getMember(String id);
	int modify(MemberDto memberDto); 
	int delete(String id); 
	
	
	// MemberDto login(String id,String pass); 
	MemberDto login(Map<String,String> map); 
	
	List<MemberDto> memberList(Map<String,String> map);
}
