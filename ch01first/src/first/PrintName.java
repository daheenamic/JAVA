// 단축키 ^=ctrl, ~=Shift, @=Alt
// ^A - 전체 선택, ^C - 복사, ^V - 붙여넣기, ^X - 오려두기
// 클릭 - 커서이동, 더블클릭 - 한 단어 선택, 트리플클릭 - 한 줄 선택, ~클릭 - 커서의 위치부터 클릭한 곳 까지 블록 지정
// ^방향키 - 한 단어씩 이동, ^BS - 커서 앞 한 단어 삭제, ^D - 한 줄 지우기, ^Del - 커서 뒤한 단어 삭제, ^Z - 실행 취소, ^Y - 취소를 취소
// ^@위아래방향키 - 위나 아래로 복사, @위아래 방향키 - 선택한 코드가 이동.
//	 : 모니터 단축키가 우선 적용이 된다. (^@위 방향키는 모니터 위아래를 바꿈, 모니터 단축키 설정안함으로 바꿈)
// 마우스를 코드에 가져다 놓으면 설명이 나온다. ^SP - 코드 지원해 준다.

//현재 작성 프로그램이 위치해 있는 곳
package first;

// import - 다른 패키지(위치)에 있는 프로그램을 사용하기 위해 소스에 포함시키기. java.lang 패키지는 생략 가능.
// import를 쓰지 않으면 다른 패키지 사용시마다 앞에 java.util.을 붙어야 함
import java.util.Date;

// 모든 코드는 class로 지정해서 작성한다.
public class PrintName {

	
	public static void main(String[] args) { // 대문자로 되어있는건 앞에 java.lang이 생략되어 있음
		System.out.println("정다희");
		System.out.println(new Date());
	}
}
