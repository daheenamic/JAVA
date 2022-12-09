package com.dahee.main;

public interface ServiceInterface {
	
	// public : 패키지가 다름
	// Object : 전달되는 값의 형태가 전부 다름 
	// service : 메서드 이름
	// Object obj : 전달되는 값이 다르다
	// 실행하려는 Execute의 run()에서 받아서 처리하려고 한다.
	// 공통으로 사용하는 부모 클래스나 부모 인터페이스를 만들어서 전달(상속) 받도록 한다.
	public Object service(Object obj);

}
