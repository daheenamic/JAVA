import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("직책을 입력 해 주세요. ");
		String position = scanner.nextLine();
//		String position ="과장";
		
		// java 6버전부터 문자열 비교를 해준다. 6버전 미만은 문자열은 사용하지 못한다.
		switch(position) {
		case "부장": // position = 부장인 경우 이동해서 실행된다. 틀리면 다음 case나 default를 찾아간다.
			System.out.println("700만원");
			break; // switch문을 빠져나간다
		case "과장": // position = 과장인 경우 이동해서 실행된다. 틀리면 다음 case나 default를 찾아간다.
			System.out.println("500만원");
			break; // switch문을 빠져나간다
		default : // case외의 다른 값인 경우 이동해서 실행된다.
			System.out.println("300만원");
			break; // switch문을 빠져나간다 (default는 break 생략가능)
		}
		scanner.close();
	}
}
