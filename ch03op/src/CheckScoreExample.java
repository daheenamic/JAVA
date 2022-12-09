/* 점수가 0~100 사이에 있지 않으면 오류를 발생 시키고
 * 그렇지 않으면 점수를 출력하는 프로그램 작성
 * 점수 -1, 0, 100, 101로 테스트 */
public class CheckScoreExample {
	
	//시작
	public static void main(String[] args) {
		System.out.println("시작");
		// 변수 선언
		int score = -2;
		int safeScore = 0;
		// 예외처리 구조
		try { // 정상처리 
			safeScore = checkScore(score);
			
		} catch (ArithmeticException e) { // 예외처리
			System.out.println(e.getMessage());
			safeScore = score;
			
		} finally { // 정상처리나 에외처리를 한 후 반드시 실행되는 처리문
			System.out.println("입력 점수: " + safeScore);
		}
		System.out.println("끝");
	}
	// 점수 체크
	public static int checkScore(int score) {
		
		// 점수체크 - 0보다 적거나 100보다 크면 안된다.
		if(score < 0) {
			throw new ArithmeticException("점수는 0이상이어야 합니다.");
		} if (score > 100) { 
			throw new ArithmeticException("점수는 100이하이어야 합니다.");
		} 
		return score;	
	}
}
