package com.dahee.notice.controller;

import com.dahee.main.Execute;
import com.dahee.main.Main;
import com.dahee.notice.service.NoticeListServise;


public class NoticeController {
	
	public void execute() {
		
		// 무한 반복
		while (true) {
			
			// 메뉴 출력
			System.out.println("\n<<<<<< 공지사항 >>>>>>");
			System.out.println("1.리스트 2.보기 3.등록");
			System.out.println("4.수정 5.삭제 0.이전메뉴");
			
			// 메뉴 입력
			System.out.print("메뉴 입력 -> ");
			String menu = Main.scanner.nextLine();
			
			// 메뉴 처리
			switch (menu) {
			case "1" : // 공지 리스트
				// 생성하고 호출한다.
				Execute.run(new NoticeListServise(), null);
				break;
			case "2" : // 공지 보기
				// 생성하고 호출한다.
				break;
			case "3" : // 공지 등록
				// 생성하고 호출한다.	
				break;
			case "4" : // 공지 수정
				// 생성하고 호출한다.
				break;
			case "5" : // 공지 삭제
				// 생성하고 호출한다.
				break;
			case "0" : // 이전메뉴
				// 생성하고 호출한다.
				return; // Main으로 돌아간다. -> 메서드를 빠져나간다.
			default :
				System.out.println("\n잘못된 메뉴를 선택하셨습니다.");
				System.out.println("1번~5번, 0번만 입력 하셔야 합니다.");
				break;
				
			} // end of switch			
		} // end of while		
	} // end of execute
} // end of NoticeController class
