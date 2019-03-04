package com.java.guestDao;

import java.util.List;

import com.java.guestDto.GuestDto;

public interface GuestDao {
	
	public int insert(GuestDto guestDto);
	public int getGuestCount();
	public List<GuestDto> getGuestList(int startRow, int endRow);
	public int delete(int num);
	public GuestDto select(int num);
	public int update(GuestDto guestDto);
	

}
