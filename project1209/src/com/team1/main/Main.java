package com.team1.main;

import java.util.Scanner;

import com.team1.order.controller.OrderController;


public class Main {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while (true) {

			System.out.println("\n<------- Main ------->");
			System.out.println("1.공지사항 2.쇼핑몰 3.장바구니");
			System.out.println("4.주문정보 5.회원관리 0.종료");
			System.out.print("입력 -> ");
			String menu = scanner.nextLine();

			switch (menu) {
			case "1":
				break;
			case "2":
				// 쇼핑몰 처리 -> 생성하고 호출한다.
				break;
			case "3":
				// 장바구니 처리 -> 생성하고 호출한다.
				break;
			case "4":
				// 주문정보 처리 -> 생성하고 호출한다.
				OrderController orderController = new OrderController();
				orderController.execute();
				break;
			case "5":
				// 회원관리 처리 -> 생성하고 호출한다.
				break;
			case "0":
				System.out.println("\n수고많으셨습니다.");
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("\n잘못된 메뉴를 선택하셨습니다.");
				System.out.println("1번~5번, 0번만 입력 하셔야 합니다.");
				break;
				
			}
		}
	}
}
