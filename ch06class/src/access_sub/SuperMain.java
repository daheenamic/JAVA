package access_sub;

// 다른 패키지에 있는 클래스를 새로 생성한 객체의 타입으로 사용하려면 import가 필요하다.
import access_sup.Super;

public class SuperMain { 

	public static void main(String[] args) {
		Super sup = new Super();
		
		// priX 변수는 Super 클래스 안에서만 접근 가능. 다른 클래스에서 사용 안됨.
//		System.out.println(sup.priX);
		
		// defX 변수는 같은 패키지 안에서만 접근 가능. 다른 패키지에서 사용 안됨.
//		System.out.println(sup.defX);
		
		// proX 변수는 같은 패키지 안에서만 접근이 가능. 다른 패키지에서 사용 안됨.
//		System.out.println(sup.proX);
		
		System.out.println(sup.pubX);
		
		Sub sub = new Sub();
		// priX 변수는 Super 클래스 안에서만 접근 가능. 다른 클래스에서 상속이 안됨.
//		System.out.println(sub.priX);
		
		// defX 변수는 같은 패키지 안에서만 접근 가능. 다른 패키지에서 상속 안됨.
//		System.out.println(sub.defX);
			
		// proX 변수는 다른 패키지여도 상속을 하면 사용 가능.
		// 상속된 클래스에서는 private 변수로 사용. 다른 클래스에서 접근 불가능.
//		System.out.println(sub.proX);
		
		System.out.println(sub.pubX);
	}
}
