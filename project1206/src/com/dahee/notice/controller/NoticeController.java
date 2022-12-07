package com.dahee.notice.controller;

import com.dahee.main.Execute;
import com.dahee.main.Main;
import com.dahee.notice.service.NoticeListServiceImpl;
import com.dahee.notice.service.NoticeViewServiceImpl;
import com.dahee.notice.service.NoticeWriteServiceImpl;

public class NoticeController {
	
	// public : Main과 패키지가 다르다.
	// void : Main에서 처리 결과를 저장하거나 출력하지 않는다. NoticeController 이 전의 리턴값이 없다.
	// execute : Main에서 호출한 메서드 이름. 전달되는 값이 없으니 빈 괄호()
	public void execute() {
		
		while (true) {
			
			System.out.println("\n<<<<<< 공지사항 >>>>>>");
			System.out.println("1.리스트 2.보기 3.등록");
			System.out.println("4.수정 5.삭제 0.이전메뉴");
			System.out.print("메뉴 입력 -> ");
			String menu = Main.scanner.nextLine();
			
			switch (menu) {
			case "1" : // 공지사항 리스트 처리
				//생성해서 호출할 수 있도록 전달한다.
				Execute.run(new NoticeListServiceImpl(), null);
				break;
			case "2" : // 공지 보기
				// 넘겨야 할 데이터는 Long 타입의 글번호, 2L이라고 안 쓸 경우 에러남.
				Execute.run(new NoticeViewServiceImpl(), 2L);
				break;
			case "3" : // 공지 등록
				//생성해서 호출할 수 있도록 전달한다.
				Execute.run(new NoticeWriteServiceImpl(), null);
				break;
			case "4" : // 공지 수정
				//생성해서 호출할 수 있도록 전달한다.
				break;
			case "5" : // 공지 삭제
				//생성해서 호출할 수 있도록 전달한다.
				break;
			case "0" : // 이전메뉴
				//생성해서 호출할 수 있도록 전달한다.
				System.out.println("\n 이전메뉴로 돌아갑니다.");
				return;
			default :
				System.out.println("\n잘못된 메뉴를 선택하셨습니다.");
				System.out.println("1번~5번, 0번만 입력 하셔야 합니다.");
				break;
				
			} // end of switch
		} // end of while
	} // end of execute()
} // end of class
