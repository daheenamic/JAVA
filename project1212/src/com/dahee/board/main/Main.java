package com.dahee.board.main;

import java.util.Scanner;

import com.dahee.board.controller.BoardController;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			System.out.println("\n<------- Main ------->");
			System.out.println("1.게시판 2.쇼핑몰 3.장바구니");
			System.out.println("4.주문정보 5.회원관리 0.종료");
			System.out.print("입력 --> ");
			String menu = scanner.nextLine();
			
			switch(menu) {
			case "1" :
				BoardController boardController = new BoardController();
				boardController.execute();
				break;
			case "2" :
				break;
			case "3" :
				break;
			case "4" :
				break;
			case "5" :
				break;
			case "0" :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default :
				System.out.println("잘못 입력 하셨습니다.");
			}
		}
	}

}
