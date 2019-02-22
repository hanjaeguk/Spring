package org.java.ui;

import java.util.List;
import java.util.Scanner;

import org.java.aop.LogAspect;
import org.java.dao.FriendDao;
import org.java.dto.FriendDto;

public class FriendUi implements Ui {

	private FriendDto friendDto;
	private FriendDao friendDao;

	@Override
	public void execute() {
		showMenu();

		System.out.print("번호를 선택하세요! 입력:");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			input();
			break;
		case 2:
			selectList();
			break;
		case 3:
			select();
			break;
		case 4:
			delete();
			break;
		case 5:
			update();
			break;

		default:
			System.out.println("잘못입력하셨습니다.(숫자1~5만 입력해주세요.");
		}

	}

	public void setFriendDto(FriendDto friendDto) {
		this.friendDto = friendDto;
	}

	public void setFriendDao(FriendDao friendDao) {
		this.friendDao = friendDao;
	}

	public void showMenu() {
		System.out.println("--------친구 주소록--------");
		System.out.println("1.주소록 작성");
		System.out.println("2.주소록 전체출력");
		System.out.println("3.주소록 검색");
		System.out.println("4.주소록 삭제");
		System.out.println("5.주소록 수정");
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		friendDto.setName(sc.next());

		System.out.print("전화번호:");
		friendDto.setPhone(sc.next());

		LogAspect.logger.info(LogAspect.logMsg + friendDto.toString());

		int check = friendDao.insert(friendDto);

		if (check > 0) {

			System.out.println("입력성공!!");
		} else {
			System.out.println("입력실패!!");
		}

		sc.close();
	}

	public void selectList() {
		List<FriendDto> friendList = friendDao.selectList();
		LogAspect.logger.info(LogAspect.logMsg + "주소록 갯수:" + friendList.size());
		for (int i = 0; i < friendList.size(); i++) {
			FriendDto friendDto = friendList.get(i);
			System.out.println(friendDto.toString());
		}

	}

	public void select() {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호검색:");
		int num = sc.nextInt();

		friendDto = friendDao.select(num);

		if (friendDto != null) {
			LogAspect.logger.info(LogAspect.logMsg + friendDto.toString());
			System.out.println(friendDto.toString());
		} else {
			System.out.println("해당번호의 정보가 존재하지 않습니다.");
		}

		sc.close();
	}

	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제하실 번호:");
		int num = sc.nextInt();
		friendDto = friendDao.select(num);
		
		if(friendDto != null) {
			int check = friendDao.delete(num);
			if(check > 0) {
				System.out.println("삭제가 완료되었습니다.");
			}else {
				System.out.println("삭제실패!!");
			}
		}else {
			System.out.println("해당번호가 없습니다.");
		}
		
		sc.close();
	}
	
	public void update() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정하실 번호:");
		int num = sc.nextInt();
		friendDto = friendDao.select(num);
		if(friendDto != null) {
			System.out.println(friendDto.toString());
			
			System.out.print("수정할 전화번호 입력:");
			friendDto.setPhone(sc.next());
			
			int check = friendDao.update(friendDto);
			
			if(check > 0) {
				System.out.println("수정완료");
			}else {
				System.out.println("수정실패");
			}
			
		}else {
			System.out.println("해당번호가 없습니다.");
		}
		
	}

}
