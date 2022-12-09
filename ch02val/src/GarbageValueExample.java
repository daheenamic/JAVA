// 잘못된 데이터의 처리 확인
public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;	// 최대 127까지만 가능
		int var2 = 125;		// 20억 이상 가능
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1(byte): " + var1 + "  var2(int): " + var2);
		}
	}
}