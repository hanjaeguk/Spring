package com.kokkok.member.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kokkok.member.dto.MemberDto;

@Component
public class MemberDaoImpl implements MemberDao {
	@Autowired
 	private SqlSessionTemplate sqlSession;

	@Override
	public int idCheck(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int register(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return sqlSession.insert("dao.memberMapper.insertMember", memberDto);
	}

	@Override
	public MemberDto getMember(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modify(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDto login(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDto> memberList(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

}
