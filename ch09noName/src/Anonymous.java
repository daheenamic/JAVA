
public class Anonymous {
	
	// 인터페이스를 상속 받은 클래스를 생성해서 인터페이스를 넣어준다.
	// 클래스를 만드는 목적 - 중복이거나 복잡할 때 -> 재사용 할 수 있다.
	// 만약에 여기서 한 번만 사용한다면 굳이 클래스를 만들 필요 없이 실행하는 것을 구현해서 저장 후 사용한다.
	// -> 이벤트 처리에 많이 사용.
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		
	}; // end of field
	
	// 같은 패키지여서 public 생략함
	void method1() {
		
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
			
		}; // end of localVar
		
		localVar.turnOn();
		
	} // end of method1

	void method2(RemoteControl rc) {
		rc.turnOn();
	}
} // end of Anonymous Class
