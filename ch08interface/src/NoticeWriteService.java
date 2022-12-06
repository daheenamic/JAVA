
public class NoticeWriteService implements NoticeWriteServiceInterface{
	
	public int service(NoticeVO vo) {
		System.out.println("공지 등록 처리를 하였습니다.");
		return 0;
	}
}