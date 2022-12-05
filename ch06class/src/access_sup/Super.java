package access_sup;

public class Super {
	
	private int priX = 100;		// 내 클래스에서만 사용 가능
	int defX = 200;				// 같은 패키지에서 사용 가능
	protected int proX = 300;	// 다른 패키지에서 상속 가능. 상속 없이 사용은 불가능. 상속 받은 클래스는 사용 가능.
	public int pubX = 400;		// 다른 패키지에서 사용 가능.
	
}