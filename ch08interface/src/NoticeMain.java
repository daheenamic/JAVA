public class NoticeMain {

	public static void main(String[] args) {
		
		NoticeListService noticeListService = new NoticeListService();
		noticeListService.service();
		System.out.println(noticeListService.getClass().getSimpleName());
		
		// NoticeListServiceInterface 인터페이스 작성하고 인터페이스로 실행.
		NoticeListServiceInterface listServiceInterface = new NoticeListService();
		listServiceInterface.service();
		
		// NoticeViewService의 인터페이스 작성하고 인터페이스로 실행 해 보세요.
		NoticeViewServiceInterface viewServiceInterface = new NoticeViewService();
		viewServiceInterface.service(2);
		
		// NoticeWriteServiceInterface의 인터페이스 작성하고 인터페이스로 실행 해 보세요.
		NoticeWriteServiceInterface writeServiceInterface = new NoticeWriteService();
		NoticeVO vo = new NoticeVO();
		// 데이터 수집 생략
		writeServiceInterface.service(vo);
	}
}
