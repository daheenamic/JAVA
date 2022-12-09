// 변수를 선언해서 정수를 넣은 후 10을 더한 결과를 출력하시오.
// 공공의 여러개를 모아{~} 놓은 변수 예제
public class VariableExample {
	
	// 처음 시작하는 부분 - main()
	// 공공의 주소가 움직이지 않는 비어있는 main method의 선언 (문자열 여러개[] 변수선언)
	public static void main(String[] args) {
		// 10의 데이터 특성 : 정수, 작은 숫자, 연산 -> int로 선언
		// int type-4byte 크기로 잡는다. 이름이 value 소문자로 시작. ==> 변수의 선언
		// = 10 : 변수 value에 10을 넣어 주세요. 변수를 선언하면서 맨 처음 값을 넣는 작업을 초기화 라고 한다.
		int value = 10;		
		
		int result = value + 10;
		// System class 안에 out 변수의 println이라는 처리문		
		System.out.println(result);
	}
}
