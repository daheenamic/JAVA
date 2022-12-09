import java.util.Scanner;

public class BoardController {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("선택할 항목의 번호를 입력 주세요.");
		System.out.println("1.리스트, 2.글보기, 3.글쓰기, 4.글수정, 5.글삭제, 0.종료");
		System.out.print("입력 >> ");
			
		String menu = scanner.nextLine();
		
		// 이동 라벨 정의 - switch, for, while문 바로 위에 정의. 
		//break 라벨이름; - 라벨 이름 바로 밑에 있는 구문을 빠져나간다
//		switchLoop:
			
		switch (menu) {
		case "1":
			System.out.println("리스트");
			break;
		case "2":
			System.out.println("글보기");
			break;
		case "3":
			System.out.println("글쓰기");
			break;
		case "4":
			System.out.println("글수정");
			break;
		case "5":
			System.out.println("글삭제");
			break;
		case "0":
			System.out.println("종료");
//			break switchLoop; // 종료하는방법1. 자바 응용 프로그램을 완전히 종료한다.
//			return; 		  // 종료하는방법2. 메서드를 빠져나간다.
			System.exit(0);	  // 종료하는방법3. 
		default:
			System.out.println("잘못 입력 하셨습니다.");
			break;
		}
	}
}
