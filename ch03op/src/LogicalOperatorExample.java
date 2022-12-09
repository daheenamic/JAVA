
public class LogicalOperatorExample {
	public static void main(String[] args) {
		
		// 논리 연산 - &, && : 둘 다 맞으면 true. |,|| : 둘 중에 하나만 맞으면 true.
		// && : 앞에 있는 것이 틀리면 뒤에는 비교하지 않는다. || : 앞에가 맞으면 뒤에는 비교하지 않는다.
		int charCode = 'A'; // char -> int에 넣음(자동 형변환).
		
		// 'A'=65, 'Z'=90
		if((charCode>=65)&(charCode<=90)) {
			System.out.println("대문자 이군요");
		}
		// 'a'=97, 'z'=122
		if((charCode>=97)&(charCode<=122)) {
			System.out.println("소문자 이군요");
		}		
		// '0'=48, '9'=57
		if(!(charCode<48)&(charCode>57)) {
			System.out.println("0~9 숫자 이군요");
		}	
		int value = 6;		
		if((value%2==0)|(value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}		
		if((value%2==0)||(value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}
	}
}
