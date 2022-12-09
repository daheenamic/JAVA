package project1201;

import java.util.Scanner;

public class Notice {
	
	static Scanner scanner = new Scanner(System.in);

	public void execute() {

		while (true) {
			System.out.println("-선택할 항목의 번호를 입력 해주세요.");
			System.out.println("(1)리스트 (2)글보기 (3)글쓰기 (4)글수정 (5)글삭제 (0)이전메뉴");
			System.out.print("입력 >> ");
			
			String noticeMenu = scanner.nextLine();

			switch (noticeMenu) {
			case "1":
				System.out.println("리스트 입니다.");
				System.out.println();
				break;
			case "2":
				System.out.println("글보기 입니다.");
				System.out.println();
				break;
			case "3":
				System.out.println("글쓰기 입니다.");
				System.out.println();
				break;
			case "4":
				System.out.println("글수정 입니다.");
				System.out.println();
				break;
			case "5":
				System.out.println("글삭제 입니다.");
				System.out.println();
				break;
			case "0":
				System.out.println("이전메뉴로 돌아갑니다.");
				System.out.println();
				return;
			default:
				System.out.println("※잘못 입력 하셨습니다※");
				System.out.println();
				break;
			}
		}
	}
}