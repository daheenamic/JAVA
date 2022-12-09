import java.util.Calendar;

enum Week {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		System.out.println(today);

		Calendar cal = Calendar.getInstance();
		// getInstance() 메서드인 경우 - new하고 주소를 넘겨주는 메서드 (오늘 날짜)
		
		// cal에서 요일 정보(7)를 가져온다. 1-일요일, 2-월요일 ... 7-토요일
		int week = cal.get(Calendar.DAY_OF_WEEK); // DAY_OF_WEEK - final 변수
		System.out.println(week);

		switch (week) {

		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 : "+today);
		
		String [] weeks = {"요일","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		// 0은 안쓰기 때문에 그냥 요일이라고 쓰거나 아님 비워두어도 됨.
		System.out.println("오늘의 요일은 " + weeks[week] +" 입니다.");
		// 현재 week는 3이기 때문에 화요일이 나옴. weeks[3]
		
		if(today == Week.TUESDAY) {
			System.out.println("화요일");
		} else {
			System.out.println("화요일 아님");
		}
	}
}
