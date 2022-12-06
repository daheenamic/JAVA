package com.dahee.main;

public class Execute {
	
	// 서비스를 실행하고 싶다. Excute.run (서비스객체, 전달 변수) { 처리문 }
	// static service를 실행하는 run 메서드 만들기
	public static Object run(ServiceInterface service, Object obj) {
		System.out.println("실행되는 객체 : " + service);
		System.out.println("넘겨주는 데이터 : " + obj);
		// 실제적인 실행
		Object result = service.service(obj);
		System.out.println("처리 결과 : " + result);
		return result;
	}

}
