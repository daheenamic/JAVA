/*
 *  처리할 내용 선택해서 처리, 데이터 수집, DB에서 데이터 가져오기, 저장, 수정
 *  예외처리 
 *  출력
 */
package com.dahee.notice.controller;

import java.util.List;

import com.dahee.notice.service.NoticeWriteServiceImpl;
import com.dahee.io.out.NoticePrint;
import com.dahee.main.Execute;
import com.dahee.main.Main;
import com.dahee.notice.service.NoticeListServiceImpl;
import com.dahee.notice.service.NoticeViewServiceImpl;
import com.dahee.notice.vo.NoticeVO;

public class NoticeController {
	
	public void execute() {
		
		//무한 반복
		while (true) {
			// 예외 처리
			try { // 정상 처리
				
				// 메뉴 출력 
				System.out.println("\n<<<-------- 공지사항 -------->>>");
				System.out.println("1.리스트 2.보기 3.등록");
				System.out.println("4.수정 5.삭제 0.이전메뉴");
				
				// 메뉴 선택
				System.out.print("메뉴 선택 --> ");
				String menu = Main.scanner.nextLine();
				
				// 메뉴 처리한다.
				switch (menu) {
					
				case "1" :
					// 1. list - service - dao : List 데이터 가져오기
					@SuppressWarnings("unchecked")
					List<NoticeVO> list = (List<NoticeVO>) Execute.run(new NoticeListServiceImpl(), null);
					NoticePrint.print(list);
					break;
				case "2" :
					// 2. view - 데이터 수집(no) - service - dao : vo 데이터 가져오기
					NoticeVO vo = ((NoticeVO) Execute.run(new NoticeViewServiceImpl(), 2L));
					NoticePrint.print(vo);
					break;
				case "3" :
					// 3. write - 데이터 수집(vo) - service - dao
					NoticeVO writeVo = new NoticeVO();
					System.out.print("제목 -> ");
					writeVo.setTitle(Main.scanner.nextLine());
					System.out.print("내용 -> ");
					writeVo.setContent(Main.scanner.nextLine());
					System.out.print("시작일 (yyyy-mm-dd) -> ");
					writeVo.setStartDate(Main.scanner.nextLine());
					System.out.print("종료일 (yyyy-mm-dd) -> ");
					writeVo.setEndDate(Main.scanner.nextLine());
					Execute.run(new NoticeWriteServiceImpl(), writeVo);
					System.out.println("데이터 등록이 정상적으로 되었습니다.");
					break;
				case "4" :
					// 4. update - 데이터 수집(no) - view(service - dao) - 데이터 수집(vo) - service - dao
					break;
				case "5" :
					// 5. delete - 데이터 수집(vo - no) - service - dao
					break;
				case "0" :
					return;
				default :
					System.out.println("\n####### 메뉴오류 #######");
					System.out.println("잘못된 메뉴를 선택하셨습니다.");
					System.out.println("0번 ~ 5번을 입력 해 주세요.");
				} // end of switch
				
			} catch (Exception e) {
				
				// 개발자를 위한 코드 - 개발이 완료되면 주석 처리
				e.printStackTrace();
				// 사용자를 위한 코드
				System.out.println("***************************");
				System.out.println(" 오류 메세지 : " + e.getMessage());
				System.out.println(" - 조치 방법 : 한번 더 실행 해 주세요.");
				System.out.println("지속적으로 오류가 발생 된다면 ");
				System.out.println("전산 담당자 홍길동(메일주소)에게 연락 주세요.");
				System.out.println("***************************");
				
			} // end of try~catch
		} // end of while
	} // end of execute()
} // end of class
