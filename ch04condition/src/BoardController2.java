import java.util.Scanner;

public class BoardController2 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// 무한 반복 시작
		while (true) {
			System.out.println("<선택할 항목의 번호를 입력 해주세요.>");
			System.out.println("1.리스트, 2.글보기, 3.글쓰기, 4.글수정, 5.글삭제, 0.종료");
			System.out.print("입력 >> ");

			String menu = scanner.nextLine();

			switch (menu) {
			case "1":
				System.out.println("[리스트]");
				break;
			case "2":
				System.out.println("[글보기]");
				break;
			case "3":
				System.out.println("[글쓰기]");
				break;
			case "4":
				System.out.println("[글수정]");
				break;
			case "5":
				System.out.println("[글삭제]");
				break;
			case "0":
				System.out.println("[종료]");
				System.exit(0); // 종료하는방법
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			} // end of switch

		} // end of while

	} // end of main()

} // end of BoardController2 class
