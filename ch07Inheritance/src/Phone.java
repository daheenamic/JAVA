// 추상 메서드를 가지고 있는 클래스 - 추상 클래스
public abstract class Phone {
	
	// 필드(field) = 속성(attribute) = 변수
	public String owner;
	
	public boolean power = false;
	
	// 생성자 - 폰의 사용자 등록 (생성하기 전에 반드시 필요한 데이터)
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메서드 - 전원을 켜다
	public void turnOn() {
		power = true;
		System.out.println("폰 전원을 켭니다.");
	}
	
	// 메서드 - 전원을 끄다
	public void turnOff() {
		power = false;
		System.out.println("폰 전원을 끕니다.");
	}
	
	// 추상 메서드 - 전화 걸기 : { }가 없다.
	// 추상메서드는 abstract라는 키워드를 반드시 작성해야 한다.
	public abstract void call();	
}