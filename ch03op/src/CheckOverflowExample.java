// 숫자 연산을 한 결과가 int 범위를 벗어나면 오류를 발생시키고 범위 안에 있으면 출력한다.
public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}		
	}
	public static int safeAdd(int left, int right) {
		if((right>0)) { // 양수처리
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else { // 음수와 0의 처리
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}		
		return left + right;
	}
}