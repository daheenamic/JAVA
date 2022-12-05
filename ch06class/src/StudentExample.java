
public class StudentExample {

	public static void main(String[] args) {
		
		// 참조형 변수 - 주소로 운영
		// new Student() -> 생성자를 이용해서 생성한다. 주소를 s1에 저장한다.
		Student s1 = new Student(); 
		System.out.println("s1 변수에 Student 객체를 생성해서 저장합니다.");
		System.out.println("s1의 hashcode 값 : " + s1); // s21의 toString() 호출해서 문자열로 만든다음 출력한다.
		System.out.println("s1의 identityHashCode 값 : " + System.identityHashCode(s1) + "\n");
		
		// new Student() -> 생성자를 이용해서 생성한다. 주소를 s2에 저장한다.
		Student s2 = new Student();
		System.out.println("s2 변수에 또 다른 Student 객체를 생성해서 저장합니다.");
		System.out.println("s2의 hashcode 값 : " + s2.toString());
		System.out.println("s2의 identityHashCode 값 : " + System.identityHashCode(s2) + "\n");
		
		// 주소값이 같은지 확인
		if(s1 == s2) {
			System.out.println("s1과 s2의 주소는 같다.");
		} else {
			System.out.println("s1과 s2의 주소는 같지 않다.");
		}
	}
}
