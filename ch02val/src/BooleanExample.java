// 내부에 데이터를 저장해서 중지 또는 진행을 선택한다.
public class BooleanExample {	
	public static void main(String[] args) {
		boolean stop = true; // true, false 데이터를 저장하는 타입 boolean
		
		// 맞는지 틀린지 물어보는 처리문 if(조건) {true일 때 실행하는문} else {false일 때 실행하는문}
		if(stop) {
			System.out.println("중지합니다.");
		}
		else {
			System.out.println("시작합니다.");
		}
		
		System.out.println(args);
		if(args.length > 0) { // 전달된 값의 변수 args의 길이가 0보다 커야 출력할 수 있다.
			System.out.println("args[0]:에 전달된 값: " + args[0]);
		}
	}
}