
public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}
	
	// 호출되서 실행되는 메서드
	public static void findClass() throws ClassNotFoundException {
		// 클래스를 찾는 코드 작성
		Class clazz = Class.forName("java.lang.String2");
	}

}
