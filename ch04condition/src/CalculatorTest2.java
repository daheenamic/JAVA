import java.util.Scanner;

public class CalculatorTest2 {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("첫번째 숫자를 입력하세요: ");
	String str1 = scanner.nextLine();
	
	System.out.print("연산 기호중 하나를 입력하세요. 예) +,-,/,*,% : ");
	String op = scanner.nextLine();
	
	System.out.print("두번째 숫자를 입력하세요: ");
	String str2 = scanner.nextLine();
	
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
	
	if(op.equals("+")) {
		System.out.println(num1 + op + num2 + "=" + (num1+num2));
	} else if(op.equals("-")) {
		System.out.println(num1 + op + num2 + "=" + (num1-num2));
	} else if(op.equals("/")) {
		System.out.println(num1 + op + num2 + "=" + (num1/num2));
	} else if(op.equals("*")) {
		System.out.println(num1 + op + num2 + "=" + (num1*num2));
	} else if(op.equals("%")){
		System.out.println(num1 + op + num2 + "=" + (num1%num2));
	} else {
		System.out.println("잘못 된 연산 기호 입니다.");
	}
}

}