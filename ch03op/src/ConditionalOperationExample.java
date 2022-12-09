// 점수를 가지고 등급을 출력하는 프로그램 작성
// A:90~100, B:80~89, C:70~79, D:60~69, F:0~59
// 100초과 : O, 0미만 : U
public class ConditionalOperationExample {
	public static void main(String[] args) {
		
		//점수
		int score = 70;
		// 등급
		// 조건 연산자 또는 삼항 연산자 => (조건) ? 참 : 거짓
		char grade = (score>100) ? 'O' : (score>=90) ? 'A' : (score>=80) ? 'B' : 
			(score>=70) ? 'C' : (score>=60) ? 'D' : (score> 0)  ? 'F' : 'U';
		
		System.out.println(score + "점은 "+ grade + "등급입니다.");
		
		// 조건문을 사용한 등급 계산
		if(score>100) grade ='O'; // 100보다 크다
		else if(score >= 90) grade='A';
		else if(score >= 80) grade='B';
		else if(score >= 70) grade='C';
		else if(score >= 60) grade='D';
		else if(score >= 0) grade='F';
		else grade = 'U';
		System.out.println("점수: "+score+", 등급: "+grade);
	}
}