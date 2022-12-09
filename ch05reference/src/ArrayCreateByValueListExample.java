import java.util.Arrays;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {

		// int 배열 - int 데이터가 여러개. index : 0~2, length = 3
		
		// 초기값을 세팅할때만 배열 안의 값을 바꿀 수 있다. 그 이후에 다시 세팅 하려면 new를 써야된다.
		int[] scores = { 83, 90, 87 }; // 초기에 값을 모두 알고 있는 경우
//		int scores [] = { 83, 90, 87 }; // 대괄호는 뒤에 써도 됨

		// 위의 코드를 풀어쓴 코드
//		int scores[];
//		scores = new int[3]; // new - 메인 메모리에 자리가 생긴다. 4(int의 크기) * 3(배열의 길이) 바이트 크기가 된다.
//		scores[0] = 83;
//		scores[1] = 90;
//		scores[2] = 87; 

//		System.out.println(scores); // 객체의 타입 @hashcode 값이 나타난다.
//		System.out.println("scores[0] : " + scores[0]); // 배열의 첫번째 데이터 출력
//		System.out.println("scores[1] : " + scores[1]); // 배열의 두번째 데이터 출력
//		System.out.println("scores[2] : " + scores[2]); // 배열의 세번째 데이터 출력
		System.out.println("scores 배열의 길이 : " + scores.length);

		// 모든 값을 출력
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println("scores["+i+"] : "+scores[i]);
//		}

		// 향상된 for문 (iterator for문)
		for (int score : scores) {
			System.out.println(score);
		}

		// 배열 scores 안에 모든 데이터를 더하자. 합계 구하기. - 갯수가 정해져 있다.

		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}

		for (int score : scores)
			sum += score;
		System.out.println("합계 : " + sum);

		// 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		
		// 배열 출력
		System.out.println(Arrays.toString(scores));

	} // end of main()

} // end of class
