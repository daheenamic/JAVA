/*
 * 소수점이 있는 데이터 저장과 출력 -> 기본은 double
 */
// public - 공공의, class - 여러개
public class FloatDoubleExample {
	
	// 시작 메서드 - main()
	public static void main(String[] args) {
		
		double var1 = 3.14;
//		float var2 = 3.14;  // 소수점이 있으면 기본이 double(8byte)로 인식하기 때문에 float(4byte)로 넣을 수 없다. 
		float var2 = 3.14F; // F를 넣어서 float 데이터 명기. 혹은 (float)3.14;
		
		// 정밀도 테스트
		double var3 = 0.1234567890123456789;
		float var4 = 0.1234567890123456789F;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2); // F는 출력이 안되고 데이터만 출력
		System.out.println("var4: " + var3);
		System.out.println("var5: " + var4);
		
		// e - 지수승 표시 : 실수 타입으로만 저장된다.
		int var5 = 3000000;
		double var6 = 3e6; // 3 * 10의 6승
		float var7 = 3e6F;
		double var8 = 2e-3; // 2 * 10의 -3승
		System.out.println("var6: " + var5);
		System.out.println("var7: " + var6);
		System.out.println("var8: " + var7);
		System.out.println("var9: " + var8);		
	}
}