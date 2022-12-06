import java.util.List;

public class NoticeListServiceImpl implements ServiceInterface {

	// 공지 리스트 서비스로 넘어오는 데이터는 없다. -> null을 넘긴다.
	@Override
	public List<NoticeVO> service(Object obj) {
		System.out.println("공지 리스트 처리 함.");
		return null;
	}

}
