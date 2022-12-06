
public class ServiceMain {
	
	public static void main(String[] args) {
		
		// 공지 리스트 실행
//		ServiceInterface service = new NoticeListServiceImpl();
//		System.out.println(service);
//		service.service(null);
//		service = new NoticeViewServiceImpl();
//		System.out.println(service);
//		service.service(2L); // no가 Long 타입이라서 숫자 뒤에 L을 붙여야 에러가 안남.
		run (new NoticeListServiceImpl(), null);
		run (new NoticeViewServiceImpl(), 2L);
	}
	
	// service 인터페이스로 실행하는 메서드 작성
	public static Object run(ServiceInterface service, Object obj) {
		System.out.println("실행되는 객체 : " + service);
		System.out.println("넘겨주는 데이터 : " + obj);
		// 실제적인 실행
		Object result = service.service(obj);
		System.out.println("처리 결과 : " + result);
		return result;
	}

}
