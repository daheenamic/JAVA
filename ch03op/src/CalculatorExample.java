import java.util.Scanner;
// 2개의 숫자를 입력 받아서 산술 연산 결과를 출력하하는 프로그램 작성

public class CalculatorExample {

	public static void main(String[] args) {
		// 키보드로 입력받는 클래스(객체) - 다 사용하면 닫아야 한다
		// 전역변수 static 변수로 선언해서 사용하는 경우 close() 시키지 않아도 된다.
		Scanner scanner = new Scanner(System.in);
		// 숫자 1 입력 메시지
		System.out.print("첫번째 숫자를 입력하세요.");
		// 숫자 1 입력
		String strNum1 = scanner.nextLine();
		// 숫자 2 입력 메시지
		System.out.print("두번째 숫자를 입력하세요.");
		// 숫자 2 입력
		String strNum2 = scanner.nextLine();
		
		// 문자열을 숫자로 변환한다.
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		// 연산하고 출력한다
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
		
		// 스캐너 닫기
		scanner.close();
	}
}
