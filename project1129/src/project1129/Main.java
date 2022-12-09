package project1129;

import java.util.Scanner;

// 1.공지사항, 2.쇼핑몰, 3.장바구니 4.주문정보, 5.회원관리, 0.종료

public class Main {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// 무한 반복 시작
		while (true) {
			System.out.println("<선택할 항목의 번호를 입력 해주세요.>");
			System.out.println("1.공지사항, 2.쇼핑몰, 3.장바구니, 4.주문정보, 5.회원관리, 0.종료");
			System.out.print("입력 >> ");

			String menu = scanner.nextLine();

			switch (menu) {
			case "1":
				System.out.println("공지사항 입니다.");
				System.out.println();
				break;
			case "2":
				System.out.println("쇼핑몰 메인 입니다.");
				System.out.println();
				break;
			case "3":
				System.out.println("장바구니 목록 입니다.");
				System.out.println();
				break;
			case "4":
				System.out.println("주문정보 입니다.");
				System.out.println();
				break;
			case "5":
				System.out.println("회원관리 페이지 입니다.");
				System.out.println();
				break;
			case "0":
				System.out.println("종료 되었습니다.");
				System.out.println();
				System.exit(0);
			default:
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println();
				break;
			} // end of switch

		} // end of while

	} // end of main()

} // end of BoardController2 class
