// 1부터 10까지 출력하는 프로그램

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		
		// 반복문 처리의 변수는 i,j,k... 로 사용한다.
		// for (초기값; 반복처리조건; 증감)
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
//		System.out.println(i);
		// for문 밖에서는 for문 안에서 선언된 변수를 사용할 수 없다.
		
		int i = 1; // 초기값
		for(; i<=10; i++) { // for(; 조건; 증감)
			System.out.println(i);
		}
		// for문 밖에서 선언 됐으므로 변수 i사용가능.
		System.out.println(i);
		
		i = 1; // 초기값
		for(; i<=10;) { // for(; 반복처리조건 ;)
			// 처리
			System.out.println(i);
			// 증감
			i++;
		}
		
		i = 1;
		for(;;) { // for(;;) - 무한 반복
			// 빠져나가는 조건
			// break; - switch, for, while문을 빠져나간다.
			if(i > 10) // i가 10보다 커지면
				break; // 빠져나가라.
			System.out.println(i);
			i++;
		}
	}
}
