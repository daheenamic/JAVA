package access_sub;

// 다른 패키지에 있는 클래스를 상속 받으려면 import문이 필요하다.
import access_sup.Super;

// Super에 있는 것은 그대로 받아서 확장 시킨다. -> 상속한다.
public class Sub extends Super{	
	
	// protected 변수인 경우 사용 가능 한가?
	void print() {
		System.out.println(proX); // 상속해서 사용은 가능 하다.
	}

}
