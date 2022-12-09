import java.util.Scanner;

// while 반복문 안에서 실행 결과에 따라 반복할지말지에 대한 데이터 변경이 되고 있다.
// 먼저 반복문으로 들어가고 조건을 나중에 물어보는 do{}
public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 \"q\"를 입력하세요");

		Scanner scanner = new Scanner(System.in);
		String inputString; // 입력받을 문자열 변수 선언.

		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(">"+inputString);
		} while (!inputString.equals("q")); // q가 아니면 반복처리, q면 반복을 멈춤.

		scanner.close();
		System.out.println("프로그램 종료");
		
	} // end of main()

} // end of DoWhileExample class
