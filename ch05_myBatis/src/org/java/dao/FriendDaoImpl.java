package org.java.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.java.dto.FriendDto;
import org.mybatis.spring.SqlSessionTemplate;

public class FriendDaoImpl implements FriendDao {
	
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public int insert(FriendDto friendDto) {
		return sqlSessionTemplate.insert("friendInsert",friendDto);
	}

	@Override
	public List<FriendDto> selectList() {
		return sqlSessionTemplate.selectList("friendList");
	}
	
	@Override
	public FriendDto select(int num) {
		return sqlSessionTemplate.selectOne("friendSelect",num);
	}

	@Override
	public int delete(int num) {
		return sqlSessionTemplate.delete("friendDelete",num);
	}

	@Override
	public int update(FriendDto friendDto) {
		Map<String,Object> hMap = new HashMap<String,Object>();
		hMap.put("phone", friendDto.getPhone());
		hMap.put("num", friendDto.getNum());
		return sqlSessionTemplate.update("friendUpdate",hMap); //Map로 넘기기
//		return sqlSessionTemplate.update("friendUpdate",friendDto); //DTO로 던지는거
	}


}
