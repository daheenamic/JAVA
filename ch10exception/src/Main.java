
public class Main {

	// args로 데이터가 들어오지 않고 있다.
	public static void main(String[] args) {
		System.out.println("시작");
		
		// args 출력 해 본다.
		System.out.println(args);
		if (args != null) {
			// args의 데이터 갯수 출력
			System.out.println(args.length);
			// if (args != null && args.length >=2)
			if (args.length >= 2) {
				// 처리한다. - args 변수로 들어오는 데이터 2개 출력
				System.out.println(args[0]);
				System.out.println(args[1]);
			}
		}
		 
		System.out.println("끝");
		
		// 예외 처리를 이용하여 처리가 중간에 중단되지 않고 끝까지 처리되게 하기.
		System.out.println("\n또 다른 시작");
		
		// 데이터에 이상이 있는 경우 / null이 생길 수 있는 경우 / 외부의 자원을 사용하는 경우 예외처리를 한다.
		try { // 정상처리 - 원하는 처리 : 예외가 발생하면 적당한 예외 객체를 생성하고 던진다. (throw)
			System.out.println(args[0]); // 여기서 예외가 발생되어서 그 밑으로 실행이 안된다.
			System.out.println(args[1]); // 여기까지 안오고 바로 catch로 간다.
		} catch (ArrayIndexOutOfBoundsException e) { // 예외처리 - 위에서 발생한 예외 객체와 같은 예외만 받는다. (catch)
			
//			e.printStackTrace(); // 개발자를 위한 코드
			System.out.println(e.getMessage());
			StackTraceElement[] stes = e.getStackTrace();
			for (StackTraceElement ste : stes)
				System.out.println(ste);
			
			System.out.println("예외가 발생되었습니다."); // 사용자를 위한 코드
		}
		
		System.out.println("또 다른 끝");
	}

}
