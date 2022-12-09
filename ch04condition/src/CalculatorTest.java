import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) throws Exception {
	//키보드 입력 객체
	Scanner scanner = new Scanner(System.in);
	
	// 첫번째 숫자 입력
	System.out.println("첫번째 숫자를 입력하세요.");
	String strNum1 = scanner.nextLine();
	int num1 = Integer.parseInt(strNum1);
	
	// 두번째 숫자 입력
	System.out.println("두번째 숫자를 입력하세요.");
	String strNum2 = scanner.nextLine();
	int num2 = Integer.parseInt(strNum2);
	
	// 연산자 입력
	System.out.println("연산자를 입력하세요");
	String op = scanner.nextLine();
	
	// 연산 결과 저장 변수
	int result = 0;
	if (op.equals("+")) result = num1 + num2;
	else if (op.equals("-")) result = num1 - num2;
	else if (op.equals("*")) result = num1 * num2;
	else if (op.equals("/")) result = num1 / num2;
	else if (op.equals("%")) result = num1 % num2;
	else { 
		scanner.close();
		throw new Exception("잘못된 연산자 입니다."); 
		}
	System.out.println(num1 + op + num2 + "=" + result);
	}
}