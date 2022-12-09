
public class LongExample {

	public static void main(String[] args) {
		
		// 데이터 저장 변수 - 데이터의 특성 타입
		// 10, 20, 100000000000
		// byte - short - int(20억+a) - long
		long var1 = 10;
		long var2 = 20L; // 반드시 long 타입으로 처리를 해야만 한다. 20을 long 타입으로 인식해 달라고 요청.
//		long var3 = 100000000000; // 정수를 작성하면 int라고 생각을 한다. 그래서 int 범위를 넘는 데이터는 오류
		long var4 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
		// 허용 범위를 넘어가는 숫자의 처리는 문자열로 한다.
	}
}
