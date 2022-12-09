package project1201TV;

import java.util.Scanner;

public class MainTecherVer {

	// 키보드로 입력하기 위한 객체 - 다른 클래스(public)에서도 사용해야하면 한개만(static) 선언해서 쓴다.
	// 같은 클래스에서는 scanner라고 쓴다. 다른 클래스에서는 Main.scanner 라고 쓴다.
	// 키보드로 입력 처리(메서드 호출) - Main.scanner.nextLine()
	public static Scanner scanner = new Scanner(System.in);

	// 시작 위치 - 프로젝트에서 한개만 만든다. 테스트를 위해서 만들기도 한다.
	public static void main(String[] args) {

		// 무한 반복
		while (true) {
			
			//메뉴 출력
			System.out.println("\n---------- Main ----------\n");
			System.out.println("1.공지사항 2.쇼핑몰  3.장바구니");
			System.out.println("4.주문정보 5.회원관리 0.종료");

			// 메뉴 입력
			System.out.print("메뉴 입력 -> ");
			String menu = scanner.nextLine();

			// 메뉴 처리
			switch (menu) {
			case "1": // 공지사항
				// NoticeTecherVer 클래스와 연결 -> 메서드 호출 : 먼저 생성한다. new 생성자()
				NoticeTecherVer notice = new NoticeTecherVer();
				notice.execute();
				break; // switch문을 빠져나감
			case "2": // 쇼핑몰
				ShopTecherVer shop = new ShopTecherVer();
				shop.execute();
				break; // switch문을 빠져나감
			case "3":
				System.out.println("\n장바구니 목록 입니다.");
				System.out.println();
				break;
			case "4":
				System.out.println("\n주문정보 입니다.");
				System.out.println();
				break;
			case "5":
				System.out.println("\n회원관리 페이지 입니다.");
				System.out.println();
				break;
			case "0":
				System.out.println("\n이용해 주셔서 감사합니다.");
				System.out.println("프로그램을 종료 합니다.");
				System.exit(0);
			default:
				System.out.println("\n메뉴 입력이 잘못 되었습니다.");
				System.out.println("1~5번과 0번을 입력 하실 수 있습니다.");
				System.out.println();
				break;
			} // end of switch
		} // end of while
	} // end of main()
} // end of Main class
