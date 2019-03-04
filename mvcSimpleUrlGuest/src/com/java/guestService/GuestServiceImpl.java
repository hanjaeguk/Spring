package com.java.guestService;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.java.guestAop.GuestAspect;
import com.java.guestDao.GuestDao;
import com.java.guestDto.GuestDto;

public class GuestServiceImpl implements GuestService {

	private GuestDao guestDao;

	public GuestServiceImpl() {
	}

	public GuestServiceImpl(GuestDao guestDao) {
		this.guestDao = guestDao;
	}

	@Override
	public void guestWrite(ModelAndView mav) {
		// 페이지번호 : guestList, count, row, end
		
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		//현재 페이지번호 1
		String pageNumber = request.getParameter("pageNumber");
		if(pageNumber == null) {
			pageNumber = "1";
		}
		int currentPage = Integer.parseInt(pageNumber);

		//한페이당 출력할 게시물 수
		int boardSize = 3;
		int startRow =(currentPage-1)*boardSize+1;
		int endRow = currentPage*boardSize;
		
		//게시물 개수 : view 페이지번호 만들기 관련있음
		int count = guestDao.getGuestCount();
		GuestAspect.logger.info(GuestAspect.logMsg + count);
		
		List<GuestDto> guestList = null;
		if(count > 0) {
			guestList = guestDao.getGuestList(startRow, endRow);
			GuestAspect.logger.info(GuestAspect.logMsg + "size"+guestList.size());
		}
		
		mav.addObject("guestList",guestList);
		mav.addObject("count",count);
		mav.addObject("boardSize",boardSize);
		mav.addObject("currentPage",currentPage);
		
		
//		mav.setViewName("/WEB-INF/view/write.jsp");
		mav.setViewName("write");
		
		
		
	}

	@Override
	public void guestWriteOk(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		GuestDto guestDto = (GuestDto)map.get("guestDto");
		guestDto.setMessage(guestDto.getMessage().replace("\r\n", "<br>"));
		guestDto.setWriteDate(new Date());
		GuestAspect.logger.info(GuestAspect.logMsg+guestDto.toString());
		
		int check=guestDao.insert(guestDto);
		GuestAspect.logger.info(GuestAspect.logMsg + check);
		
		mav.addObject("check",check);
//		mav.setViewName("/WEB-INF/view/writeOk.jsp");
		mav.setViewName("writeOk");
	}

	@Override
	public void guestDelete(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		GuestAspect.logger.info(GuestAspect.logMsg+num+","+pageNumber);
		
		int check = guestDao.delete(num);
		GuestAspect.logger.info(GuestAspect.logMsg+check);
		
		mav.addObject("check",check);
		mav.addObject("pageNumber",pageNumber);
		
//		mav.setViewName("/WEB-INF/view/delete.jsp");
		mav.setViewName("delete");

	}

	@Override
	public void guestUpdate(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		GuestAspect.logger.info(GuestAspect.logMsg+num+","+pageNumber);
		
		GuestDto guestDto = guestDao.select(num);
		GuestAspect.logger.info(GuestAspect.logMsg+guestDto.toString());
		
		mav.addObject("guestDto",guestDto);
		mav.addObject("pageNumber",pageNumber);
		
//		mav.setViewName("/WEB-INF/view/update.jsp");
		mav.setViewName("delete");
	}

	@Override
	public void guestUpdateOk(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		
		GuestDto guestDto = (GuestDto) map.get("guestDto");
		GuestAspect.logger.info(GuestAspect.logMsg+guestDto.toString());
		
		int check = guestDao.update(guestDto);
		GuestAspect.logger.info(GuestAspect.logMsg+check);
		
		
		mav.addObject("check",check);
		mav.addObject("pageNumber",pageNumber);
		
//		mav.setViewName("/WEB-INF/view/updateOk.jsp");
		mav.setViewName("updateOk");
	}

}
