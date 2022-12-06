
public class NoticeViewService implements NoticeViewServiceInterface {

	public NoticeVO service(long no) {
		System.out.println("NoticeViewService. service(). no : " + no);
		System.out.println("공지 보기 처리를 하였습니다.");
		return null;
	}
}
