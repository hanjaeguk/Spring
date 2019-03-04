package com.java.guestDao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.java.guestDto.GuestDto;

public class GuestDaoImpl implements GuestDao {
	private SqlSessionTemplate sqlSessionTemplate;
	//MyBatis작업

	public GuestDaoImpl() {}
	
	public GuestDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public int insert(GuestDto guestDto) {
		
		return sqlSessionTemplate.insert("guestInsert",guestDto);
	}

	@Override
	public int getGuestCount() {
		
		return sqlSessionTemplate.selectOne("guestCount");
	}

	@Override
	public List<GuestDto> getGuestList(int startRow, int endRow) {
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		hMap.put("startRow", startRow);
		hMap.put("endRow", endRow);
		return sqlSessionTemplate.selectList("guestList",hMap);
	}

	@Override
	public int delete(int num) {

		return sqlSessionTemplate.delete("guestDelete",num);
	}

	@Override
	public GuestDto select(int num) {
		return sqlSessionTemplate.selectOne("guestSelect",num);
	}

	@Override
	public int update(GuestDto guestDto) {

		return sqlSessionTemplate.update("guestDao.guestMapper.guestUpdate",guestDto);
	}
	
	
}
