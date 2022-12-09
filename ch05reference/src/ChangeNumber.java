
public class ChangeNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a="+a+", b="+b);
		
		// a와 b의 값을 바꾸는 처리 프로그램 작성	
		int tmp = a;
		a = b;
		b = tmp;

		System.out.println("a="+a+", b="+b);
	}
}