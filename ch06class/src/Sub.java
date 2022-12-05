// 자식 클래스
// extends - 확장해서 쓴다. -> 상속 : Super 클래스를 상속 받음.
public class Sub extends Super{

	final int NUMBER = 100;
	
	// override (재정의) : final 붙인 메서드는 override 불가.
//	public void print() { // 부모클래스의 메서드와 같이 쓰려면 public을 써야한다
						  // 부모 클래스의 메서드에 final이 붙어서 사용 불가.
	
	public void printData() { 
		super.print(); // 부모 클래스를 먼저 실행하고 출력하고 그 다음 밑의 코드를 출력한다.
		
		// final 변수에는 값을 변경 할 수 없다.
//		number += 100;
		System.out.println(NUMBER);
		
		// 연산은 가능
		int number = NUMBER + 100;
		System.out.println(number);
	}
}