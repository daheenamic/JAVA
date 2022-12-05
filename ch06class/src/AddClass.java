// 메소드 오버로딩

public class AddClass {

	public static void main(String[] args) {
		System.out.println(add(10,10)); // 기본은 int 타입
		System.out.println(add((byte)10, (byte)10));
		System.out.println(add(100L, 100L));
		System.out.println(add(100L, 100));
		// 100L의 타입이 long이어서 뒤의 숫자가 long이 아니더라도(int타입이어도) 100이 long로 자동 형변환 될 수 있으면 add(long, long)로 감.
		System.out.println(add(12.0, 10.0));
		System.out.println(add(12.0, 10));
		// 12.0의 타입이 double이어서 뒤의 숫자가 double이 아니더라도(int타입이어도) 10이 double로 자동 형변환 될 수 있으면 add(double, double)로 감.
		
		// 정확한 데이터가 아니어도 실행 될 수 있고, 오류가 있어도 찾아내기 어려운 단점이 있다. 
		// -> 메서드 이름을 다르게 작성 하는 것을 권장. add(int,int) -> addInt(int,int)
	}
	
	private static byte add(byte x, byte y) {
		System.out.println("AddClass.add(byte, byte)");
		return (byte)(x + y);
	}
	
	private static int add(int x, int y) {
		System.out.println("AddClass.add(int, int)");
		return x + y;
	}
	
	private static long add(long x, long y) {
		System.out.println("AddClass.add(long, long)");
		return x + y;
	}
	
	private static double add(double x, double y) {
		System.out.println("AddClass.add(double, double)");
		return x + y;
	}
}
