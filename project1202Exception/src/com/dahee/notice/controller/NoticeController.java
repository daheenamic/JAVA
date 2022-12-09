package com.dahee.notice.controller;

import com.dahee.exception.DBException;
import com.dahee.main.Main;

import com.dahee.notice.service.NoticeListServise;
import com.dahee.notice.service.NoticeWriteService;
import com.dahee.notice.vo.NoticeVO;

public class NoticeController {

	public void execute() {

		while (true) {

			// 아래의 코드를 실행하다가 오류가 나서 예외가 발생되면 처리한다.
			try {

				System.out.println("\n<<<<<< 공지사항 >>>>>>");
				System.out.println("1.리스트 2.보기 3.등록");
				System.out.println("4.수정 5.삭제 0.이전메뉴");
				System.out.print("메뉴 입력 -> ");
				String menu = Main.scanner.nextLine();

				switch (menu) {
				case "1":
					NoticeListServise noticeListServise = new NoticeListServise();
					noticeListServise.service();
					break;
				case "2":

					break;
				case "3":
					NoticeVO writeVO = new NoticeVO();
					System.out.print("제목: ");
					writeVO.setTitle(Main.scanner.nextLine());
					System.out.print("내용: ");
					writeVO.setContent(Main.scanner.nextLine());
					System.out.print("시작일: ");
					writeVO.setStartDate(Main.scanner.nextLine());
					System.out.print("종료일: ");
					writeVO.setEndDate(Main.scanner.nextLine());

					System.out.println(writeVO);

					NoticeWriteService noticeWriteService = new NoticeWriteService();
					noticeWriteService.service(writeVO);
					break;
				case "4":
					break;
				case "5":
					break;
				case "0":
					return;
				default:
					System.out.println("\n잘못된 메뉴를 선택하셨습니다.");
					System.out.println("1번~5번, 0번만 입력 하셔야 합니다.");
					break;

				} // end of switch
			} catch (Exception e) {
				// 개발자를 위한 코드
			//	e.printStackTrace();
				// 사용자를 위한 코드
//				System.out.println("공지사항을 처리하다가 오류가 발생되었습니다."); // 두루뭉술한 메세지
				System.out.println(e.getMessage()); // 구체적인 메세지 전달
				if (e instanceof DBException) {
					System.out.println("오류코드 : " + ((DBException)e).getErrorCode());
				}
				System.out.println("다시 한 번 시도해 보세요.");
				System.out.println("오류가 계속 반복이 되면 전산 담당자 ***에게 연락 해 주세요.");
			} // end of try~catch
		} // end of while
	} // end of execute
} // end of NoticeController class
