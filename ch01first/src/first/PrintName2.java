// package 꾸러미 - 많은 걸 담아서 묶어 둔다. = 폴더 
// package 안에 package -> package.package = 폴더\폴더
// package는 전체 소문자로 만든다.
// 명령어나 선언이 끝나면 ";"을 찍는다.
package first;

//[ ] - 대괄호, { } - 중괄호, ( ) - 괄호
//{ } - 블라켓 : 묶을 때 --> 많다.(0개 이상)
//public class는 한개만 만들 수 있고 파일이름과 반드시 같아야 합니다.
public class PrintName2 {

	// 자바의 시작 부분 - main 메서드 : Project에서는 한개만 만든다.
	// 교재에서는 main을 아주 많이 만든다. -> 실행하고자 하는 main에 가서 실행
	// String class - 문자열 처리
	// [] - 여러개
	// args는 변수 이름 - 변경 가능
	public static void main(String[] args) {
		
		// System - 시스템에 대한 프로그램이 되어 있는 클래스
		// System.out - System 클래스 안에 out 변수가 있다.
		// println() - 출력하고 라인을 바꾸는 처리가 되어 있는 메서드
		System.out.println("정다희");

	}

}
