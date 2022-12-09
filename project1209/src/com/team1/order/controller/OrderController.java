/*
 *  처리할 내용 선택해서 처리, 데이터 수집, DB에서 데이터 가져오기, 저장, 수정
 *  예외처리 
 *  출력
 */
package com.team1.order.controller;

import java.util.List;

import com.team1.main.Execute;
import com.team1.main.Main;
import com.team1.order.io.out.OrderPrint;
import com.team1.order.service.OrderDeleteServiceImpl;
import com.team1.order.service.OrderServiceImpl;
import com.team1.order.service.OrderUpdateServiceImpl;
import com.team1.order.service.OrderViewServiceImpl;
import com.team1.order.service.OrderWriteServiceImpl;
import com.team1.order.vo.OrderVO;

public class OrderController {

	public void execute() {

		while (true) {

			try { 

				System.out.println("\n<<<-------- 주문정보 -------->>>");
				System.out.println("1.주문정보 리스트 2.주문정보 보기 3.주문정보 등록");
				System.out.println("4.주문정보 수정 5.주문정보 삭제 0.이전메뉴");

				System.out.print("메뉴 선택 --> ");
				String menu = Main.scanner.nextLine();

				switch (menu) {

				case "1":
					@SuppressWarnings("unchecked")
					List<OrderVO> list = (List<OrderVO>) Execute.run(new OrderServiceImpl(), null);
					OrderPrint.print(list);
					break;
				case "2":
					System.out.print("확인하실 주문정보의 글번호를 입력 해 주세요. -> ");
					Long viewNo = Long.parseLong(Main.scanner.nextLine());					
					OrderVO viewVo = ((OrderVO) Execute.run(new OrderViewServiceImpl(), viewNo));
					OrderPrint.print(viewVo);
					break;
				case "3":
					OrderVO writeVo = new OrderVO();
					
//					System.out.print("제목 -> ");
//					writeVo.setTitle(Main.scanner.nextLine());
//					System.out.print("내용 -> ");
//					writeVo.setContent(Main.scanner.nextLine());
//					System.out.print("비밀번호 -> ");
//					writeVo.setPw(Main.scanner.nextLine());
//					System.out.print("시작일 (yyyy-mm-dd) -> ");
//					writeVo.setStartDate(Main.scanner.nextLine());
//					System.out.print("종료일 (yyyy-mm-dd) -> ");
//					writeVo.setEndDate(Main.scanner.nextLine());
					
					Execute.run(new OrderWriteServiceImpl(), writeVo);
					System.out.println("데이터 등록이 정상적으로 되었습니다.");
					break;
				case "4":
					OrderVO updateVo = new OrderVO();
					
					System.out.print("수정하실 주문정보의 글번호를 입력 해 주세요. -> ");
					Long updateNo = Long.parseLong(Main.scanner.nextLine());
					Execute.run(new OrderViewServiceImpl(), updateNo);
							
//					System.out.print("수정할 제목 -> ");
//					updateVo.setTitle(Main.scanner.nextLine());
//					System.out.print("수정할 내용 -> ");
//					updateVo.setContent(Main.scanner.nextLine());
//					System.out.print("수정할 시작일 -> ");
//					updateVo.setStartDate(Main.scanner.nextLine());
//					System.out.print("수정할 종료일 -> ");
//					updateVo.setEndDate(Main.scanner.nextLine());
					
					Execute.run(new OrderUpdateServiceImpl(), updateVo);
					System.out.println("데이터 수정이 정상적으로 되었습니다.");
					break;
				case "5":			
					System.out.print("삭제하실 글 번호를 입력 해 주세요. -> ");
					Long deleteNo = Long.parseLong(Main.scanner.nextLine());					
					Execute.run(new OrderDeleteServiceImpl(), deleteNo);					
					System.out.println("데이터 삭제가 정상적으로 되었습니다.");
					break;
				case "0":
					return;
				default:
					System.out.println("\n####### 메뉴오류 #######");
					System.out.println("잘못된 메뉴를 선택하셨습니다.");
					System.out.println("0번 ~ 5번을 입력 해 주세요.");
				} 

			} catch (Exception e) {

				e.printStackTrace();
				System.out.println("***************************");
				System.out.println(" 오류 메세지 : " + e.getMessage());
				System.out.println(" - 조치 방법 : 한번 더 실행 해 주세요.");
				System.out.println("지속적으로 오류가 발생 된다면 ");
				System.out.println("전산 담당자 홍길동(메일주소)에게 연락 주세요.");
				System.out.println("***************************");

			} 
		}
	}
}
