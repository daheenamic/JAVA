
public class SmartPhone extends Phone{
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// 전화기 - 전화 거는 용도 -> 인터넷 사용 추가.
	public void internetSearch() {
		if (!power) {
		System.out.println("전원을 켜야 합니다.");
		return;
		} else {
		System.out.println("인터넷 검색을 합니다.");
		}
	}
	@Override // 추상 메서드의 재정의
	public void call() {
		System.out.println("스마트폰으로 전화를 건다.");	
	}
}