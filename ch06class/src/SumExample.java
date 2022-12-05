
public class SumExample {

	public static void main(String[] args) {
		
		int[] scores = {100,200};
		System.out.println(addArray(scores));
		
		// 위의 코드를 한 줄로 요약
		System.out.println(addArray(new int[] {100, 200}));
		System.out.println(addVars(100,200,300));
//		System.out.println(addArray(addArray(100,200,300));
//		에러. addArray의 리턴 타입은 배열이고, addVars의 리턴타입은 int라서 리턴 타입이 달라서 오류가 난다
}
		

	// 데이터의 개수가 유동적인 정수형 데이터들의 합계를 처리하는 메서드
	// 배열 처리
	public static int addArray(int[] scores) {
		int sum = 0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	// 넘어오는 데이터를 ,를 이용해서 여러 데이터를 넘긴다.
	// ... 개수가 유동적인 데이터 -> 맨 마지막에 사용해야만 한다.
	public static int addVars(int ...scores) {
		int sum = 0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
