// 인터페이스 하나로 합치기
// 모든 서비스 프로그램은 ServiceInterface를 상속 받도록 한다.
public interface ServiceInterface {
	
	// 넘어가는 값이 다 틀리면 Object 타입으로 넘긴다
	public Object service(Object obj);
}
