// 작은 숫자를 저장하는 변수에 값을 넣었다가 그대로 출력하기 (5개)
// +3 한 후에 변수에 저장하고 출력

// 공공의 모아둔 이름 ByteExample - 맨 앞은 대문자로 시작, 의미가 달라지면 앞에 대문자 (낙타식 표기법)
public class ByteExample {

	// 시작하는 메서드 main()
	// 공공의 고정 없다 main() 메서드 선언
	public static void main(String[] args) {
		// 변수 선언하고 초기값으로 -128을 넣었다.
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128; 컴파일 에러, byte 유효 범위 -128~127
		
		// int 데이터를 byte 데이터로 강제 형변환
		byte var7 = (byte) (var4 + 3);

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var7);
	}
}
