
package single;

public class Singleton {
	
	// 생성해서 넣는다. -> 바로 접근해서 수정하거나 가져갈 수 없다.
	private static Singleton singleton = new Singleton();

	// 다른 곳에서는 생성할 수 없다. -> 생성자를 만들어야하고, 같은 클래스에서만 접근한다. private
	private Singleton() {
		
	}
	
	// 가져가는 메서드 getter
	// Singleton.getInstatnce()로 가져간다.
	public static Singleton getInstance() {
		return singleton;
	}
}
