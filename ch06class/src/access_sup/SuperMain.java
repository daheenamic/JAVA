package access_sup;

public class SuperMain {

	public static void main(String[] args) {
		Super sup = new Super();
		
		// priX 변수는 Super 클래스 안에서만 접근 가능. 다른 클래스에서 사용이 안됨.
//		System.out.println(sup.priX);
		System.out.println(sup.defX);
		System.out.println(sup.proX);
		System.out.println(sup.pubX);
		
		Sub sub = new Sub();
		// priX 변수는 Super 클래스 안에서만 접근 가능. 다른 클래스에서 상속이 안됨.
//		System.out.println(sub.priX);
		System.out.println(sub.defX);
		System.out.println(sub.proX);
		System.out.println(sub.pubX);
	}
}
