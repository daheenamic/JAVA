
public class DoublePrintExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 4 != 0) {
				continue; // 4의 배수가 아니면 반복 처리 되는 시작 위치로 올라간다.
			} // end of if

			System.out.println(i); // 4의 배수가 맞다면 밑으로 내려와서 출력.

		} // end of for

	} // end of main()

} // end of class