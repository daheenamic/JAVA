
public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		// 추상으로 되어 있는 클래스는 객체를 바로 생성할 수 없다. -> 코드가 미완성
//		Phone phone = new Phone("홍길동");
		
		Phone phone = smartPhone; // 자식 클래스 -> 부모클래스 : 자동 형변환
//		phone.internetSearch();
		// phone의 타입이 Phone이라서 internetSearch() 메서도를 호출할 수 없다.
		
		SmartPhone phone2 = (SmartPhone)phone; // 부모클래스 -> 자식클래스 : 강제 형변환
		phone2.internetSearch();
		// phone2의 타입이 SmartPhone이라서 internetSearch() 메서드를 호출할 수 있다.		
	}
}