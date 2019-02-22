package org.java.dao;

import java.util.List;

import org.java.dto.FriendDto;

public interface FriendDao {
	
	public int insert(FriendDto friendDto);
	public FriendDto select(int num);
	public List<FriendDto>selectList();
	public int delete(int num);
	public int update(FriendDto friendDto);
}
