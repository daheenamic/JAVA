package com.dahee.board.controller;

import java.util.List;

import com.dahee.board.io.out.BoardPrint;
import com.dahee.board.main.Execute;
import com.dahee.board.main.Main;
import com.dahee.board.service.BoardDeleteServiceImpl;
import com.dahee.board.service.BoardListServiceImpl;
import com.dahee.board.service.BoardUpdateServiceImpl;
import com.dahee.board.service.BoardViewServiceImpl;
import com.dahee.board.service.BoardWriteServiceImpl;
import com.dahee.board.vo.BoardVO;

public class BoardController {
	public void execute() {
		while (true) {
			try {
				System.out.println("\n<------- 게시판 ------->");
				System.out.println("1.리스트 2.보기 3.등록");
				System.out.println("4.수정 5.삭제 0.이전메뉴");
				System.out.print("입력 --> ");
				String menu = Main.scanner.nextLine();
				
				switch(menu) {
				case "1" :
					@SuppressWarnings("unchecked")
					List<BoardVO> list = (List<BoardVO>) Execute.run(new BoardListServiceImpl(), null);
					BoardPrint.print(list);
					break;
				case "2" :
					Execute.run(new BoardViewServiceImpl(), 2);
					break;
				case "3" :
					Execute.run(new BoardWriteServiceImpl(), null);
					break;
				case "4" :
					Execute.run(new BoardUpdateServiceImpl(), null);
					break;
				case "5" :
					Execute.run(new BoardDeleteServiceImpl(), 2);
					break;
				case "0" :
					System.out.println("이전 메뉴로 돌아갑니다.");
					return;
				default :
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("오류가 발생하였습니다.");
				System.out.println("오류 메세지 :" + e.getMessage());
			}
		}
	}
}
