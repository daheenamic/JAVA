
public class NoticeViewServiceImpl implements ServiceInterface{

	@Override
	// 리턴 타입은 맘대로 설정 가능하나 parameter는 Object로 받아야 한다.
	public NoticeVO service(Object obj) {
		Long no = (Long) obj; // 형변환
		System.out.println("글번호: " + no + ", 글보기 처리함.");
		return null;
	}
}