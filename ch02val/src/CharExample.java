// 문자열 하나를 저장해서 문자로 출력하고 숫자(문자코드값-숫자)로 출력해 보자.
// 문자 데이터를 표시할 때 ''(따옴표 사용)
// 문자열(문자 여러개 - String) 데이터를 표시할 때 ""(쌍따옴표 사용)
public class CharExample {
	
	// 시작하는 main() 선언
	public static void main(String[] args) {
		
		// 진수
		// 2진수 - 숫자 2개로 운영(0,1)
		// 8진수 - 숫자 8개로 운영(0~7)
		// 16진수 - 숫자 16개로 운영 (0~15 : 0~F / 10부터 A)
		// 문자열 변수 선언. 초기값 세팅 문자열 A에 대한 값
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';	 // 유니코드
		// 문자열 변수 선언. 초기값 세팅 문자열 가에 대한 값
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';	 // 유니코드
		
		// 작은 범위의 데이터에서 큰 범위의 데이터로 전달하면 데이터가 누락되거나 변형되지 않기 때문에 자동 형변환
		int uniCode = c1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println((int)c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println((int)c6);
		System.out.println(uniCode);
		System.out.println((char)uniCode);
		
		// 대문자 A(숫자로 보면 65 입니다.) 65부터 74까지 문자로 출력 해 보자
		for (int i=65; i<=74; i++) {
			System.out.println((char)i + " - " + i);
		}
		
		System.out.println((int)'a');
	}
}
