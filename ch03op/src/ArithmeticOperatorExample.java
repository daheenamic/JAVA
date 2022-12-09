public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1="+result1);
		
		int result2 = v1 - v2;
		System.out.println("result2="+result2);
		
		int result3 = v1 * v2;
		System.out.println("result3="+result3);
		
		int result4 = v1 / v2; // int타입이므로 소수점은 제외하고 나온다.
		System.out.println("result4="+result4);
		
		int result5 = v1 % v2; // v1과 v2를 나눈 나머지 값을 구하는 연산
		System.out.println("result5="+result5);
		
		double result6 = (double) v1 / v2; // 소수점까지 구하고 싶으면 double 타입으로 강제 형변환
		System.out.println("result6="+result6);	
	}
}
