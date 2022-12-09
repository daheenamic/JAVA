
public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "가나다";
		String strVar2 = "가나다";
		String strVar3 = new String("가나다");
		
		// 동일한 객체를 참조하는지 확인
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		
		// hashCode = 해시 알고리즘에 의해 생성된 정수 값
		// 입력한 값을 기준으로 참조한 주소값을 받아온다. - 값이 같으면 똑같은 숫자가 나온다.
		System.out.println(strVar1.hashCode()); // 43761996
		System.out.println(strVar2.hashCode()); // 43761996
		System.out.println(strVar3.hashCode()); // 43761996
		
		// 주소값을 기준으로 주소값을 받아온다.
		System.out.println(System.identityHashCode(strVar1)); // 366712642
		System.out.println(System.identityHashCode(strVar2)); // 366712642
		System.out.println(System.identityHashCode(strVar3)); // 1829164700
		
		// 문자열이 같은지 확인
		// 문자열 비교는 String 안에 비교 메서드를 사용한다. 변수명.equals(비교할변수명);
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}